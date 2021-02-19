package practicum_4B_AutoHuur;


public class Auto {
    private String type;
    private double prijsPerDag;

    public Auto(String type, double prijsPerDag) {
        this.type = type;
        this.prijsPerDag = prijsPerDag;
    }

    public Auto(String type) {
        this.type = type;
    }

    public Auto(){

    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPrijsPerDag() {
        return Math.abs(prijsPerDag);
    }

    public void setPrijsPerDag(double prijsPerDag) {
        this.prijsPerDag = Math.abs(prijsPerDag);
    }

    @Override
    public String toString() {
        if (this.type == null){                     //Controleren of er geen auto is voor de huur
            return "er is geen auto bekend";
        }

        return type + " met prijs per dag: " + prijsPerDag;   //Er is wel een auto beschikbaar
    }
}

