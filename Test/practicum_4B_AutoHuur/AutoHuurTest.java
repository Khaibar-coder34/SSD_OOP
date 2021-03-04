package practicum_4B_AutoHuur;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class AutoHuurTest {


    @Test
    public void negatievePrijs() {
        Auto a = new Auto("", -2.0);
        assertEquals(2.0, a.getPrijsPerDag());
    }

    @Test
    public void geenAuto() {
        Auto a1 = new Auto();
        assertEquals("er is geen auto bekend", a1.toString());
    }


    @Test
    public void geenHuurder() {
        Klant k1 = new Klant();
        assertEquals("er is geen huurder bekend", k1.toString());


    }


}