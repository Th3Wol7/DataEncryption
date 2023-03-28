import java.util.Scanner;

public class CesarCipher {
    /*
        Standard Alphabet:              A B C D E F G H I J K L M N O P Q R S T U V W X Y Z
        Alphabet when shifted by 5      F G H I J K L M N O P Q R S T U V W X Y Z A B C D E
     */
    public String encrypt(String originalText, int shift) {
        String cipherText = "";

        for (int i = 0; i < originalText.length(); i++) {
            char ch = originalText.charAt(i);
            // Shift the character by the specified amount
            if (Character.isUpperCase(ch)) {
                ch = (char) ((ch + shift - 65) % 26 + 65); //since 'A' ascii value is 65
            } else if (Character.isLowerCase(ch)) {
                ch = (char) ((ch + shift - 97) % 26 + 97); //Since 'a' ascii value is 97
            }
            //Add character in same position of shifted alphabet
            cipherText += ch; // - character represented by ascii value return from shift calculation
        }

        return cipherText;//
    }
}
