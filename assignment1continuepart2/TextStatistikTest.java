import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TextStatistikTest {

    @Test
    public void testAttRadRäknas() {
        TextStatistik ts = new TextStatistik();
        ts.läggTillRad("Hej");
        assertEquals(1, ts.getRadAntal());
    }

    @Test
    public void testAttTeckenRäknas() {
        TextStatistik ts = new TextStatistik();
        ts.läggTillRad("Hej"); // 3 tecken
        ts.läggTillRad("Där"); // 3 till
        assertEquals(6, ts.getTeckenAntal());
    }
    @Test
    public void testAttIngetHänderUtanRad() {
        TextStatistik ts = new TextStatistik();
        assertEquals(0, ts.getRadAntal());
        assertEquals(0, ts.getTeckenAntal());
    }
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
