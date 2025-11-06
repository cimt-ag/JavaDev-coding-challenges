package cimt.codingchallenge.java.senior;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;

@Configuration
public class SpringFoxConfig {

	@Bean
	public OpenAPI springShopOpenAPI() {
		return new OpenAPI().info(new Info().title("PetShop API")
				.description("Pet shop sample application")
				.version("v0.0.1")
				.license(new License().name("Apache 2.0").url("http://springdoc.org")));
	}
}
