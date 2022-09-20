package Lab5;

public class Punctuation {

    private final String symbolsString;

    public Punctuation(String symbolsString) {
        this.symbolsString = symbolsString;
    }

    @Override
    public String toString() {
        return symbolsString;
    }
}
