package practicum_3B_Cirkel;

public class Cirkel {
    private int radius;
    private int xPositie;
    private int yPositie;

    public Cirkel(int radius, int xPositie, int yPositie) throws IllegalArgumentException {
        this.radius = radius;
        this.xPositie = xPositie;
        this.yPositie = yPositie;

        if(radius<=0)
            throw new IllegalArgumentException("Radius moet groter dan 0 zijn!");
    }

    public String toString() {
        return "Cirkel" + "(" + xPositie + " , " + yPositie  + ") met radius: " + radius;

    }
}

/*
➔ Beredeneer, voordat je het gaat testen, wat er zal gebeuren als je het try-catch blok in
de gegeven methode (main) hierboven weghaalt. Heeft dit tot gevolg dat:
•	de code niet meer compileert
•	de applicatie helemaal niet uitgevoerd kan worden
•	de applicatie tijdens uitvoeren stopt
•	de applicatie gewoon alles uitvoert maar de uitvoer verandert

Het antwoord is dat de applicatie tijdens het uitvoeren stopt want je krijgt een error te zien
en de error laat zien dat radius groter moet zijn dan 0.
Het is geen goed idee om het try-catch blok weg te halen want het pakt deze error op en gaat
verder met het uitvoeren van de applicatie.

 */
