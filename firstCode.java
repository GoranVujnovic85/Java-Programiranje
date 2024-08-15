import java.util.Scanner;

public class firstCode {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Unesite ime grada: ");

        String imeGrada = s.nextLine();

        imeGrada = imeGrada.toUpperCase();
        imeGrada = imeGrada.trim();

        if (imeGrada.equals("BEOGRAD") || imeGrada.equals("NOVI SAD"))
        {
            System.out.println("Imamo predstavnistvo u tom gradu.");

        }
        else
        {
            System.out.println("Zao nam je ali nemamo predstavnistvo u tom gradu!");
        }

        System.out.println("Program je zavrsen!");

    }
}
