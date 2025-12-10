package bleier.dictionary;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;

public class TouroDictionary {

    private HashMap<String, String> dictionary = new HashMap<>();

    public TouroDictionary() throws IOException {
            InputStream in = getClass().getClassLoader().getResourceAsStream("dictionary.txt");
            BufferedReader br = new BufferedReader(new InputStreamReader(in));
            String currentLine = br.readLine();
            while (currentLine != null) {
                if (currentLine.contains(" ")) {
                    dictionary.put(currentLine.substring(0, currentLine.indexOf(" ")),
                            currentLine.substring(currentLine.indexOf(" ") + 1));
                } else {
                    dictionary.put(currentLine, "");
                }
                currentLine = br.readLine();
            }
    }

    public String lookup(String word) {
        return dictionary.get(word.toUpperCase());
    }

}
