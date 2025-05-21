public class TextStatistik   // endast metoder som åkallas via Main

{

    private int radAntal = 0;   // radantal börjar på 0
    private int teckenAntal = 0; // teckenLängd börjar på 0

    public void läggTillRad(String rad) {
        radAntal++;  // radantal ökar  med 1
        teckenAntal += rad.length();  // teckenantal blir + och sen lika med nya längden
    }

    public int getRadAntal() {
        return radAntal;    // ger oss slut resultaten
    }

    public int getTeckenAntal() {
        return teckenAntal;  // ger oss result
    }
}
