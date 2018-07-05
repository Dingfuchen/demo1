package com.bos.demo1;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class XbTest {

  @Id
  @GeneratedValue
  private Integer id;

  private String yearName;
  private String quarter;
  private String quarterName;

  public XbTest() {
  }


  public Integer getId() {
    return id;
  }
  public XbTest setId(Integer id) {
    this.id = id;
    return this;
  }

  public String getYearName() {
    return yearName;
  }

  public XbTest setYearName(String yearname) {
    this.yearName = yearname;
    return this;
  }


  public String getQuarter() {
    return quarter;
  }

  public XbTest setQuarter(String quarter) {
    this.quarter = quarter;
    return this;
  }


  public String getQuarterName() {
    return quarterName;
  }

  public XbTest setQuarterName(String quarterName) {
    this.quarterName = quarterName;
    return this;
  }

}
