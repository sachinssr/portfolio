package com.poc.portfolio.enums;

import lombok.Getter;

@Getter
public enum DatabaseTech {
  DB2("DB2", ExperienceLevel.INTERMEDIATE.name()), ORACLEDB("OracleDB",
      ExperienceLevel.INTERMEDIATE.name()), MYSQL("MySQL", ExperienceLevel.PROFESSIONAL.name());

  private final String technology;
  private final String experienceLevel;

  DatabaseTech(String technology, String experienceLevel) {
    this.technology = technology;
    this.experienceLevel = experienceLevel;
  }

}
