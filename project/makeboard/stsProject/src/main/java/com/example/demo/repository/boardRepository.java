package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.example.demo.dto.board;

@RepositoryRestResource(path="boards")
@CrossOrigin
public interface boardRepository extends JpaRepository<board, Integer>{
	
	List<board> findByCode(int number);
	
	 
}
