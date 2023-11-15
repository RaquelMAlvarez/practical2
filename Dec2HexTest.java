import org.junit.Test;
import static org.junit.Assert.*;

public class Dec2HexTest {

    @Test
    public void testNullInput() {
        String[] args = {};
        try {
            Dec2Hex.main(args);
            fail("Expected an exception for null input");
        } catch (ArrayIndexOutOfBoundsException e) {
            assertEquals("No input argument provided.", e.getMessage());
        }
    }

    @Test
    public void testNonNumericInput() {
        String[] args = {"abc"};
        try {
            Dec2Hex.main(args);
            fail("Expected an exception for non-numeric input");
        } catch (NumberFormatException e) {
            assertEquals("For input string: \"abc\"" e.getMessage());
        }
    }
}






 



