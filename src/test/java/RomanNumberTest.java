import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RomanNumberTest {

    @Test
    void shouldConvert1ToI() {
        assertEquals("I", toRoman(1));
    }

    private String toRoman(int i) {
        return "0";
    }

}
