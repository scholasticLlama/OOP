package Lab5;

public class Sentence {

    private Word[] words;
    private Punctuation[] punctuations;
    private String[] sentenceMembers;

    public Sentence(String sentenceString) {
        sentenceMembers = sentenceString.split("(?=[!\"#$%&'()*+,./:;<=>?@\\^_{|}~])| ");
        words = new Word[sentenceMembers.length];
        punctuations = new Punctuation[sentenceMembers.length];

        for (int i = 0; i < sentenceMembers.length; i++) {
            if (sentenceMembers[i].matches("[a-zA-Z0-9-`]+")) {
                if (new Word(sentenceMembers[i]).isSatisfyConditions()) {
                    words[i] = new Word(sentenceMembers[i]);
                }
            } else {
                punctuations[i] = new Punctuation(sentenceMembers[i]);
            }

        }
    }

    @Override
    public String toString() {
        StringBuilder sentenceString = new StringBuilder();
        if (words[0] != null) {
            sentenceString.append(" ");
        }

        for (int i = 0; i < words.length - 1; i++) {

            if (words[i] != null) {
                if (words[i].isSatisfyConditions()) {
                    sentenceString.append(sentenceMembers[i]);
                }
            }
            if (punctuations[i] != null) {
                sentenceString.append(sentenceMembers[i]);

            }

            if (words[i + 1] != null) {

                if (words[i + 1].isSatisfyConditions()) {
                    sentenceString.append(" ");
                }
            }

        }
        int j = sentenceString.length() - 1;

        if (sentenceString.length() - 1 >= 0) {
            while (String.valueOf(sentenceString.charAt(j)).matches("[!\"#$%&'()*+,./:;<=>?@\\^_{|}~]")) {
                j -= 1;
            }
            sentenceString.delete(j + 1, sentenceString.length());
        }
        sentenceString.append(sentenceMembers[sentenceMembers.length - 1]);
        return sentenceString.toString();
    }
}
