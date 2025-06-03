public class TextStatistik {
//atributer
    private int radAntal = 0;
    private int teckenAntal = 0;
    private int ordAntal = 0;
    private String längstaOrdet = "";
//metod
    public void läggTillRad(String rad) {
        // Räknar antalet rader

        radAntal++;
        //räknar längden på raden
        teckenAntal += rad.length();

        // Räkna ord (separerade med space)
        String[] ord = rad.split(" ");
        //räknar hur många ord det är i  raden och lägger sen till det i totala
        ordAntal += ord.length;

        // loopar igenom alla ord i raden  om något ord är längre än det längsta
        //byts den nya mot det gamla längsta.
        for (String ettOrd : ord) {
            if (ettOrd.length() > längstaOrdet.length()) {
                längstaOrdet = ettOrd;
            }
        }
    }
//returnerar hur många rader som lagts till
    public int getRadAntal() {
        return radAntal;
    }
    //returnerar totala antalet tecken, alltså varje tangenttryck totala.
    public int getTeckenAntal() {
        return teckenAntal;
    }
//returnerar antal ord hela ord tills man trycker space
    public int getOrdAntal() {
        return ordAntal;
    }
//returnerar längsta ordet
    public String getLängstaOrdet() {
        return längstaOrdet;
    }

    // Flytta kontrollen för "stop" hit (istället för Main)
    //om användarens ord är lika med stop slutar programmet
    public boolean ärStop(String rad) {
        return rad.equalsIgnoreCase("stop");
    }
}
