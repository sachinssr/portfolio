package com.poc.portfolio.enums;

import lombok.Getter;

@Getter
public enum DevOpsTech {
	Git("Git", ExperienceLevel.PROFESSIONAL.name()), Maven("Maven",
      ExperienceLevel.PROFESSIONAL.name()), Eclipse("Eclipse", ExperienceLevel.PROFESSIONAL
          .name()), Postman("Postman", ExperienceLevel.EXPERIENCED.name()), Agile_Scrum_methodologies("Agile/Scrum methodologies",
              ExperienceLevel.PROFESSIONAL.name()), SPLUNK("Splunk", ExperienceLevel.EXPERIENCED.name());

  private final String technology;
  private final String experienceLevel;

  DevOpsTech(String technology, String experienceLevel) {
    this.technology = technology;
    this.experienceLevel = experienceLevel;
  }

}
