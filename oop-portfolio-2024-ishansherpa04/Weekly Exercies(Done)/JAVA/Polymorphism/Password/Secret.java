package Password;

public class Secret implements Encryptable{
	private static final int SHIFT = 3;

    @Override
    public String encrypt(String text) {
        StringBuilder encryptedText = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            if (Character.isLetter(currentChar)) {
                char base = Character.isLowerCase(currentChar) ? 'a' : 'A';
                encryptedText.append((char) ((currentChar - base + SHIFT) % 26 + base));
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
            if (Character.isLetter(currentChar)) {
                char base = Character.isLowerCase(currentChar) ? 'a' : 'A';
                decryptedText.append((char) ((currentChar - base - SHIFT + 26) % 26 + base));
            } else {
                decryptedText.append(currentChar);
            }
        }
        return decryptedText.toString();
    }

}
