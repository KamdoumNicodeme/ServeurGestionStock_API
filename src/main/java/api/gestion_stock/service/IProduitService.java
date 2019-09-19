package api.gestion_stock.service;

import api.gestion_stock.entity.Produit;

import java.util.List;

public interface IProduitService {

    List<Produit> getProduits();

    void addProduit(Produit produit);
    void updateProduit(Produit produit);
    void deleteProduit(String ref);
}
