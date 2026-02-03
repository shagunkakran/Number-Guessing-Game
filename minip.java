import java.util.Scanner;
public class minip{
    public static void main (String[] args){
        //MINI PROJECT :)
        // NUMBER GUESSING 
        Scanner sc = new Scanner(System.in);
        int num = (int)(Math.random()*100); // Random number between 0 and 100
        int user_num = 0; // User's guess
        do{
            System.out.print("Guess the number :");
            user_num = sc.nextInt(); // User input
            if(user_num == num){
                System.out.println("WOHOO!! Correct number guessed!!");
                break;
            } else if(user_num > num){
                System.out.println("Too large....");
            } else {
                System.out.println("Too small....");
            }
        }while(user_num >= 0 && user_num <= 100);
        System.out.println("The number was : " + num);
        System.out.println("Thank you for playing the game :)");
    }
}