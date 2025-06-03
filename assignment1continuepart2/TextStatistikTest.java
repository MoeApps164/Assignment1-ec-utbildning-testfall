import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TextStatistikTest {
//detta är test filen @Test säger till programmet att använda org.junit. som vi importerat
    @Test
    //skapar ny objekt utav textstatistik  och sedan sätter vi själva värden för testa
    //i detta fall läggtill rad och radantalet ska vara 1 för vara korekt
    public void testAttRadRäknas() {
        TextStatistik ts = new TextStatistik();
        ts.läggTillRad("Hej");
        assertEquals(1, ts.getRadAntal());
    }
// i denna testar vi teckenantal där teckenantal ska vbara 6 altså ord samanlagt
    //man tryckt i tangentbordet
    @Test
    public void testAttTeckenRäknas() {
        TextStatistik ts = new TextStatistik();
        ts.läggTillRad("Hej"); // 3 tecken
        ts.läggTillRad("Där"); // 3 till
        assertEquals(6, ts.getTeckenAntal());

    }
    //testar att inget händer alltså 0 utav 0 ingen atribut läggs in
    @Test
    public void testAttIngetHänderUtanRad() {
        TextStatistik ts = new TextStatistik();
        assertEquals(0, ts.getRadAntal());
        assertEquals(0, ts.getTeckenAntal());
    }
    // test om ordantal visar korakt exempel hej ali   räknas som 2 ord
    @Test
    public void testOrdAntalRäknasKorrekt() {
        TextStatistik ts = new TextStatistik();
        ts.läggTillRad("Hej världen");
        ts.läggTillRad("Det här är en test");
        // Hej världen = 2 ord
        // Det här är en test = 5 ord
        // Totalt = 7 ord
        assertEquals(7, ts.getOrdAntal());
    }

}
