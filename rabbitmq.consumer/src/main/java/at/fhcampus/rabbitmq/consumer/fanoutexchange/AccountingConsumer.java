package at.fhcampus.rabbitmq.consumer.fanoutexchange;

import at.fhcampus.rabbitmq.consumer.model.Car;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class AccountingConsumer {

    private final ObjectMapper objectMapper;

    public AccountingConsumer(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    @RabbitListener(queues = "se.hr.accounting")
    public void listen (String message) throws JsonProcessingException {
        Car car = objectMapper.readValue(message, Car.class);
        log.info("Car on accounting is {}", car);
    }
}
