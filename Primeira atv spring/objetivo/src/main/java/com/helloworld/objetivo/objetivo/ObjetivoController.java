package com.helloworld.objetivo.objetivo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Objetivo")
public class ObjetivoController {

	@GetMapping
	public String Objetivo() {
		return "Meu objetivo é não atrasar as atividades mais,"
				+ " não estava conseguindo acompanhar.";	
  }
}