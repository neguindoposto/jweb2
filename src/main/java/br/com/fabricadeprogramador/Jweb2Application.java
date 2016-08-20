package br.com.fabricadeprogramador;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
public class Jweb2Application extends SpringBootServletInitializer{
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		
		return application.sources(Jweb2Application.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(Jweb2Application.class, args);
	}
}
