package com.example.pokemon.controller;


import java.util.ArrayList;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;
import com.example.pokemon.model.Results;
import com.example.pokemon.services.PokemonServices;


@RestController
@RequestMapping("/rest")
public class PrimRestController {

	
	private static final Log LOG =LogFactory.getLog(PrimRestController.class);

		@Autowired
		RestTemplate rt;
		
		@Autowired
		PokemonServices pokeServices;
		
		
		@GetMapping("/checkrest")
		public ModelAndView checkrest(){
			ModelAndView mav= new ModelAndView(com.example.pokemon.constant.ViewConstant.LISTADO);
		
			ArrayList<Results> rs = pokeServices.listAllResults();
			
		        mav.addObject("resultados", rs);
		        
		        return mav;
		}
	
}
