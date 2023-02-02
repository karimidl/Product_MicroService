package com.example.microserviceproduit.repositories;

import com.example.microserviceproduit.entities.Produit;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProduitRepository extends JpaRepository<Produit,Integer> {

    List<Produit> findByClientId(int clientId);
}
