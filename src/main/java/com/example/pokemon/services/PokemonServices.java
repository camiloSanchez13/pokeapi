package com.example.pokemon.services;

import java.util.ArrayList;
import java.util.List;

import com.example.pokemon.model.Results;


public interface PokemonServices {

	public abstract ArrayList<Results> listAllResults();
	
	public abstract Results infoPoke(String url);
	
}
