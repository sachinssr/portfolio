package com.poc.portfolio.enums;

import lombok.Getter;

@Getter
public enum Designations {
  SDE("SDE-1"), SystemEngineer("System Engineer");

  private final String value;

  Designations(String value) {
    this.value = value;
  }

}
