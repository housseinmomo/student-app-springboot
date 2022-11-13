package com.mugen.SpringBootCRUD;

import com.mugen.SpringBootCRUD.student.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@SpringBootApplication
public class SpringBootCrudApplication {

	public static void main(String[] args) {

		SpringApplication.run(SpringBootCrudApplication.class, args);

		System.out.println("Hello Amingcode");
	}

}
