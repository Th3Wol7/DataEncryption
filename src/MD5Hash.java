import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MD5Hash {
    LinkedList collidingInputsDictionaries = new LinkedList();
    
    // creating dictionary with plain text and their corresponding has values 
    public void createDictionary() {
        collidingInputsDictionaries.addToList(new HashDictionary("HelloWorld", calculateHash("HelloWorld")));
        collidingInputsDictionaries.addToList(new HashDictionary("GoodByeWorld", calculateHash("GoodByeWorld")));
    }


    // Calculates the MD5 hash of a given input string
    public String calculateHash(String input) {
        try {
            // Create an instance of the Java built in MD5 hash algorithm
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

    // Checking for inputs that produce the same MD5 hash as the given hash value
    public void findCollisions(String hash, String input) {
        if (collidingInputsDictionaries.getSize() == 0) {
             createDictionary();
        }
        Boolean found=false;
        for (int i = 0; i < collidingInputsDictionaries.getSize(); i++) {
            // Checking if the hash value matches the given hash
            if (collidingInputsDictionaries.retrieve(i).getHashtxt().equalsIgnoreCase(hash)) {
                System.out.println("Collision Found !!!");
                System.out.println("Pulling from Dictionary");
                System.out.println(collidingInputsDictionaries.retrieve(i));
                found=true;
            }
        }
        if (!found) {
            System.out.println("No collisions detected.");
            System.out.println("Adding Text and hash value to the Dictionary");
            collidingInputsDictionaries.addToList(new HashDictionary(input, hash));
            System.out.println("Added Successfully");
            
        }
    }
}
