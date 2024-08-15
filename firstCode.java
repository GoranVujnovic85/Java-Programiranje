import java.util.Scanner;

public class firstCode {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Unesite temperaturu u Farahajtima: ");

        double tempF = s.nextDouble();
        double tempC = (tempF - 32) / 1.8;

        System.out.println("Temperatura u stepenima iznosi: " + tempC);

    }
}
