package compasso.estagio.gabriel.Projeto4;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableJpaRepositories(basePackages = {"compasso.estagio.gabriel.Projeto4.repository"})
@EnableTransactionManagement
public class Projeto4Application {

	public static void main(String[] args) {
		SpringApplication.run(Projeto4Application.class, args);
	}

}
