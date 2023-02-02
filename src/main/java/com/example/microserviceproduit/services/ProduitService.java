package com.example.microserviceproduit.services;

import com.example.microserviceproduit.dto.ProduitRequestDTO;
import com.example.microserviceproduit.dto.ProduitResponseDTO;

import java.util.List;

public interface ProduitService {

    ProduitResponseDTO save(ProduitRequestDTO produitRequestDTO);
    ProduitResponseDTO getProduit(int produitId);
    List<ProduitResponseDTO> produitsByClientId (int clientId);
    List<ProduitResponseDTO> allProduits();
}
