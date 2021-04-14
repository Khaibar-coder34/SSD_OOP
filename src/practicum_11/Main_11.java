package practicum_11;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;


public class Main_11 {
    public static void main(String[] args) throws IOException {

        Path bestandNaam;
        Path bestandLokatie;
        double koersValue;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Wat is de naam van het bestand? ");


        bestandNaam = Path.of(scanner.nextLine());

        if (!Files.exists(bestandNaam)){
            System.out.println("Dit bestand bestaat niet");
        }

        else {
            System.out.println("Geef een naam aan dit bestand");
            bestandLokatie = Path.of(scanner.nextLine());//

            if (!String.valueOf(bestandLokatie).endsWith(".txt")){
                System.out.println("Dit bestand is geen text bestand");
            }

            else {
                if (Files.exists(bestandLokatie)){
                    System.out.println("Deze bestand bestaal al");
                }

                else {
                    Files.createFile(bestandLokatie);

                    try {
                        System.out.println("Geef de huidige wisselkoers van US Dollar naar Euro in Eurocent");
                        koersValue = scanner.nextDouble();
                        BufferedWriter bufferedWriter = Files.newBufferedWriter(bestandLokatie);

                        List<String> inDollar = Files.readAllLines(Path.of(String.valueOf(bestandNaam)));

                        for (String regel : inDollar){
                            String [] apart = regel.split(": ");
                            double num = Double.parseDouble(apart[1]);
                            num = num * (koersValue / 100);
                            bufferedWriter.write(apart[0] + ": " + String.format("%.2f", num) + "\n");
                        }
                        bufferedWriter.close();


                    }catch (InputMismatchException e){
                        System.out.println("Uw invoer bevat geen cijfers!");
                    }
                }
            }
        }
    }
}
