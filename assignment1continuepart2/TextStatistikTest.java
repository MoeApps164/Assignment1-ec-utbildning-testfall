import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TextStatistikTest {

    @Test
    public void testAttRadRäknas() {
        TextStatistik ts = new TextStatistik();
        ts.läggTillRad("Hej");
        assertEquals(1, ts.getRadAntal());
    }

}
