package com.gabyferrari.workshopmongo.dto;

import java.io.Serializable;

import com.gabyferrari.workshopmongo.domain.User;

public class AuthorDTO implements Serializable{
	
	//para copiar somente o id e o name e nao os outros objetos do user
	
	private static final long serialVersionUID = 1L;
	
	private String id;
	private String name;
	
	public AuthorDTO() {
	}
	
	public AuthorDTO(User obj) {
		id = obj.getId();
		name = obj.getName();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
