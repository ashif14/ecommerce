package com.tcs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

import com.mkyong.domain.Product;
import com.mkyong.domain.ProductDao;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;

//import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
//import org.springframework.stereotype.*;
//import org.springframework.web.bind.annotation.*;


//@RestController
@EnableAutoConfiguration
@SpringBootApplication
public class Application extends SpringBootServletInitializer{
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder app){
		return app.sources(Application.class);
	}
	
	public static void main(String[] args) throws Exception{
		SpringApplication.run(Application.class, args);
	}
	
	@Bean
    CommandLineRunner init(ProductDao productDao) {

        return args -> {

            Product obj = productDao.findOne(7L);
            System.out.println(obj);

            Product obj2 = productDao.findFirstByName("Moto M");
            System.out.println(obj2);

            int n = productDao.updateName("Moto E Power", true);
            System.out.println("Number of records updated : " + n);

        };

    }
}

