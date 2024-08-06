package com.vamsi;

public class Exercise_25ifstmnts {
    public static void main(String[] args) {
        // create a String variable and assign it a value
        // create a `for` loop which wraps around your answer from Question 7
        // modify your `if` statement to check the character at each index
        // Hint: use your internal, incrementing value of your `for` loop within the `.charAt()` method
        // print something to the console if the condition is met

        String name = "HEMANTH";

        // Specify the character to check for (convert to lowercase for case-insensitive check)
        char specifiedCharacter = 'a'; // You can change this character to test different cases

        // Convert the specified character to lowercase for case-insensitive check
        char specifiedCharLowercase = Character.toLowerCase(specifiedCharacter);

        // Use a for loop to check if the specified character is present in the word
        boolean characterFound = false;
        for (int i = 0; i < name.length(); i++ ) {
            char currentChar = Character.toLowerCase(name.charAt(i));
            if (currentChar == specifiedCharLowercase) {
                characterFound = true;
                break; // Exit the loop early as soon as the character is found
            }
        }
            // Check if the character was found and print the result
            if (characterFound){
                System.out.println("The word contains specific character '" + specifiedCharacter + "' (case-insensitive)");
            } else {
                System.out.println("The word doesn't contain specific character '" + specifiedCharacter + "' (case-insensitive)");
            }
        }
    }



