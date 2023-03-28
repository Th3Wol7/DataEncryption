import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CesarCipher cipher = new CesarCipher();
        MD5Hash md5 = new MD5Hash();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter plaintext: ");
        String input = scanner.nextLine();
        String ciphertext = cipher.encrypt("plaintext", 5);

        System.out.println("Original Text: " + input);
        System.out.println("Cesear Encrypted Ciphertext: " + ciphertext);

        //Computing input hash
        String hashValue = md5.calculateHash(input);
        System.out.println("MD5 hash value: " + hashValue);

        // Check for collisions
        List<String> detectedCollisions = md5.findCollisions(hashValue);

        // Print the colliding inputs, if any
        if (detectedCollisions.isEmpty()) {
            System.out.println("No collisions detected.");
        } else {
            System.out.println("Collisions detected:");
            for (String collidingInput : detectedCollisions) {
                System.out.println(collidingInput);
            }
        }
    }
}