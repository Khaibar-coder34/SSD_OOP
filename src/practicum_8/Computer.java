package practicum_8;

import practicum_9.Utils;

import java.time.LocalDate;
import java.util.Objects;

public class Computer implements Goed{
    private String type;
    private String macAdres;
    private double aanschafPrijs;
    private int productieJaar;

    public Computer(String type, String macAdres, double aanschafPrijs, int productieJaar){
        this.type = type;
        this.macAdres = macAdres;
        this.aanschafPrijs = aanschafPrijs;
        this.productieJaar = productieJaar;
    }


    @Override
    public double huidigeWaarde() {
        int verschilTussen_Nu_En_ReleaseJaar = LocalDate.now().getYear() - productieJaar;
        return this.aanschafPrijs * Math.pow(0.60 , verschilTussen_Nu_En_ReleaseJaar); // Math.pow(a, b) geeft a als
                                                                                       // een grondgetal en b als een exponent.
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Computer computer = (Computer) o;
        return Double.compare(computer.aanschafPrijs, aanschafPrijs) == 0 && productieJaar == computer.productieJaar && Objects.equals(type, computer.type) && Objects.equals(macAdres, computer.macAdres);
    }

//    @Override
//    public int hashCode() {
//        return Objects.hash(type, macAdres, aanschafPrijs, productieJaar);
//    }

    @Override
    public String toString() {
        return "Computer: Type--> " + type + " MAC adres--> " + macAdres + " Aanschaf prijs--> " + Utils.euroBedrag(huidigeWaarde())
                + " Productiejaar--> " + productieJaar + "\n" ;
    }
}
