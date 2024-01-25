package com.example.dummyMicroservice.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class POSTRequestDTO {
	@JsonProperty("name")
	private String name;
	
	@JsonProperty("lastName")
	private String lastName;
	
	@JsonProperty("isTrue")
	private boolean isTrue;
	
	@JsonProperty("files")
	private List<String> files;

	@Override
	public String toString() {
		return "POSTRequestDTO [name=" + name + ", lastName=" + lastName + ", istrue=" + isTrue + ", files=" + files + "]";
	}
	
}
