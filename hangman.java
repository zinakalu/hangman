
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;


public class Hangman {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List <String> words = List.of("Monday", "Tuesday", "Wednesday"); //words is an arraylist of strings
        //choose a random word from list
        Random random = new Random();
        //Math.abs(-3) == 3
        int randomNumber = Math.abs(random.nextInt() % words.size()); //gives random integer and interger is less than 3 (that's what the modulous does)
        String randomWord = words.get(randomNumber);

        int lengthOfWord = randomWord.length(); //.length() returns length of the random word which should be an int; we need this many underscores
        ArrayList<Character> underscores = new ArrayList<>(); //create a list of underscores to represent the hidden word
        for (int i = 0; i < lengthOfWord; i++){
            underscores.add('_'); //adds the right number of underscores
        }
        //add lengthOfWord underscores to the list of underscores
        System.out.println("WElcome to H_NGM_N!"); //printing the welcome message
        //set the number of guesses
        final int NUMBER_OF_GUESSES = 5; //final means the variable isn't changing as it's constant

        int currentGuess = 0;
        while(currentGuess < NUMBER_OF_GUESSES && underscores.contains('_')){ //as long as underscore still has an underscore or current guess is less than num of guessing keep playing
            System.out.println("Current word: " + underscores); //print the current state of the word
            System.out.println("Enter your guess: "); //get the user's guess

            String guess = null;
            guess = scanner.nextLine(); //this is the letter the user inputted
            //test if the string is of length 1 or try cast to char and it's throws an error
            
            //we want to check if guess is in randomWord. How?
            if (randomWord.toLowerCase().contains(guess.toLowerCase())){
                int i = randomWord.toLowerCase().indexOf(guess); //what happens if the word has more than one of the same letter?
                underscores.set(i, guess.toLowerCase().charAt(0)); //set this (i) equal to the second argument charAt() gets the first character of whatever the user inputs

            } else{
                System.out.println( "The letter "+ guess +" is not in the word!");
                currentGuess ++; //if they guess wrong their guess goes up. 
            }
        }
        if (!underscores.contains('_')){
            System.out.println("You guessed it! Nice work.");
        } else{
            System.out.println("You lost, the word was " +  randomWord);
        }
    }
}

//.contains() -> checks for individual or multiple letter(s)

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