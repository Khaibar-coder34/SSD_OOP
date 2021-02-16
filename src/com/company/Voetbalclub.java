
//Practicum 2B

package com.company;

public class Voetbalclub {
    private String naam;
    private int aantalGewonnen;
    private int aantalVerloren;
    private int aantalGelijk;

    public Voetbalclub(String naam) {
        this.naam = naam;
    }

    public int aantalPunten() {
        int aantalGen = aantalGewonnen *3;
        int aantalGlk = aantalGelijk;
        return aantalGen + aantalGlk;
    }

    public int aantalGespeeld() {
        return aantalVerloren + aantalGewonnen + aantalGelijk;
    }

    public String toString() {
        return naam +
                " " + aantalGespeeld() +
                " " + aantalGewonnen + " " + aantalGelijk +
                " " + aantalVerloren + " " + aantalPunten();
    }

    public void verwerkResultaat(char ch) {

        if (ch == 'w')
            aantalGewonnen = aantalGewonnen + 1;
        if (ch == 'g')
            aantalGelijk = aantalGelijk + 1;
        if (ch == 'v')
            aantalVerloren = aantalVerloren + 1;

    }

}




