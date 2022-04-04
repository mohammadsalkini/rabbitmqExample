package at.fhcampus.rabbitmq.consumer.directexchange;

import at.fhcampus.rabbitmq.consumer.model.Car;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class PictureImageConsumer {

    private final ObjectMapper objectMapper;

    public PictureImageConsumer(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    @RabbitListener(queues = "se.picture.image")
    public void listen (String message) throws JsonProcessingException {
        Picture picture = objectMapper.readValue(message, Picture.class);
        log.info("Picture on Image is {}", picture);
    }
}
