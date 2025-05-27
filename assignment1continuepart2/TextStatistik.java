public class TextStatistik {

    private int radAntal = 0;
    private int teckenAntal = 0;
    private int ordAntal = 0;
    private String längstaOrdet = "";

    public void läggTillRad(String rad) {
        // Räknar rad
        radAntal++;
        teckenAntal += rad.length();

        // Räkna ord (separerade med blanksteg)
        String[] ord = rad.split(" ");
        ordAntal += ord.length;

        // Kolla om det finns ett längre ord än nuvarande
        for (String ettOrd : ord) {
            if (ettOrd.length() > längstaOrdet.length()) {
                längstaOrdet = ettOrd;
            }
        }
    }

    public int getRadAntal() {
        return radAntal;
    }

    public int getTeckenAntal() {
        return teckenAntal;
    }

    public int getOrdAntal() {
        return ordAntal;
    }

    public String getLängstaOrdet() {
        return längstaOrdet;
    }

    // Flytta kontrollen för "stop" hit (istället för Main)
    public boolean ärStop(String rad) {
        return rad.equalsIgnoreCase("stop");
    }
}
