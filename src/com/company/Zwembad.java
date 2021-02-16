package com.company;

public class Zwembad {
    private double breedte;
    private double lengte;
    private double diepte;

    public Zwembad(double breedte, double lengte, double diepte) {
        this.breedte = breedte;
        this.lengte = lengte;
        this.diepte = diepte;
    }

    public Zwembad() {
        this.breedte = 2.5;
        this.lengte = 100.0;
        this.diepte = 2.0;
    }


    public String toString() {
        return "Dit zwembad is "+ breedte + " meter breed, "+ lengte + " lang en "+ diepte+ " diep" ;
    }

    public double getBreedte() {
        return breedte;
    }

    public void setBreedte(double breedte) {
        this.breedte = breedte;
    }

    public double getLengte() {
        return lengte;
    }

    public void setLengte(double lengte) {
        this.lengte = lengte;
    }

    public double getDiepte() {
        return diepte;
    }

    public void setDiepte(double diepte) {
        this.diepte = diepte;
    }

    public double inhoud(){ return lengte * breedte * diepte; }

}

