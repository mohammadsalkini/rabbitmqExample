package at.fhcampus.rabbitmq.producer.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@AllArgsConstructor
public class Car {
    private String carId;
    private String brand;
    private String model;
}
