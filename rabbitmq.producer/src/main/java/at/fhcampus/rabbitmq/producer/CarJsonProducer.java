package at.fhcampus.rabbitmq.producer;

import at.fhcampus.rabbitmq.producer.model.Car;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Service;

@Service
public class CarJsonProducer {

    private final RabbitTemplate rabbitTemplate;
    private final ObjectMapper objectMapper;

    public CarJsonProducer(RabbitTemplate rabbitTemplate, ObjectMapper objectMapper) {
        this.rabbitTemplate = rabbitTemplate;
        this.objectMapper = objectMapper;
    }

    public void sendMessage(Car car) throws JsonProcessingException {
        String jsonCar = objectMapper.writeValueAsString(car);
        rabbitTemplate.convertAndSend("se.cars", jsonCar);
    }
}
