package com.poc.portfolio.enums;

import lombok.Getter;

@Getter
public enum Clients {
  METLIFE("Metlife"), TCS("TCS");

  private final String value;

  Clients(String value) {
    this.value = value;
  }

}
