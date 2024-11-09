package com.eazybytes.accounts;

import com.eazybytes.accounts.dto.AccountsContactInfoDto;
import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableConfigurationProperties(value= {AccountsContactInfoDto.class}) // used for injecting properties from @ConfigurationProperties annotated class
@EnableJpaAuditing(auditorAwareRef = "auditAwareImpl") // used for auditing
@OpenAPIDefinition( // used for documentation on swagger to change main heading name and other things but not required
		info= @Info(
				title = "Accounts Microservice REST API Documentation",
				description = "EazyBank Accounts Microservice REST API Documentation",
				version = "v1",
				contact = @Contact(
						name = "Shally",
						email = "sj@Am"
				),
				license = @License(
						name = "Apache 2.0"
				)
		),
		externalDocs = @ExternalDocumentation(
				description = "EazyBank Accounts Microservice REST API Documentation",
				url = "http://localhost:8080/swagger-ui/index.html"
		)
)
public class AccountsApplication {

	public static void main(String[] args) {
		SpringApplication.run(AccountsApplication.class, args);
	}

}
