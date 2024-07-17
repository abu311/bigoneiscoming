package com.spring.test.step1;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class UserDto {
    private Long.id;
    private String cancelCount;
    private String cancelValue;
    private String divisionName;
    private String payoffCount;
    private String payoffValue;
    private String performRacecourseName;
    private String raceDate;
    private String refundCount;
    private String refundValue;
    private String saleCount;
    private String saleRacecourceName;
    private String saleValue;
    private String typeName;
    private String windowCount;

    @urldata
    private int pageNo = 1;
    private int numOfRows = 10;
    private String sale_race = "01";
    private int rc_month = 202407;
    private int rc_date = 20240706;
    private String _type = "xml";

    public UserDto(Long.id, String cancelCount, String cancelValue, String divisionName, String payoffCount, String payoffValue,
                   String performRacecourseName, String raceDate, String refundCount, String refundValue, String saleCount, String saleRacecourceName,
                   String saleValue, String typeName, String windowCount){
        this.id = id;
        this.cancelCount = cancelCount;
        this.cancelValue = cancelValue;
        this.divisionName = divisionName;
        this.payoffCount = payoffCount;
        this.payoffValue = payoffCount;
        this.performRacecourseName = performRacecourseName;
        this.raceDate = raceDate;
        this.refundCount = refundCount;
        this.refundValue = refundCount;
        this.saleCount = saleCount;
        this.saleRacecourceName = saleRacecourceName;
        this.saleValue = saleValue;
        this.typeName = typeName;
        this.windowCount = windowCount;
    }
}