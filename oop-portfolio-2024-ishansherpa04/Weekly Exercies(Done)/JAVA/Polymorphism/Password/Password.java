package Password;

public class Password implements Encryptable {
	private static final String KEY = "zyxwvutsrqponmlkjihgfedcba";

    @Override
    public String encrypt(String text) {
        StringBuilder encryptedText = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            int index = Character.toLowerCase(currentChar) - 'a';
            if (index >= 0 && index < KEY.length()) {
                char encryptedChar = KEY.charAt(index);
                if (Character.isUpperCase(currentChar)) {
                    encryptedText.append(Character.toUpperCase(encryptedChar));
                } else {
                    encryptedText.append(encryptedChar);
                }
            } else {
                encryptedText.append(currentChar);
            }
        }
        return encryptedText.toString();
    }

    @Override
    public String decrypt(String encryptedText) {
        StringBuilder decryptedText = new StringBuilder();
        for (int i = 0; i < encryptedText.length(); i++) {
            char currentChar = encryptedText.charAt(i);
            int index = KEY.indexOf(Character.toLowerCase(currentChar));
            if (index >= 0) {
                char decryptedChar = (char) ('a' + index);
                if (Character.isUpperCase(currentChar)) {
                    decryptedText.append(Character.toUpperCase(decryptedChar));
                } else {
                    decryptedText.append(decryptedChar);
                }
            } else {
                decryptedText.append(currentChar);
            }
        }
        return decryptedText.toString();
    }

}
