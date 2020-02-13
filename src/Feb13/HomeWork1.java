package Feb13;
import java.util.Scanner;
public class HomeWork1 {

         public static void main(String[] args) {
            int numberToGuess = 23;
            int userGuess=0;
            Scanner myScanner = new Scanner(System.in);
                     while(userGuess!=numberToGuess) {
                System.out.print("Guess the number: ");
                userGuess = myScanner.nextInt();
                if (userGuess > numberToGuess) {
                    System.out.println("Your guess is larger than target, try smaller");
                } else if (userGuess < numberToGuess) {
                    System.out.println("Your guess is smaller than target, try larger");
                }
                else {
                    System.out.println("Congrats...you found it!");
                }
            }


        }
    }



