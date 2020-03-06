package ru.volnenko.rest.timeserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@SpringBootApplication
public class TimeServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(TimeServerApplication.class, args);
	}

	@GetMapping("/")
	public Date date() {
		return new Date();
	}

}
