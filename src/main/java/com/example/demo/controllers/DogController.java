package com.example.demo.controllers;

import com.example.demo.model.Dog;
import java.time.LocalDate;
import lombok.SneakyThrows;
import org.jetbrains.annotations.NotNull;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("dog")
public class DogController {

  @NotNull
  @GetMapping
  @SneakyThrows
  public Dog getGog() { //jackson
    return new Dog("Жучка", LocalDate.now());
  }
}
