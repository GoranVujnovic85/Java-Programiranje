import java.util.Scanner;

public class firstCode {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Unesite neki broj: ");

        double x = s.nextDouble();

        double f = Math.sqrt(x);

        System.out.println("Kvadratni koren unetog broja je: " + f);

    }
}
