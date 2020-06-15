package com.example.pokemon.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
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
@RequiredArgsConstructor
public class PokemonSerivicesImpl implements PokemonServices {

  private final RestTemplate restTemplate;

  @Value("${pokeapi.url}")
  private String url;

  @Override
  public List<Results> listAllResults() {

    HttpEntity<String> entity = getStringHttpEntity();
    ResponseEntity<Pokemon> response =
        restTemplate.exchange(url, HttpMethod.GET, entity, Pokemon.class);
    if (response.hasBody() && response.getBody() != null) {

      return response.getBody().getResults();
    }

    return Collections.emptyList();
  }

  private HttpEntity<String> getStringHttpEntity() {
    HttpHeaders headers = new HttpHeaders();
    headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
    headers.add(
        "user-agent",
        "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/54.0.2840.99 Safari/537.36");
    return new HttpEntity<>("parameters", headers);
  }
}
