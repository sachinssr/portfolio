package com.poc.portfolio.enums;

import lombok.Getter;

@Getter
public enum Titles {
  SOFTWARE_DEVELOPMENT_ENGINEER("Software Development Engineer"), Java_Developer("Java Developer");

  private final String value;

  Titles(String value) {
    this.value = value;
  }

}
