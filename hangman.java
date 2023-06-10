
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.Random;

public class hangman {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List <String> words = List.of("Monday", "Tuesday", "Wednesday"); //words is an arraylist of strings
        //choose a random word from list
        Random random = new Random();
        int randomNumber = random.nextInt() % words.size(); //gives random integer and interger is less than 3 (that's what the modulous does)
        String randomWord = words.get(randomNumber);

        int lengthOfWord = randomWord.length(); //.length() returns length of the random word which should be an int; we need this many underscores
        List<Character> underscores = new ArrayList<>(); //create a list of underscores to represent the hidden word
        for (int i = 0; i < lengthOfWord; i++){
            underscores.add('_'); //adds the right number of underscores
        }
        //add lengthOfWord underscores to the list of underscores
        System.out.println("WElcome to H_NGM_N!"); //printing the welcome message
        //set the number of guesses
        final int NUMBER_OF_GUESSES = 5; //final means the variable isn't changing as it's constant

        int currentGuess = 0;
        while(currentGuess < NUMBER_OF_GUESSES){
            System.out.println("Current word: " + underscores);
            System.out.println("Enter your guess: ");
        }
    }
}

//1: import Scanner
//2: have a variable for random word
//3: print out same number of underscores as letters in that word
//4: if statement and loop
//5: error catching

//get random word 
        //convert to a list of char
        //print out welcome
        //loop{
            //user enters guess
            //check if the guess is in the list of char
            //if yes{
                //print success
            //}
            //else{
                //print failure
            //}
        //}