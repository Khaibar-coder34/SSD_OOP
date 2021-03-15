package practicum_8;


import practicum_9.Utils;

import java.util.ArrayList;

public class BedrijfsInventaris{
    private String bedrijfsnaam;
    private double budget;
    private ArrayList<Goed> goedArrayList = new ArrayList<>();

    public BedrijfsInventaris(String bedrijfsnaam, double budget){
        this.bedrijfsnaam =bedrijfsnaam;
        this.budget = budget;
    }


    public void schafAan(Goed g){
        for (Goed elke_goed : goedArrayList){
            if (elke_goed.equals(g)) return;
        }

        if (this.budget > g.huidigeWaarde()){
            if(!goedArrayList.contains(g)){
                goedArrayList.add(g);
                budget = budget - g.huidigeWaarde();
            }
        }

    }



    public String toSting(){

        StringBuilder s = new StringBuilder( "\n" + bedrijfsnaam + " heeft budget van " + Utils.euroBedrag(budget)
                + "\n" +
                "Het bedrijf heeft de volgende goederen aangeschaft:" + "\n\n" );
        for (Goed i : goedArrayList){
            s.append(i);
        }
        return s.toString();
    }

}
