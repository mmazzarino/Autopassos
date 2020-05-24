package br.com.oficina.autopassos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(basePackages = { "br.com.oficina.autopassos.entity" })
@EnableJpaRepositories(basePackages = { "br.com.oficina.autopassos.repository" })
@ComponentScan(basePackages = {"br.com.oficina.autopassos.controller"})
public class AutopassosApplication {

	public static void main(String[] args) {
		SpringApplication.run(AutopassosApplication.class, args);
	}

}
