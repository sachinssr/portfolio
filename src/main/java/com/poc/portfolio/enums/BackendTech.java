package com.poc.portfolio.enums;

import lombok.Getter;

@Getter
public enum BackendTech {
  JAVA("JAVA 8", ExperienceLevel.PROFESSIONAL.name()), JAVA_17("JAVA 17",
      ExperienceLevel.INTERMEDIATE.name()), RESTful_APIs("RESTful APIs", ExperienceLevel.PROFESSIONAL.name()), JSP(
          "JSP",
          ExperienceLevel.INTERMEDIATE.name());

  private final String technology;
  private final String experienceLevel;

  BackendTech(String technology, String experienceLevel) {
    this.technology = technology;
    this.experienceLevel = experienceLevel;
  }

}
