package com.poc.portfolio.enums;

import lombok.Getter;

@Getter
public enum Designations {
  SDE("Java Developer"), SystemEngineer("System Engineer");

  private final String value;

  Designations(String value) {
    this.value = value;
  }

}
