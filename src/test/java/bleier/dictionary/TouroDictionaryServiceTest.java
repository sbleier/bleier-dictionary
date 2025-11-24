package bleier.dictionary;

import org.junit.jupiter.api.Test;
import retrofit2.Response;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TouroDictionaryServiceTest {

    @Test
    public void lookup() {
        //given
        TouroDictionaryServiceFactory factory = new TouroDictionaryServiceFactory();
        TouroDictionaryService service = factory.create();

        //when
        DictionaryRequest request = new DictionaryRequest("DAYSTAR");
        DictionaryResponse body = service.lookup(request).blockingGet();

        //then
        assertEquals("DAYSTAR", body.getWord());
        assertEquals("a planet visible in the east just before sunrise [n -S]", body.getDefinition());



    }
}
