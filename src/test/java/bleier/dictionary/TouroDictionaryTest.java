package bleier.dictionary;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class TouroDictionaryTest {

    @Test
    void lookup() throws IOException {
        TouroDictionary dict = new TouroDictionary();
        String def = dict.lookup("Hello");

        assertEquals("to {greet=v} [v -ED, -ING, -ES or -S]", def);
    }


}