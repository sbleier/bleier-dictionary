import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;


class TouroDictionaryTest {

    @Test
    void lookup() throws IOException {
        TouroDictionary dict = new TouroDictionary();
        String def = dict.lookup("Hello");

        assertEquals("to {greet=v} [v -ED, -ING, -ES or -S]", def);
    }

    @Test
    void lookupAA() throws IOException {
        TouroDictionary dict = new TouroDictionary();
        String def = dict.lookup("AA");

        assertEquals("rough, cindery lava [n -S]", def);
    }

}