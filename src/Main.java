import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CesarCipher cipher = new CesarCipher();
        MD5Hash md5 = new MD5Hash();
        Scanner scanner = new Scanner(System.in);
        String input;
        do {
            // prompt user to enter a plain text
            System.out.println("Enter plaintext: ");
            input = scanner.nextLine();
            
            // pass user input into the cipher encrypt method
            String ciphertext = cipher.encrypt("plaintext", 5);

            //output to the user the original text and the encrypted text 
            System.out.println("Original Text: " + input);
            System.out.println("Cesear Encrypted Ciphertext: " + ciphertext);

            // Computing input hash
            String hashValue = md5.calculateHash(input);
            System.out.println("MD5 hash value: " + hashValue + "\n");

            // Check for collisions
            md5.findCollisions(hashValue, input);

            // ask if they would like to hash an encrypt another text
            System.out.println("\n***************************** ");
            System.out.println("Do You Want Encrypted and Hash another Value \n(N) for no (Y) for yes ?:  ");
            input = scanner.nextLine();

        } while (input.equalsIgnoreCase("Y"));
        scanner.close();
    }
}