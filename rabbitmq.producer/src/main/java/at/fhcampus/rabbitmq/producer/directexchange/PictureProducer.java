package at.fhcampus.rabbitmq.producer.directexchange;

import at.fhcampus.rabbitmq.producer.model.Car;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class PictureProducer {
    private final RabbitTemplate rabbitTemplate;
    private final ObjectMapper objectMapper;

    public PictureProducer(RabbitTemplate rabbitTemplate, ObjectMapper objectMapper) {
        this.rabbitTemplate = rabbitTemplate;
        this.objectMapper = objectMapper;
    }

    public void sendMessage(Picture picture) throws JsonProcessingException {
        String jsonPicture = objectMapper.writeValueAsString(picture);
        rabbitTemplate.convertAndSend("fh.picture", picture.getType(), jsonPicture);
    }

}
