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

Als ik het try-catch blok in de main methode weghaalt dan kan de applicatie helemaal niet uitgevoerd
worden en dat komt omdat ik in Cirkel.java aangeef dat Radius groter moet zijn dan 0 en nu als de
radius groter is dan 0 in de main methode dan krijg ik IllegalArgumentException error. Het try-catch
blok zorgt ervoor dat hij deze error oppakt en laat dit dan zien als een bericht(message).

 */
