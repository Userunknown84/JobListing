package com.java.joblisting;


import com.java.joblisting.Repo.PostRepo;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class JoblistingApplication {


	@Bean
	public OpenAPI customOpenAPI() {
		return new OpenAPI()
				.info(new Info()
						.title("Job Listing API")
						.version("1.0")
						.description("API for managing job listings"));
	}


	public static void main(String[] args) {
		SpringApplication.run(JoblistingApplication.class, args);
	}

}
