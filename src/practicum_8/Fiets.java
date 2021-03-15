package practicum_8;

import java.time.LocalDate;
import java.util.Objects;

public class Fiets extends Voertuig{
    private int framenummer;


    public Fiets(int framenummer, String type, double nieuwprijs, int bouwjaar) {
        super(type, nieuwprijs, bouwjaar);
        this.framenummer = framenummer;
    }

    @Override
    public double huidigeWaarde() {
        int verschilTussen_Nu_En_ReleaseJaar = LocalDate.now().getYear() - bouwjaar;
        return this.nieuwprijs * Math.pow(0.90 , verschilTussen_Nu_En_ReleaseJaar); // Math.pow(a, b) geeft a als
                                                                                       // een grondgetal en b als een exponent.
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Fiets fiets = (Fiets) o;
        return framenummer == fiets.framenummer;
    }

//    @Override
//    public int hashCode() {
//        return Objects.hash(framenummer);
//    }
}
