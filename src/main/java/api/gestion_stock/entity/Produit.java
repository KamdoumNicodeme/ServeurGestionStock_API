package api.gestion_stock.entity;

import java.io.Serializable;

public class Produit implements Serializable {
    private String ref;
    private int quantite;
    private double prixUnitaire;


    public Produit() {
    }

    public Produit(String ref,int quantite, double prixUnitaire) {
        this.quantite = quantite;
        this.prixUnitaire = prixUnitaire;
        this.ref=ref;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Produit)) return false;

        Produit produit = (Produit) o;

        return ref.equals(produit.ref);
    }

    @Override
    public int hashCode() {
        return ref.hashCode();
    }

    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    public double getPrixUnitaire() {
        return prixUnitaire;
    }

    public void setPrixUnitaire(double prixUnitaire) {
        this.prixUnitaire = prixUnitaire;
    }
}
