import java.util.Scanner;

public class firstCode {

    public static void main(String[] args)
    {

        Scanner s = new Scanner(System.in);

        int tajniBroj =  55;

        for (int i = 0; i < 10; i++)
        {
            System.out.print("Unesite jedan broj: ");

            int broj = s.nextInt();

            if (broj == tajniBroj)
            {
                System.out.println("Pogodak!");
                break;
            }
            else
            {
                if (tajniBroj > broj)
                {
                    System.out.println("Tajni broj je veci od broja koji ste uneli!");
                }
                else
                {
                    System.out.println("Tajni broj je manji od broja koji ste uneli!");
                }
            }

        }

        System.out.println("Program je zavrsen!");
    }
}
