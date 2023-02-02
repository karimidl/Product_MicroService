package com.example.microserviceproduit.mappers;

import com.example.microserviceproduit.dto.ProduitRequestDTO;
import com.example.microserviceproduit.dto.ProduitResponseDTO;
import com.example.microserviceproduit.entities.Produit;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProduitMapper {

    ProduitResponseDTO produitToProduitResponseDTO(Produit produit);
    Produit ProduitRequestDTOtoProduit(ProduitRequestDTO produitRequestDTO);
}
