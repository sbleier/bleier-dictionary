package bleier.dictionary;

public class DictionaryResponse {

    String word;
    String definition;

    public DictionaryResponse(String word, String definition) {
        this.word = word;
        this.definition = definition;
    }

    public String getWord() {
        return word;
    }

    public String getDefinition() {
        return definition;
    }

}
