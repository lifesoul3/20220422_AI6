package com.esanfield.playground.dto;

import java.util.Date;

import org.springframework.data.rest.core.config.Projection;

@Projection(name="partView", types=Participation.class)
public interface ParticipationView {

	Long getOrdinalNumber();
	String getName();
	String getContent();
	Date getRegistrationDate();


}
