package lv.proto.readingsbe;

import lv.proto.readingsbe.entity.Partner;
import lv.proto.readingsbe.repository.PartnerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ReadingsBeApplication {

    public static void main(String[] args) {
        SpringApplication.run(ReadingsBeApplication.class, args);
    }

    @Bean
    public CommandLineRunner demo(PartnerRepository repository) {
        return (args) -> {
            repository.save(new Partner("ag", Boolean.FALSE, "sadasdg", "asdgsad", "asdsadg", null));
        };
    }
}