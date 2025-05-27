import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        TextStatistik statistik = new TextStatistik();

        System.out.println("Skriv text (stop för att avsluta):");
        String input = scan.nextLine();

        while (!statistik.ärStop(input)) { // Flyttad kontroll hit
            statistik.läggTillRad(input);
            input = scan.nextLine();
        }

        System.out.println("Antal rader: " + statistik.getRadAntal());
        System.out.println("Antal tecken: " + statistik.getTeckenAntal());
        System.out.println("Antal ord: " + statistik.getOrdAntal());
        System.out.println("Längsta ordet: " + statistik.getLängstaOrdet());
    }
}
