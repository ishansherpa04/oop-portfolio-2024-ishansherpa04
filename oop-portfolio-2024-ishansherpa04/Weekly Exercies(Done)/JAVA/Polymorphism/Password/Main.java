package Password;

public class Main {

	public static void main(String[] args) {
		Encryptable secret = new Secret();
        Encryptable password = new Password();

       
        String originalText = "Moody";
        String secretEncrypted = secret.encrypt(originalText);
        String secretDecrypted = secret.decrypt(secretEncrypted);

        String passwordEncrypted = password.encrypt(originalText);
        String passwordDecrypted = password.decrypt(passwordEncrypted);

        // Output results
        System.out.println("Original Text: " + originalText);
        System.out.println("Secret Encrypted: " + secretEncrypted);
        System.out.println("Secret Decrypted: " + secretDecrypted);
        System.out.println("Password Encrypted: " + passwordEncrypted);
        System.out.println("Password Decrypted: " + passwordDecrypted);

	}

}
