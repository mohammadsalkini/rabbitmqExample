package at.fhcampus.rabbitmq.consumer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class FixedRateConsumer {

    @RabbitListener(queues = "se.fixedRate")
    public void listen(String message) {
        log.info("Consuming {}", message);
    }
}
