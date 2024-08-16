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

    public static int najveciOdTriBroja (int a, int b, int c)
    {
       int veciOdPrvaDva = dvaBroja(a, b);

       int najveciOdTriBroja = dvaBroja(veciOdPrvaDva, c);

       return najveciOdTriBroja;
    }

    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);

        System.out.print("Unesite prvi broj: ");
        int prviBroj = s.nextInt();

        System.out.print("Unesite drugi broj: ");
        int drugiBroj = s.nextInt();

        System.out.print("Unesite treci broj: ");
        int treciBroj = s.nextInt();

        int zaIspis = najveciOdTriBroja(prviBroj, drugiBroj, treciBroj);

        System.out.println("Najveci od tri uneta broja je broj: " + zaIspis);


    }

}
