
//Practicum 3A GroepsOpdracht

package Practicum_Git_3A;

public class Voetbalclub {
    private String naam;
    private int aantalGewonnen;
    private int aantalVerloren;
    private int aantalGelijk;

    public Voetbalclub(String naam) {
        this.naam = naam;

        if (naam == null || naam.equals("")){
            this.naam = "FC";
        }
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




