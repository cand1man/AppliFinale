package com.example.alexis_oliveira.testappligooglemap;

public class Monument {

    private  int nom,addresse,image;


    public Monument(int nom, int addresse, int image) {
        this.nom = nom;
        this.addresse = addresse;
        this.image = image;
    }

    public int getNom() {
        return nom;
    }

    public void setNom(int nom) {
        this.nom = nom;
    }

    public int getAddresse() {
        return addresse;
    }

    public void setAddresse(int addresse) {
        this.addresse = addresse;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

}