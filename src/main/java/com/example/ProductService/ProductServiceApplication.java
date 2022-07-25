package com.example.ProductService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import javax.xml.crypto.Data;

@SpringBootApplication
@EnableJpaRepositories("com.example.ProductService")
@EnableFeignClients
public class ProductServiceApplication implements CommandLineRunner {

	@Autowired
	private DataCreator dataCreator;

	public static void main(String[] args) {

		SpringApplication.run(ProductServiceApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception
	{
		dataCreator.createData();
	}
}
