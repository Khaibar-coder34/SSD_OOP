package Practicum_3A_Omar;

public class Voetbalclub_omar {
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


    public int aantalPunten(){return 3 * aantalGewonnen + aantalGelijk;}
    public int aantalGespeeld(){return aantalGelijk + aantalGewonnen + aantalVerloren;}
    public Voetbalclub_omar(String team) {
        this.team = team;

    }

    public String toString() {
        aantalGespeeld = aantalGelijk + aantalGewonnen + aantalVerloren;
        aantalPunten = 3 * aantalGewonnen + aantalGelijk;
        return team + " " + aantalGespeeld + " " + aantalGewonnen + " " + aantalGelijk + " " + aantalVerloren + " " + aantalPunten ;
    }

}
