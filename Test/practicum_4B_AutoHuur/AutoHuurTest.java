package practicum_4B_AutoHuur;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class AutoHuurTest {

    @Test
    public void prijsMetKorting(){

    }


    @Test
    public void geenAuto_welKlant(){
        Auto auto = new Auto();
        Klant klant = new Klant("klantNaam");
        assertEquals("er is geen auto bekend  op naam van: klantNaam (korting: 0.0%) " , auto.toString()+ klant.toString());
    }

    @Test
    public void geenKlant_welAuto(){
        Auto auto = new Auto("typeAuto");
        Klant klant = new Klant();
        assertEquals("  er is geen huurder bekend typeAuto met prijs per dag: 0.0", klant.toString() + auto.toString());
    }

    @Test
    public void geenHuurder_geenAuto(){
        AutoHuur autoHuur = new AutoHuur();
        assertEquals("  er is geen auto bekend\n  er is geen huurder bekend \n  aantal dagen: 0 dat kost 0.0", autoHuur.toString());
    }

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
    public void welAuto(){
        Auto auto = new Auto("typeAuto");
        assertEquals("typeAuto met prijs per dag: 0.0", auto.toString());
    }

    @Test
    public void geenHuurder() {
        Klant k1 = new Klant();
        assertEquals("  er is geen huurder bekend ", k1.toString());
    }


    @Test
    void checkKorting(){
        Klant klant = new Klant("");
        klant.setKorting(10.0);
        assertEquals("  op naam van:  (korting: 10.0%) ",klant.toString());
    }

    @Test
    void nullKorting(){
        Klant klant = new Klant("");
        klant.setKorting(0.0);
        assertEquals("  op naam van:  (korting: 0.0%) ", klant.toString());
    }






}