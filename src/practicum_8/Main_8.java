package practicum_8;

/*

UITVOER CONTROLEREN

- De objecten computer en computer2 wroden aangeschaft omdat ze verschillede typen zijn
  en de kosten kleiner zijn dan de bedrijf's budget. computer1 wordt niet aangeschaft omdat
  hij hetzelfde type is van computer.

- De objecten fiets en fiets2 wroden aangeschaft omdat ze verschillede typen zijn
  en de kosten kleiner zijn dan de bedrijf's budget. fiets1 wordt niet aangeschaft omdat
  hij hetzelfde type is van fiets.

- De objecten auto wrodt aangeschaft omdat hij uniek en de kosten kleiner zijn dan
  de bedrijf's budget. auto1 wordt niet aangeschaft omdat hij hetzelfde type is van auto.
  auto2 wordt ook niet aangeschaft omdat de prijs hoger is dan de bedrijf's budget.

*/

import practicum_9.Utils;

public class Main_8 {
    public static void main(String[] args) {
        BedrijfsInventaris bedrijfsInventaris = new BedrijfsInventaris("Indiase Keuken", 280000);
        Computer computer = new Computer("Lenovo", "00-D0-56-F2-B5-12", 3500, 2011);
        Computer computer1 = new Computer("Lenovo", "00-D0-56-F2-B5-12", 3500, 2011);
        Computer computer2 = new Computer("APPLE", "00-26-DD-14-C4-EE", 3000, 2019);
        Fiets fiets = new Fiets(111, "Fatbike", 150, 2015 );
        Fiets fiets1 = new Fiets(111, "Fatbike", 150, 2015 );
        Fiets fiets2 = new Fiets(112, "MountainBike", 200, 2019 );
        Auto auto = new Auto("KENTEKEN123", "FORD", 3500, 2011);
         Auto auto1 = new Auto("KENTEKEN123", "FORD", 3500, 2011);
        Auto auto2 = new Auto("KENTEKEN12345", "AUDI", 500000, 2020);

        bedrijfsInventaris.schafAan(computer);
        bedrijfsInventaris.schafAan(computer1);
        bedrijfsInventaris.schafAan(computer2);
        bedrijfsInventaris.schafAan(fiets);
        bedrijfsInventaris.schafAan(fiets1);
        bedrijfsInventaris.schafAan(fiets2);
        bedrijfsInventaris.schafAan(auto);
        bedrijfsInventaris.schafAan(auto1);
        bedrijfsInventaris.schafAan(auto2);

        System.out.println(bedrijfsInventaris.toSting());
        System.out.println("Het euroBedrag wordt " + Utils.getTeller() + " keer aangeroepen");
    }
}
