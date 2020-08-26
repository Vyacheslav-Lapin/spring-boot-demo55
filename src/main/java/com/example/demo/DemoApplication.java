package com.example.demo;

import com.example.demo.dao.CatDao;
import com.example.demo.model.Cat;
import java.util.Arrays;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

  @Bean
  ApplicationRunner applicationRunner(CatDao catDao) {
    return __ -> Arrays.stream("Барсик, Мурзик, Мурка, Матроскин".split(", "))
                     .map(Cat::new)
                     .forEach(catDao::save);
  }

}
