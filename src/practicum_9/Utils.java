package practicum_9;

public class Utils {
    private double bedrag;
    private int percisie;
    private static int teller;

    public static String euroBedrag(double bedrag){
        teller++;
        return String.format("€" + "%.2f", bedrag);
    }

    public static String euroBedrag(double bedrag, int percisie){
        teller++;
        return String.format("€" + "%.0f", bedrag) + "," + percisie;
    }

    public static int getTeller(){
        return teller;
    }
}
