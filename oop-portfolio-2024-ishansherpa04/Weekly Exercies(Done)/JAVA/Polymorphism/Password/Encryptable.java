package Password;

public interface Encryptable {
	String encrypt(String text);
	   String decrypt(String encryptedText);
}
