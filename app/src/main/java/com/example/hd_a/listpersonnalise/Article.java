package com.example.hd_a.listpersonnalise;

public class Article {
    private int code, pu;
    private String libelle, categorie;


    public Article(int code, int pu, String libelle, String categorie) {
        this.code = code;
        this.pu = pu;
        this.libelle = libelle;
        this.categorie = categorie;
    }

    public Article() {
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public int getPu() {
        return pu;
    }

    public void setPu(int pu) {
        this.pu = pu;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public String getCategorie() {
        return categorie;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }
}
