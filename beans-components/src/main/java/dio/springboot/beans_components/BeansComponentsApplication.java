package dio.springboot.beans_components;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import dio.springboot.beans_components.app.ConversorJson;
import dio.springboot.beans_components.app.ViaCepResponse;


@SpringBootApplication
public class BeansComponentsApplication {

	public static void main(String[] args) {
		SpringApplication.run(BeansComponentsApplication.class, args);
	}

    @Bean
    public CommandLineRunner run(ConversorJson conversor) throws Exception {
        return args -> {
            String json = "{\"cep\": \"13309-841\", \"logradouro\": \"Rua Mario Benedetti\", \"localidade\":\"Itu\"}";
            ViaCepResponse response = conversor.converter(json);
            System.out.println("Dados do CEP: " + response);
        };
    }
}
