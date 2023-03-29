# DataEncryption
This program implements a simple Caesar Cipher encryption algorithm and MD5 Hash algorithm in Java.

## Caesar Cipher Encryption
The Caesar Cipher encryption algorithm works by shifting each letter in 
the plaintext by a certain number of positions in the alphabet. In this program, 
the shift amount is set to 5. The encryption algorithm is implemented in the `encrypt()` 
method of the CaesarCipher class.
The `encrypt()` method loops through each character in the plaintext and shifts it by 
the specified amount using the Caesar Cipher algorithm. The shifted characters are then 
added to a string, which is returned as the ciphertext.

## MD5 Hash Algorithm
MD5 (Message Digest 5) is a widely used cryptographic hash function that takes a
message of arbitrary length and generates a fixed-sized 128-bit hash value.
The MD5 algorithm works by taking the input message and processing it through a series 
of mathematical operations to generate a fixed-sized output called a hash value.
The resulting hash value is unique to the input message, and even small changes in 
the input will result in a completely different hash value.

This Java program demonstrates the computation of MD5 hash of an input string and 
finding collisions in the hash value. It includes the following functionalities:
- Compute and display the MD5 hash of the input string
- Find and display inputs that produce the same MD5 hash as the given hash value

## Classes
- MD5Hash.java: Contains the main program that computes the MD5 hash and finds collisions in the hash value.
- CaesarCipher.java: Contains a program that implements the Caesar Cipher algorithm to encrypt a plaintext message.




