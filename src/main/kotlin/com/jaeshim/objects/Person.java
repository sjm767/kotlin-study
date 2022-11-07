package com.jaeshim.objects;


import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class Person {
  private final String name;

//  @Nullable
  @NotNull
  public String getName() {
    return name;
  }
  public Person(String name) {
    this.name = name;
  }
}
