import java.util.Scanner;




public class Main {
    //Programmet börjar här i main


    public static void main(String[] args) {
        // gör det möjligt att ta in input
        Scanner scan = new Scanner(System.in);
        //skapar ett nytt objekt av textstatistik så vi kan sätta input atrtibuter i den
        TextStatistik statistik = new TextStatistik();

        System.out.println("Skriv text (stop för att avsluta):");
        // gör en ny rad
        String input = scan.nextLine();
//logiken att programmet ska loopa tills ordet stop skrivs in i input om inte
        //lägg till en ny rad i listan och gå till nästa rad
        while (!statistik.ärStop(input)) {
            statistik.läggTillRad(input);
            input = scan.nextLine();
        }
//skriver ut de totala av allt
        System.out.println("Antal rader: " + statistik.getRadAntal());
        System.out.println("Antal tecken: " + statistik.getTeckenAntal());
        System.out.println("Antal ord: " + statistik.getOrdAntal());
        System.out.println("Längsta ordet: " + statistik.getLängstaOrdet());
    }
}
