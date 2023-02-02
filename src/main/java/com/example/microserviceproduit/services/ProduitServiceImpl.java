package com.example.microserviceproduit.services;

import com.example.microserviceproduit.dto.ProduitRequestDTO;
import com.example.microserviceproduit.dto.ProduitResponseDTO;

import com.example.microserviceproduit.entities.Client;
import com.example.microserviceproduit.entities.Produit;
import com.example.microserviceproduit.mappers.ProduitMapper;
import com.example.microserviceproduit.openfeign.ClientServiceRestClient;
import com.example.microserviceproduit.repositories.ProduitRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
public class ProduitServiceImpl implements ProduitService {

    private ProduitRepository produitRepository;
    private ProduitMapper produitMapper;
    private ClientServiceRestClient clientServiceRestClient;

    public ProduitServiceImpl(ProduitRepository produitRepository, ProduitMapper produitMapper, ClientServiceRestClient clientServiceRestClient) {
        this.produitRepository = produitRepository;
        this.produitMapper = produitMapper;
        this.clientServiceRestClient = clientServiceRestClient;
    }

    @Override
    public ProduitResponseDTO save(ProduitRequestDTO produitRequestDTO) {

        Produit produit=produitMapper.ProduitRequestDTOtoProduit(produitRequestDTO);
        Produit savedProduct=produitRepository.save(produit);
        ProduitResponseDTO produitResponseDTO = produitMapper.produitToProduitResponseDTO(savedProduct);

        return produitResponseDTO;
    }

    @Override
    public ProduitResponseDTO getProduit(int produitId) {

        Produit produit=produitRepository.findById(produitId).get();
        Client client=clientServiceRestClient.getClient(produit.getClientId());
        produit.setClient(client);

        return produitMapper.produitToProduitResponseDTO(produit);
    }

    @Override
    public List<ProduitResponseDTO> produitsByClientId(int clientId) {
       
        List<Produit> produits=produitRepository.findByClientId(clientId);
        for (Produit produit:produits){
            Client client=clientServiceRestClient.getClient(produit.getClientId());
            produit.setClient(client);
        }
        List<ProduitResponseDTO> produitResponseDTO =
                produits.stream()
                        .map(prod -> produitMapper.produitToProduitResponseDTO(prod))
                        .collect(Collectors.toList());
        return produitResponseDTO;
    }
    @Override
    public List<ProduitResponseDTO> allProduits() {
        List<Produit> produits=produitRepository.findAll();
        for (Produit produit:produits){
            Client client=clientServiceRestClient.getClient(produit.getClientId());
            produit.setClient(client);
        }
        List<ProduitResponseDTO> produitResponseDTOS=
                produits.stream()
                        .map(prdt->produitMapper.produitToProduitResponseDTO(prdt))
                        .collect(Collectors.toList());

        return produitResponseDTOS;
    }

//    @Override
//    public List<ProduitResponseDTO> allProduits() {
//        List<Produit> produits=produitRepository.findAll();
//        List<ProduitResponseDTO> produitResponseDTOS=
//                produits.stream()
//                        .map(prdt->produitMapper.produitToProduitResponseDTO(prdt))
//                        .collect(Collectors.toList());
//
//        return produitResponseDTOS;
//    }
}
