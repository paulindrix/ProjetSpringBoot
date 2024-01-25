package com.example.projetspringboota18;

import jakarta.annotation.PostConstruct;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProjetSpringBootA18Application {

    public static void main(String[] args) {
        SpringApplication.run(ProjetSpringBootA18Application.class, args);
    }
    @PostConstruct
    public void init() {
        // Logique à exécuter au démarrage de l'application
        System.out.println("L'application a démarré avec succès !");

}
}
