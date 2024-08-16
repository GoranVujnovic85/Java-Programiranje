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

        System.out.print("Unesite treci broj: ");
        int treciBroj = s.nextInt();

        int veciBroj = dvaBroja(prviBroj, drugiBroj);

        int veciOdPrvaDvaBroja = dvaBroja(veciBroj, treciBroj);

        System.out.println("Veci od prva dva uneta broja je broj: " + veciBroj);
        System.out.println("Veci od prva dva uneta broja pa zatim dodat treci broj je broj: " + veciOdPrvaDvaBroja);



    }


}
