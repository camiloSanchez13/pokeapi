package com.example.pokemon.model;

import java.util.List;

public class Results {

	private String name;
	private String url;
	
	public Results(String name, String url) {
		super();
		this.name = name;
		this.url = url;
	}
	public Results() {
		super();
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	@Override
	public String toString() {
		return "Results [Nombre =" + name + ", url=" + url + "]";
	}
	
	

	
	
	
}

