package com.example.microserviceproduit.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Transient;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
public class Produit {
    @Id
    private int id;
    private String nomProduit;
    private int qte;
    private String marque;
    private float prix;
    private int clientId;
    @Transient
    private Client client;

    public Produit() {
    }

    public Produit(int id, String nomProduit, int qte, String marque, float prix, int clientId, Client client) {
        this.id = id;
        this.nomProduit = nomProduit;
        this.qte = qte;
        this.marque = marque;
        this.prix = prix;
        this.clientId = clientId;
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

    public int getClientId() {
        return clientId;
    }

    public void setClientId(int clientId) {
        this.clientId = clientId;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
}
