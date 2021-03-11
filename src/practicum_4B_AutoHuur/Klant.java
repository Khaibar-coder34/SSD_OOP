package practicum_4B_AutoHuur;

public class Klant {
    private String naam;
    private double kortingsPercentage;

    public Klant(String naam, double kortingsPercentage) {
        this.naam = naam;
        this.kortingsPercentage = kortingsPercentage;
    }

    public Klant(String naam) {
        this.naam = naam;
    }

    public Klant(){

    }

    public String getNaam() {
        return naam;
    }


    public double getKorting() {
        return kortingsPercentage;
    }

    public void setKorting(double kortingsPercentage) {
        this.kortingsPercentage = kortingsPercentage;
    }


    @Override
    public String toString() {
        if (this.naam == null){                   //Controleren of er geen huurder is
            return "  er is geen huurder bekend ";
        }

        return "  op naam van: " + naam + " (korting: " + kortingsPercentage + "%) ";
    }
}
