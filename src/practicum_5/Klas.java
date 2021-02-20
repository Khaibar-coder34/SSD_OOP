package practicum_5;

import java.util.ArrayList;

public class Klas {
    private String klasCode;
    private ArrayList<Leerling> leerlingen =new ArrayList<Leerling>();

    public Klas(String klasCode){
        this.klasCode = klasCode;
    }

    public void voegLeerlingToe(Leerling l){
        leerlingen.add(l);

    }

    public void wijzigCijfer(String nm, double nweCijfer){


        for (Leerling l: leerlingen){
            if (l.getNaam().equals(nm)){
                l.setCijfer(nweCijfer);
            }

        }

    }



    public ArrayList<Leerling> getLeerlingen(){
        return leerlingen;
    }


    public int aantalLeerlingen(){
        return leerlingen.size();
    }

    @Override
    public String toString() {

        StringBuilder s = new StringBuilder("In klas " + klasCode + " zitten de volgende leerlingen:\n");
        for (Leerling l : leerlingen){
            s.append(l);
        }
        return s.toString();

    }
}

