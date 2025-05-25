import java.util.Scanner;

public class Main {


    public static void main(String[] args) // Programmet startar här

    {
        Scanner scan = new Scanner(System.in);
        TextStatistik statistik = new TextStatistik(); //skapar ett nytt objekt

        System.out.println("Skriv text (stop för att avsluta):");
        String input = scan.nextLine();  // ger oss tillgång till nya rader efter enter

        while (!input.equals("stop"))  // om inte användarens input är lika med ordet stop slutar inte loopen
        {
            statistik.läggTillRad(input);  // lägger till raderna som input angivit efter enter
            input = scan.nextLine();  // går till ny rad
        }

        System.out.println("Antal rader: " + statistik.getRadAntal());
        System.out.println("Antal tecken: " + statistik.getTeckenAntal());
    }
}
