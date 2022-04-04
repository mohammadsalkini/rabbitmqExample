package at.fhcampus.rabbitmq.producer;

import at.fhcampus.rabbitmq.producer.directexchange.Picture;
import at.fhcampus.rabbitmq.producer.directexchange.PictureProducer;
import at.fhcampus.rabbitmq.producer.fanoutexchange.HumanResourceProducer;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

//@EnableScheduling
@SpringBootApplication
public class Application implements CommandLineRunner {
    private final HelloWorldProducer helloWorldProducer;
    private final FixedRateProducer fixedRateProducer;
    private final CarJsonProducer carJsonProducer;
    private final HumanResourceProducer humanResourceProducer;
    private final PictureProducer pictureProducer;

    //private final List<String> TYPES = List.of("jpg", "png", "svg");

    public Application(HelloWorldProducer helloWorldProducer, FixedRateProducer fixedRateProducer, CarJsonProducer carJsonProducer, HumanResourceProducer humanResourceProducer, PictureProducer pictureProducer) {
        this.helloWorldProducer = helloWorldProducer;
        this.fixedRateProducer = fixedRateProducer;
        this.carJsonProducer = carJsonProducer;
        this.humanResourceProducer = humanResourceProducer;
        this.pictureProducer = pictureProducer;
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        //helloWorldProducer.sendHello("Max");




        //fixedRateProducer.sendFixedRateMessage();



        //for (int counter = 1; counter < 6; counter ++) {
         //   Car car = new Car(String.valueOf(counter), "carBrand " + counter, "carModel " + counter);
         //   carJsonProducer.sendMessage(car);
       // }




     //   for (int counter = 1; counter < 6; counter ++) {
      //     Car car = new Car(String.valueOf(counter), "carBrand " + counter, "carModel " + counter);
       //    humanResourceProducer.sendMessage(car);
       //  }



    //       for (int counter = 1; counter < 11; counter ++) {
     //        Picture picture = new Picture();
      //       picture.setName("PictureName " + counter);
     //        picture.setType(TYPES.get(counter % TYPES.size()));
      //       pictureProducer.sendMessage(picture);
    //      }
    }
}
