import java.util.Scanner;

public class firstCode {

    public  static int dvaBroja (int a, int b)
    {
        if (a > b)
        {
            return a;
        }
        else
        {
            return b;
        }
    }


    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);

        System.out.print("Unesite prvi broj: ");
        int prviBroj = s.nextInt();

        System.out.print("Unesite drugi broj: ");
        int drugiBroj = s.nextInt();

        int veciBroj = dvaBroja(prviBroj, drugiBroj);

        System.out.println("Veci od dva uneta broja je broj " + veciBroj);



    }


}
