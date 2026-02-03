// Name: Number Guessing Game
import java.util.Scanner;
public class mp{
    public static void main(String[] args){
        //MINI PROJECT
        Scanner sc = new Scanner(System.in);
        int num = (int)(Math.random()*100);
        int guess = 0;
        int attempts = 0;
        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I have selected a number between 1 and 100. Can you guess it?");
        System.out.println("You have 10 attempts to guess the number.");
        System.out.println("Enter your guess: ");
        while(guess != num && attempts < 10){
            guess = sc.nextInt();
            attempts++;
            if(guess < num){
                System.out.println("Too low! Try again.");
            } else if(guess > num){
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Congratulations! You guessed the number in " + attempts + " attempts.");
            }
        }
        if(attempts == 10){
            System.out.println("Sorry! You've used all your attempts. The number was " + num + ".");
        }
        System.out.println("Thank you for playing the Number Guessing Game!");
    }
    
}
