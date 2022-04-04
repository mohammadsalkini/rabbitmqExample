package at.fhcampus.rabbitmq.producer;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Service;

@Service
public class HelloWorldProducer {
    private final RabbitTemplate rabbitTemplate;

    public HelloWorldProducer(RabbitTemplate rabbitTemplate) {
        this.rabbitTemplate = rabbitTemplate;
    }

    public void sendHello (String name) {
        rabbitTemplate
                .convertAndSend("se.helloWorld", "Hello " + name);
    }
}
