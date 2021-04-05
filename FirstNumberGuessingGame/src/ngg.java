import java.util.Scanner;

public class ngg {

    public static void main(String[] args) {

    
        int secretNumber = (int) (Math.random() * 99 + 1);
        int guess;

        System.out.println("Guess the Secret Number!");
        Scanner keyboard = new Scanner(System.in);
        do {
        
        System.out.print("Enter a guess: ");
        guess = keyboard.nextInt();
        System.out.println("Your guess is " + guess);
        
        if(guess == secretNumber){
        	System.out.println("Your guess was correct!");
        } else if (guess < secretNumber) {System.out.println("Your guess is smaller than the secret number.");}
        else if (guess > secretNumber) {System.out.println("Your guess is bigger than the secret number");}
    }  while (guess != secretNumber);
        keyboard.close();
        }
    
    }

