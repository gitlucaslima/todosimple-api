package com.lucaslima.todosimple;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@SpringBootApplication
@RestController
@RequestMapping(value = "pessoas")
@OpenAPIDefinition(
	info = @Info(
		title = "Peritos",
		version = "1.0.0",
		description = "Versão de teste de documentação"
	)
)
public class TodosimpleApplication {

	public static void main(String[] args) {
		SpringApplication.run(TodosimpleApplication.class, args);
	}

	@GetMapping(value  = "teste")
	public String getTeste(){
		
		return "pessoa";

	}

}
