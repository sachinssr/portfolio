package com.poc.portfolio.enums;

import lombok.Getter;

@Getter
public enum CloudTech {
  Microsoft_Azure("Microsoft Azure", ExperienceLevel.EXPERIENCED.name());

  private final String technology;
  private final String experienceLevel;

  CloudTech(String technology, String experienceLevel) {
    this.technology = technology;
    this.experienceLevel = experienceLevel;
  }

}
