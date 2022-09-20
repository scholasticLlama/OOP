package Lab5;

public class Letter {
    private char symbol;

    public Letter(char symbol) {
        this.symbol = symbol;
    }

    public boolean isLetterConstant() {
        return String.valueOf(symbol).matches("(?:(?![aeioyuAEUIOY])[a-zA-Z])");
    }

    @Override
    public String toString() {
        return "" + symbol;
    }

}
