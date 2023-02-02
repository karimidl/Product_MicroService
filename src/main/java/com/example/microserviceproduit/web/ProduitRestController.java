package com.example.microserviceproduit.web;

import com.example.microserviceproduit.dto.ProduitRequestDTO;
import com.example.microserviceproduit.dto.ProduitResponseDTO;
import com.example.microserviceproduit.services.ProduitService;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api")
public class ProduitRestController {

    private ProduitService produitService;

    public ProduitRestController(ProduitService produitService) {
        this.produitService = produitService;
    }

    @GetMapping(path = "/produits")
    public List<ProduitResponseDTO> allProducts(){
        return produitService.allProduits();
    }

    @GetMapping(path = "/produit/{id}")
    public ProduitResponseDTO getProduit(@PathVariable(name = "id") int produitId){
        return produitService.getProduit(produitId);
    }
    @GetMapping(path = "/produits/{clientId}")
    public List<ProduitResponseDTO> getProduitsByClient(@PathVariable int clientId){
        return produitService.produitsByClientId(clientId);
    }

    @PostMapping(path = "/produits/add")
    public ProduitResponseDTO save(@RequestBody ProduitRequestDTO produitRequestDTO){
        return produitService.save(produitRequestDTO);
    }

}
