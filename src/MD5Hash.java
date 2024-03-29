import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;

public class MD5Hash {

    private String input;
    // Calculates the MD5 hash of a given input string
    public String calculateHash(String input) {
        try {
            this.input = input;
            // Create an instance of the Java built in  MD5 hash algorithm
            MessageDigest mdObj = MessageDigest.getInstance("MD5");

            // Calculating the hash value of the input string
            byte[] hashBytes = mdObj.digest(input.getBytes());

            // Converting the hash value from bytes to a hexadecimal string
            StringBuilder hash = new StringBuilder();
            for (byte b : hashBytes) {
                hash.append(String.format("%02x", b));
            }
            return hash.toString();

        } catch (NoSuchAlgorithmException e) {
            System.err.println("MD5 hash algorithm module cannot be found available.");
            return null;
        }
    }

    // Incomplete - Checking for inputs that produce the same MD5 hash as the given hash value
    public List<String> findCollisions(String hash) {
        List<String> collidingInputs = new ArrayList<>();
        String inputHash = calculateHash(input);
        // Checking if the hash value matches the given hash
        // Computing the MD5 hash of the input string
        if (inputHash.equals(hash)) {
            collidingInputs.add(input);
        }
        //Returning list of collisions
        return collidingInputs;
    }
}
