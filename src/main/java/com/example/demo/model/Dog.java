package com.example.demo.model;

import java.time.LocalDate;
import lombok.Value;

@Value
public class Dog {

  String name;
  LocalDate dob;
}
