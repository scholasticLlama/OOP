package Lab5;

public class Word {

    private Letter[] letters;

    public Word(String wordString) {
        letters = new Letter[wordString.length()];
        for (int i = 0; i < wordString.length(); i++) {
            letters[i] = new Letter(wordString.charAt(i));
        }
    }

    public boolean isFirstLetterConstant() {
        return letters[0].isLetterConstant();
    }

    public boolean isLengthCorrect() {
        return letters.length == 4;
    }

    public boolean isSatisfyConditions() {
        return !(isFirstLetterConstant() && isLengthCorrect());
    }

    @Override
    public String toString() {
        StringBuilder wordString = new StringBuilder();
        for (Letter letter : letters) {
            wordString.append(letter);
        }
        return wordString.toString();
    }
}