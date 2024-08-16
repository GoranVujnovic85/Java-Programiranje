import java.util.Scanner;

public class firstCode {

    public static void main(String[] args)
    {

        Scanner s = new Scanner(System.in);

        System.out.print("Unesite iznos za isplatu: ");

        int iznos = s.nextInt();

        s.nextLine(); // sa ovim cistim buffer kao u C jeziku - fflush(stdout); - //

        int zaIsplatu5000 = 0;
        int zaIsplatu2000 = 0;
        int zaIsplatu1000 = 0;
        int zaIsplatu500 = 0;
        int zaIsplatu200 = 0;
        int zaIsplatu100 = 0;
        int zaIsplatu50 = 0;
        int zaIsplatu20 = 0;
        int zaIsplatu10 = 0;
        int zaIsplatu5 = 0;
        int zaIsplatu2 = 0;
        int zaIsplatu1 = 0;


        while (iznos >= 5000)    // 20000
        {
            zaIsplatu5000++;      // 1, 1, 1, 1
            iznos -= 5000;        // 15000, 10000, 5000, 0
        }

        while (iznos >= 2000)
        {
            zaIsplatu2000++;
            iznos -= 2000;
        }

        while (iznos >= 1000)
        {
            zaIsplatu1000++;
            iznos -= 1000;
        }

        while (iznos >= 500)
        {
            zaIsplatu500++;
            iznos -= 500;
        }

        while (iznos >= 200)
        {
            zaIsplatu200++;
            iznos -= 200;
        }

        while (iznos >= 100)
        {
            zaIsplatu100++;
            iznos -= 100;
        }

        while (iznos >= 50)
        {
            zaIsplatu50++;
            iznos -= 50;
        }

        while (iznos >= 20)
        {
            zaIsplatu20++;
            iznos -= 20;
        }

        while (iznos >= 10)
        {
            zaIsplatu10++;
            iznos -= 10;
        }

        while (iznos >= 5)
        {
            zaIsplatu5++;
            iznos -= 5;
        }

        while (iznos >= 2)
        {
            zaIsplatu2++;
            iznos -= 2;
        }

        while (iznos >= 1)
        {
            zaIsplatu1++;
            iznos -= 1;
        }

        if (zaIsplatu5000 > 0)
        {
            System.out.println("Potrebno je isplatiti " + zaIsplatu5000 + " novcanice od 5000 din.");
        }

        if (zaIsplatu2000 > 0)
        {
            System.out.println("Potrebno je isplatiti " + zaIsplatu2000 + " novcanice od 2000 din.");
        }

        if (zaIsplatu1000 > 0)
        {
            System.out.println("Potrebno je isplatiti " + zaIsplatu1000 + " novcanice od 1000 din.");
        }

        if (zaIsplatu500 > 0)
        {
            System.out.println("Potrebno je isplatiti " + zaIsplatu500 + " novcanice od 500 din.");
        }

        if (zaIsplatu200 > 0)
        {
            System.out.println("Potrebno je isplatiti " + zaIsplatu200 + " novcanice od 200 din.");
        }

        if (zaIsplatu100 > 0)
        {
            System.out.println("Potrebno je isplatiti " + zaIsplatu100 + " novcanice od 100 din.");
        }

        if (zaIsplatu50 > 0)
        {
            System.out.println("Potrebno je isplatiti " + zaIsplatu50 + " novcanice od 50 din.");
        }

        if (zaIsplatu20 > 0)
        {
            System.out.println("Potrebno je isplatiti " + zaIsplatu20 + " novcanice od 20 din.");
        }

        if (zaIsplatu10 > 0)
        {
            System.out.println("Potrebno je isplatiti " + zaIsplatu10 + " novcanice od 10 din.");
        }

        if (zaIsplatu5 > 0)
        {
            System.out.println("Potrebno je isplatiti " + zaIsplatu5 + " novcanice od 5 din.");
        }

        if (zaIsplatu2 > 0)
        {
            System.out.println("Potrebno je isplatiti " + zaIsplatu2 + " novcanice od 2 din.");
        }

        if (zaIsplatu1 > 0)
        {
            System.out.println("Potrebno je isplatiti " + zaIsplatu1 + " novcanice od 1 din.");
        }

        System.out.println("Program je zavrsen!");
    }
}
