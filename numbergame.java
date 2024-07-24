import java.util.Random;
import java.util.Scanner;

public class numbergame {

    public static void main(String[] args) {
        int guess;
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your guess: ");
        guess = scanner.nextInt();
        scanner.close();

        Random r = new Random();
        
        int low = 1;
        int high = 100;
        int result = r.nextInt(high-low) + low;
        System.out.println("the number is " + result);

        if (result == guess){

            System.out.println("Correct!");
        }
        else{

            System.out.println("Sorry, Try Again! ");
        }

    }
    
}
