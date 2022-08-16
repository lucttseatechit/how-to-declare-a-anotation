package com.example.anotaion.controller;

import javax.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.anotaion.entity.Person;

@RestController
public class PersonController {
	@PostMapping("/person")
	public ResponseEntity<?> add(@Valid Person person,BindingResult result){
		if(result.hasErrors()) {
			return ResponseEntity.badRequest().body(result.getAllErrors().get(0));
		}else {
			return ResponseEntity.ok("Chúc bạn tận hưởng");
		}
	}
}
