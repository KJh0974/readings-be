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
            repository.save(new Partner("John Smith", Boolean.FALSE, "010290-12345", "john.smith@gmail.com", "+37112345678", null));
            repository.save(new Partner("Maria Smith", Boolean.FALSE, "201188-12345", "maria.smith@outlook.com", "+37187654321", null));
        };
    }
}