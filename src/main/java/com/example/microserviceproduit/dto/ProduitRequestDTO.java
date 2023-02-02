package com.example.microserviceproduit.dto;


public class ProduitRequestDTO {

    private int id;
    private String nomProduit;
    private int qte;
    private String marque;
    private float prix;
    private int clientId;

    public ProduitRequestDTO() {
    }

    public ProduitRequestDTO(int id, String nomProduit, int qte, String marque, float prix, int clientId) {
        this.id = id;
        this.nomProduit = nomProduit;
        this.qte = qte;
        this.marque = marque;
        this.prix = prix;
        this.clientId = clientId;
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

    public int getClientId() {
        return clientId;
    }

    public void setClientId(int clientId) {
        this.clientId = clientId;
    }
}
