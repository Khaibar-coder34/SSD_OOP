package practicum_4B_AutoHuur;

public class AutoHuur {
    private int aantalDagen;
    private Klant huurder = new Klant();
    private Auto gehuurdeAuto = new Auto();


    public AutoHuur(int aantalDagen) {
        this.aantalDagen = aantalDagen;
    }

    public AutoHuur(){

    }

    public double totaalPrijsVanGehuurdAuto(){      //Bedrag berekenen voor totale prijs van een gehuurde auto
        return this.gehuurdeAuto.getPrijsPerDag() * this.aantalDagen / 100 * (100 - this.huurder.getKorting());

    }

    public void setAantalDagen(int aantalDagen) {
        this.aantalDagen = aantalDagen;
    }

    public void setHuurder(Klant huurder) {
        this.huurder = huurder;
    }

    public void setGehuurdeAuto(Auto gehuurdeAuto) {
        this.gehuurdeAuto = gehuurdeAuto;
    }

    public int getAantalDagen() {
        return aantalDagen;
    }

    public Klant getHuurder() {
        return huurder;
    }

    public Auto getGehuurdeAuto() {
        return gehuurdeAuto;
    }

    @Override
    public String toString() {

        return "  " + this.gehuurdeAuto + "\n" + this.huurder + "\n" + "  aantal dagen: "
                + this.aantalDagen + " dat kost " + totaalPrijsVanGehuurdAuto();
//
//        if (this.gehuurdeAuto.getType() == null && huurder.getNaam() == null){
//            return "er is geen auto bekend\ner is geen huurder bekend\n" +
//                    "aantal dagen: "
//                    + aantalDagen + " en dat kost " + totaalPrijsVanGehuurdAuto();
//        }


//        if (gehuurdeAuto != null && huurder != null){
//            return  "autotype: " +
//                     gehuurdeAuto.getType() + " met prijs per dag: " + gehuurdeAuto.getPrijsPerDag() +
//                    "\nop " + "naam van: "
//                     + huurder.getNaam() + " (korting" + huurder.getKorting() + ")\n" +
//                    "aantal dagen: "
//                     + aantalDagen + " en" + " dat kost " + totaalPrijsVanGehuurdAuto();
//        }

//        if (gehuurdeAuto == null && huurder != null){
//            return  this.gehuurdeAuto.toString() +"\n op naam van: " + huurder.getNaam() + " (korting: " + huurder.getKorting() + ")\n " +
//                    "aantal dagen: "
//                    + aantalDagen + " en dat kost " + totaalPrijsVanGehuurdAuto();
//        }

//        if (gehuurdeAuto != null && huurder == null){
//            return  this.huurder.toString() + "\n op naam van: " + huurder.getNaam() + " (korting: " + huurder.getKorting() + ")\n " +
//                    "aantal dagen: " + aantalDagen + totaalPrijsVanGehuurdAuto();
//        }
//        return   "autotype: " +
//                     gehuurdeAuto.getType() + " met prijs per dag: " + gehuurdeAuto.getPrijsPerDag() +
//                    "\nop " + "naam van: "
//                     + huurder.getNaam() + " (korting" + huurder.getKorting() + ")\n" +
//                    "aantal dagen: "
//                     + aantalDagen + " en" + " dat kost " + totaalPrijsVanGehuurdAuto();
    }

}

