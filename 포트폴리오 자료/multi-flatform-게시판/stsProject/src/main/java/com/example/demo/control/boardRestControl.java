package com.example.demo.control;


import java.util.List;
import java.util.Optional;

import org.hibernate.type.IntegerType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.board;
import com.example.demo.repository.boardRepository;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.google.gson.JsonArray;

import net.minidev.json.JSONArray;
import net.minidev.json.JSONObject;


@CrossOrigin
@RestController
public class boardRestControl {
	@Autowired
	private boardRepository boardrepository;
	
	
	@GetMapping(path="/board")
	public List<board> getall(){
		List<board> board=boardrepository.findAll();
		return board;
	}
	
	@RequestMapping(path="/board/{code}")
	public List<board> gets(@PathVariable(name="code") int code ){
		List<board> board=boardrepository.findByCode(code);
		return board;
	}
	
	@GetMapping(path="boardid/{id}")
	public Optional<board> getid(@PathVariable(name="id") int id) {
		Optional<board> board=boardrepository.findById(id);
		return board;
	}
	
	@PostMapping(path="/board")
	public board addboard(@RequestBody board board) {
		return boardrepository.save(board);
	}
	
	
	
	
}
