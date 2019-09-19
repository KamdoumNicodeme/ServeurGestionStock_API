package api.gestion_stock.service;

import api.gestion_stock.entity.Produit;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProduitMockService implements IProduitService {
    private List<Produit> produits;

    public ProduitMockService() {
        produits = new ArrayList<>();

        produits.add(new Produit("P GAMING", 20, 75000));
        produits.add(new Produit("HP PRO BOOK", 10, 450000));
        produits.add(new Produit("MAC BOOK ", 46, 1700000));
        produits.add(new Produit("ECRAN UHD", 39, 555000));
    }

    @Override
    public List<Produit> getProduits() {
        return produits;
    }

    @Override
    public void addProduit(Produit produit) {

        produits.add(produit);

    }

    @Override
    public void updateProduit(Produit produit) {

        produits.remove(produit);
        produits.add(produit);
    }

    @Override
    public void deleteProduit(String ref) {

        Produit produit=new Produit();
        produit.setRef(ref);

    }
}
