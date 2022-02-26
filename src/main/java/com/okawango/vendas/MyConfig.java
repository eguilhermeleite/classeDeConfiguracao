package com.okawango.vendas;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {

	@Bean
	public String myConfigString() {
		return "Teste de configuração";
	}

	@Bean
	public String meuNome() {
		return "Meu nome";
	}

}
