package practicum_8;

import practicum_9.Utils;

import java.util.Objects;

public abstract class Voertuig implements Goed{
    private String type;
    protected  double nieuwprijs;
    protected int bouwjaar;

    public Voertuig(String type, double nieuwprijs, int bouwjaar){
        this.bouwjaar = bouwjaar;
        this.nieuwprijs = nieuwprijs;
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Voertuig voertuig = (Voertuig) o;
        return Double.compare(voertuig.nieuwprijs, nieuwprijs) == 0 && bouwjaar == voertuig.bouwjaar && Objects.equals(type, voertuig.type);
    }

//    @Override
//    public int hashCode() {
//        return Objects.hash(type, nieuwprijs, bouwjaar);
//    }


    @Override
    public String toString() {
//        return "Voertuig: "+ type+" met bouwjaar "+bouwjaar+" heeft een waarde van: "+ nieuwprijs;
        return "Voertuig: Type--> " + type + " Bouwjaar--> " + bouwjaar + " Prijs--> " + Utils.euroBedrag(huidigeWaarde())
                + "\n";

    }
}
