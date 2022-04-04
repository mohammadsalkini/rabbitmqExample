package at.fhcampus.rabbitmq.producer.fanoutexchange;

import at.fhcampus.rabbitmq.producer.model.Car;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class HumanResourceProducer {
    private final RabbitTemplate rabbitTemplate;
    private final ObjectMapper objectMapper;

    public HumanResourceProducer(RabbitTemplate rabbitTemplate, ObjectMapper objectMapper) {
        this.rabbitTemplate = rabbitTemplate;
        this.objectMapper = objectMapper;
    }

    public void sendMessage(Car car) throws JsonProcessingException {
        String jsonCar = objectMapper.writeValueAsString(car);
        rabbitTemplate.convertAndSend("fh.hr", "", jsonCar);
    }

}
