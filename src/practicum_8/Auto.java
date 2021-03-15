package practicum_8;

import java.time.LocalDate;
import java.util.Objects;

public class Auto extends Voertuig{
    private String kenteken;

    public Auto(String kenteken, String type, double nieuwprijs, int bouwjaar) {
        super(type, nieuwprijs, bouwjaar);
        this.kenteken = kenteken;
    }


    @Override
    public double huidigeWaarde() {
        int verschilTussen_Nu_En_ReleaseJaar = LocalDate.now().getYear() - bouwjaar;
        return this.nieuwprijs * Math.pow(0.70 , verschilTussen_Nu_En_ReleaseJaar); // Math.pow(a, b) geeft a als
        // een grondgetal en b als een exponent.
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Auto auto = (Auto) o;
        return Objects.equals(kenteken, auto.kenteken);
    }

//    @Override
//    public int hashCode() {
//        return Objects.hash(kenteken);
//    }
}
