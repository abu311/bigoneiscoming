//row 안에 담긴 데이터를 담을 객체. row 안의 객체들과 같은 변수형을 가진 class
/*package com.spring.test.step3;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class UserDto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
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


    public UserDto(Long id, String cancelCount, String cancelValue, String divisionName, String payoffCount, String payoffValue,
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



 */
//DTO 미사용

// xml 형식 제공되는 공공 api의 객체

// xml 형식 + api를 호출하기 위한 변수 (x)
// 로직을 담당하는 모든 것들은 service 종속된다.
// 어쨋든 저러한 변수들을 어떻게 관리할거냐 를 생각할때, dto, vo, 이런쪽에서 할게아니라, service에서부터 시작하자.