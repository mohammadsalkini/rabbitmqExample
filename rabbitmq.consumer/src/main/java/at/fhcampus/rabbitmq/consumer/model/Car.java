package at.fhcampus.rabbitmq.consumer.model;

import lombok.*;

@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Car {
    private String carId;
    private String brand;
    private String model;
}
