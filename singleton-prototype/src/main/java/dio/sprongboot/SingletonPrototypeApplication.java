package dio.sprongboot;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import dio.sprongboot.app.SistemaMensagem;

@SpringBootApplication
public class SingletonPrototypeApplication {

	public static void main(String[] args) {
		SpringApplication.run(SingletonPrototypeApplication.class, args);
	}

    @Bean
    public CommandLineRunner run(SistemaMensagem sistema) throws Exception {
        return args -> {
			sistema.enviarConfirmacaoCadastro();
			sistema.enviarMensagemBoasVindas();
			sistema.enviarConfirmacaoCadastro();
        };
    }
}
