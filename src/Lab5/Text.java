package Lab5;

public class Text {

    private Sentence[] sentences;

    public Text(String textString) {
        String[] sentenceStrings = textString.split("(?<=[?.!])\\s?");
        sentences = new Sentence[sentenceStrings.length];
        for (int i = 0; i < sentenceStrings.length; i++) {
            sentences[i] = new Sentence(sentenceStrings[i]);

        }
    }

    @Override
    public String toString() {
        StringBuilder textStringBuilder = new StringBuilder();
        for (Sentence sentence : sentences) {
            textStringBuilder.append(sentence);
        }
        return textStringBuilder/*.toString()*/.substring(1);
    }
}

