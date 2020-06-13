package com.example.pokemon.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.JsonNode;

public class Pokemon {

	private int count;
	private String next;
	private boolean previus;
	
	//@JsonProperty("results")
	private ArrayList<Results> results;
	


	public Pokemon(int count, String next, boolean previus, ArrayList<Results> results) {
		super();
		this.count = count;
		this.next = next;
		this.previus = previus;
		this.results = results;
	}



	public ArrayList<Results> getResults() {
		return results;
	}



	public void setResults(ArrayList<Results> results) {
		this.results = results;
	}



	public Pokemon() {
		super();
	}



	public int getCount() {
		return count;
	}



	public void setCount(int count) {
		this.count = count;
	}



	public String getNext() {
		return next;
	}



	public void setNext(String next) {
		this.next = next;
	}



	public boolean isPrevius() {
		return previus;
	}



	public void setPrevius(boolean previus) {
		this.previus = previus;
	}





	@Override
	public String toString() {
		return "Pokemon [count=" + count + ", next=" + next + ", previus=" + previus + ", results=" + results + "]";
	}

	
	
	
	
	
}
