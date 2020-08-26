package com.example.demo.model;

import static lombok.AccessLevel.PUBLIC;

import java.time.LocalDate;
import java.util.List;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder.Default;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Singular;
import lombok.ToString;
import lombok.With;
import lombok.experimental.SuperBuilder;

@With
@Getter
@ToString
@EqualsAndHashCode
@SuperBuilder(toBuilder = true)
@AllArgsConstructor(access = PUBLIC)
public class Dog {

  @Default
  String name = "Шарик";
  LocalDate dob;

  @Singular
  List<String> awards;

  public static void main(String[] args) {
    var puppy = Puppy.builder()
                    //.name("Шарик")
                    .alias("шар")
                    //.awards(List.of("1", "2"))
                    .award("1")
                    .dob(LocalDate.now())
                    .award("2")
                    .build();

    System.out.println("puppy = " + puppy);

//    var puppy1 = puppy.toBuilder().name("Шарище").build();
//    System.out.println("puppy1 = " + puppy1);

    System.out.println("puppy1.withName(\"Шарище!!!\") = " + puppy.withName("Шарище!!!"));
  }
}

//@With
@Getter
@ToString(callSuper = true)
@SuperBuilder(toBuilder = true)
@EqualsAndHashCode(callSuper = true)
class Puppy extends Dog {

  String alias;
}
