package com.example.microserviceproduit;

import com.example.microserviceproduit.dto.ProduitRequestDTO;
import com.example.microserviceproduit.services.ProduitService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableFeignClients
public class MicroServiceProduitApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroServiceProduitApplication.class, args);
    }
    @Bean
    CommandLineRunner start(ProduitService produittService){
        return args ->{
            produittService.save(new ProduitRequestDTO(11,"nom1",55,"marke1",101,1));
            produittService.save(new ProduitRequestDTO(23,"nom2",66,"marke2",202,2));

        };
    }
}
