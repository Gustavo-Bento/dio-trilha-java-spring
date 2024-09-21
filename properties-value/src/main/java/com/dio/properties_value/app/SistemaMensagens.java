package main.java.com.dio.properties_value.app;

import java.util.ArrayList;

@Component
public class SistemaMensagens implements CommandLineRunner {

    @Value("${name:NoReply-DIO}")
    private String nome = "Gleyson Sampaio";
    @Value("${email}")
    private String email = "gleyson@dio.com";
    @Value("${telefones}")
    private List<Long> telefones = new ArrayList<>(Array.asList(new Long[] { 11997223471L }));

    @Override
    public void run(String... args) throws Exception {
        System.out.println(
                "Mensagem enviada por: " + nome
                        + "\nE-mail: " + email
                        + "\nCom telefones para contato: " + telefones);
        System.out.println("Seu cadastro foi aprovado!");
    }
}
