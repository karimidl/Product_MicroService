package com.example.microserviceproduit.dto;

import com.example.microserviceproduit.entities.Client;





public class ProduitResponseDTO {

    private int id;
    private String nomProduit;
    private int qte;
    private String marque;
    private float prix;
    //Return client detail
    private Client client;

    public ProduitResponseDTO() {
    }

    public ProduitResponseDTO(int id, String nomProduit, int qte, String marque, float prix, Client client) {
        this.id = id;
        this.nomProduit = nomProduit;
        this.qte = qte;
        this.marque = marque;
        this.prix = prix;
        this.client = client;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomProduit() {
        return nomProduit;
    }

    public void setNomProduit(String nomProduit) {
        this.nomProduit = nomProduit;
    }

    public int getQte() {
        return qte;
    }

    public void setQte(int qte) {
        this.qte = qte;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public float getPrix() {
        return prix;
    }

    public void setPrix(float prix) {
        this.prix = prix;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
}
