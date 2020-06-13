package com.example.pokemon.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.pokemon.model.Pokemon;
import com.example.pokemon.model.Results;

@Service("pokeServiceimp")
public class PokemonSerivicesImpl implements PokemonServices {

	@Override
	public ArrayList<Results> listAllResults() {
		
		RestTemplate rt = new RestTemplate();
	      HttpHeaders headers = new HttpHeaders();
	        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
	        headers.add("user-agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/54.0.2840.99 Safari/537.36");
	        HttpEntity<String> entity = new HttpEntity<String>("parameters", headers);
	        String url = "https://pokeapi.co/api/v2/pokemon-form";		
	        ResponseEntity<Pokemon> rp = rt.exchange(url, HttpMethod.GET, entity,Pokemon.class);
	        ArrayList<Results> rs = rp.getBody().getResults();
		
	        return rs;		
	}

	@Override
	public Results infoPoke(String url) {
		// TODO Auto-generated method stub
		return null;
	}

}
