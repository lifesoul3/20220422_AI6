package com.esanfield.playground.dto;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Participation {

    // 참가자 필드
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)

    private Long ordinalNumber;
    private String name;
    private String content;
    private Date registrationDate;

    // public String getName() {
    //     return name;
    // }
    // public void setName(String name) {
    //     this.name = name;
    // }
    // public String getContent() {
    //     return content;
    // }
    // public void setContent(String content) {
    //     this.content = content;
    // }
    // public Date getRegistrationDate() {
    //     return registrationDate;
    // }
    // public void setRegistrationDate(Date registrationDate) {
    //     this.registrationDate = registrationDate;
    // }
    // public Long getOrdinalNumber() {
    //     return ordinalNumber;
    // }
    // public void setOrdinalNumber(Long ordinalNumber) {
    //     this.ordinalNumber = ordinalNumber;
    // }


} 

