package com.mugen.SpringBootCRUD.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRUnner(StudentRepository repository){
        return args -> {
            Student abdoulfatah = new Student(
              "Abdoulfatah",
              "smrobla34@gmail.com",
              LocalDate.of(2000, Month.FEBRUARY, 5)
            );

            Student mugen = new Student(
                    "Mugen",
                    "mugen253@gmail.com",
                    LocalDate.of(2004, Month.MARCH, 4)
            );

            repository.saveAll(
                    List.of(abdoulfatah, mugen)
            );

            System.out.println("Hello depuis le CommandLineRunner qui va s'executer apres la methode main");
        };
    }
}
