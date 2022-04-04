package at.fhcampus.rabbitmq.producer.directexchange;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class Picture {
    private String name;
    private String type;
}
