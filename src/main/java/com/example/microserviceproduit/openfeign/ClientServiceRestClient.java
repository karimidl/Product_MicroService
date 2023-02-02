package com.example.microserviceproduit.openfeign;

import com.example.microserviceproduit.entities.Client;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "CLIENT-SERVICE")
public interface ClientServiceRestClient {

    @GetMapping(path = "/api/clients/{id}")
    Client getClient(@PathVariable int id);

    @GetMapping(path = "/api/clients")
    List<Client> allClients();
}
