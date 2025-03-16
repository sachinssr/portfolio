package com.poc.portfolio.enums;

import lombok.Getter;

@Getter
public enum FrontendTech {
	Spring("Spring", ExperienceLevel.PROFESSIONAL.name()), Spring_Boot("Spring Boot", ExperienceLevel.PROFESSIONAL.name()), Hibernate("Hibernate",
      ExperienceLevel.EXPERIENCED.name()), Spring_Security("Spring Security", ExperienceLevel.EXPERIENCED.name());

  private final String technology;
  private final String experienceLevel;

  FrontendTech(String technology, String experienceLevel) {
    this.technology = technology;
    this.experienceLevel = experienceLevel;
  }

}
