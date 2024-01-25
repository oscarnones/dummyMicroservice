package com.example.dummyMicroservice.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.dummyMicroservice.dto.POSTRequestDTO;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class ReclaimController {
	
	@GetMapping("/get")
	public ModelAndView get(@RequestParam String str) {
		log.info("{}, {}", str, str.getClass().toString());
		ModelAndView modelAndView = new ModelAndView();
	    modelAndView.setViewName("jsp/example.jsp");
	    // Noncompliant: user-supplied parameter might contain malicious content.
	    modelAndView.addObject("preferredColor", str);
	    return modelAndView;
//		return new ResponseEntity<>(str, HttpStatus.OK);
	}
	
	@PostMapping("/post")
	public ResponseEntity<Object> post(@RequestBody POSTRequestDTO postRequestDTO, @RequestParam String str) {
		log.info("{}, {}", postRequestDTO.getClass().toString(), str);
		return new ResponseEntity<>(postRequestDTO, HttpStatus.OK);
	}
}
