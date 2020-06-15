package com.example.pokemon.controller;

import com.example.pokemon.model.Results;
import com.example.pokemon.services.PokemonServices;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("rest")
@Slf4j
@RequiredArgsConstructor
public class PrimRestController {

  private final PokemonServices pokeServices;

  @GetMapping("checkrest2")
  public ResponseEntity<?> checkrest2() {
    List<Results> resultsList = pokeServices.listAllResults();

    log.info("Pokemones encontrados => {}", resultsList);

    return ResponseEntity.ok(resultsList);
  }
}
