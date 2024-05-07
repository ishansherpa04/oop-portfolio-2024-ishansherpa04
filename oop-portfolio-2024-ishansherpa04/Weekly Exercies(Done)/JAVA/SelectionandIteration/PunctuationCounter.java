package SelectionandIteration;

public class PunctuationCounter {
    public static void main(String[] args) {
        String text = "Mary had a little lamb, her fleece was as white as snow, and everywhere Mary went, the lamb was sure to go. -that was a nice poem- the end. ";
        int[] counts = new int[32]; // Array to store counts for each punctuation mark

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (isPunctuation(c)) {
                counts[c - '!']++; // Increment count for the corresponding punctuation mark
            }
        }

        System.out.println("Punctuation Marks Counts:");
        for (int i = 0; i < counts.length; i++) {
            if (counts[i] > 0) {
                char c = (char) (i + '!');
                System.out.println(c + ": " + counts[i]);
            }
        }
    }

    private static boolean isPunctuation(char c) {
        return c >= '!' && c <= '~' && !Character.isLetterOrDigit(c);
    }
}
