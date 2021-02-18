package com.company.practicum_3A;


public class Voetbalclub {
    private int aantalGewonnen;
    private int aantalGelijk;
    private int aantalVerloren;
    private int aantalGespeeld;
    private int aantalPunten ;
    private String team;
    public void verwerkResultaat(char ch) {
        if (ch == 'w')
            aantalGewonnen = aantalGewonnen + 1;
        if (ch == 'g')
            aantalGelijk = aantalGelijk + 1;
        if (ch == 'v')
            aantalVerloren = aantalVerloren + 1;
    }
    public int aantalPunten(){return 3*aantalGewonnen+aantalGelijk;}
    public int aantalGespeeld(){return aantalGelijk+aantalGewonnen+aantalVerloren;}
    public Voetbalclub (String team) {
        this.team = team;

    }

    public String toString() {
        aantalGespeeld = aantalGelijk+aantalGewonnen+aantalVerloren;
        aantalPunten = 3*aantalGewonnen+aantalGelijk;
        return team + " " + aantalGespeeld + " " + aantalGewonnen + " " + aantalGelijk + " " + aantalVerloren + " " + aantalPunten ;
    }


    public static void main(String[] args) {
        com.company.Voetbalclub ajx = new com.company.Voetbalclub("Ajax      ");
        com.company.Voetbalclub feij = new com.company.Voetbalclub("Feijenoord");

        feij.verwerkResultaat('w');
        feij.verwerkResultaat('w');
        feij.verwerkResultaat('w');
        feij.verwerkResultaat('g');

        System.out.println("Feijenoord punten: " + feij.aantalPunten());
        System.out.println("Ajax gespeeld: " + ajx.aantalGespeeld());
        System.out.println();

        System.out.println(ajx);
        System.out.println(feij);
    }

}
