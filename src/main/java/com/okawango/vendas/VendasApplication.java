package com.okawango.vendas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class VendasApplication {

	@Autowired
	private MyConfig myConfig;
	
	@GetMapping("/hello")
	public String hello() {
		return myConfig.myConfigString();
	}
	
	@GetMapping("/nome")
	public String nome() {
		return myConfig.meuNome();
	}

	public static void main(String[] args) {
		SpringApplication.run(VendasApplication.class, args);
	}

}
