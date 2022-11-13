package com.jaeshim.lecture;


import org.jetbrains.annotations.Nullable;

public class Person {
  private final String name;

//  @Nullable
  @Nullable
  public String getName() {
    return name;
  }
  public Person(String name) {
    this.name = name;
  }
}
