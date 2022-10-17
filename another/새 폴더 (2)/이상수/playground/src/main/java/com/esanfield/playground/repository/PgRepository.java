package com.esanfield.playground.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.esanfield.playground.dto.ParticipationView;

@RepositoryRestResource (
		excerptProjection = ParticipationView.class,
		path = "dbplayground",
		collectionResourceRel ="dbplayground" 
		
		)
	@CrossOrigin
	public interface PgRepository extends JpaRepository<Content, String>{

}
