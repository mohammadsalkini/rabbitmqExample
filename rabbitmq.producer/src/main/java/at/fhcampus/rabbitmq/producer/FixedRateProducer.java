package at.fhcampus.rabbitmq.producer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class FixedRateProducer {

    private final RabbitTemplate rabbitTemplate;

    public FixedRateProducer(RabbitTemplate rabbitTemplate) {
        this.rabbitTemplate = rabbitTemplate;
    }
    private int number = 0;

    @Scheduled (fixedRate = 500)
    public void sendFixedRateMessage() {
        number ++;
        log.info("Number is: " + number);
        rabbitTemplate.convertAndSend("se.fixedRate", "Fixed rate message number " + number);
    }



}
