package CollegeLessen;

import java.util.ArrayList;

public class Les_5_ArryList {
    public static void main(String[] args) {


        ArrayList<Double> cijferlijst = new ArrayList<Double>();
        cijferlijst.add(6.9);				// auto-boxing (geen wrap nodig)
        cijferlijst.add(8.1);

        double index1 = cijferlijst.get(1);		// auto-unboxing (geen cast nodig)
        System.out.println(index1);

        for (Double cijfer : cijferlijst) {
            System.out.print(cijfer + "  ");


        }
    }
}
