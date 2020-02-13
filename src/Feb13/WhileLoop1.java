package Feb13;
import java.util.Scanner;
public class WhileLoop1 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.print("type any umber between 1 and 10 inclusively:");
        int number = x.nextInt();
        if (number <= 10 && number!=0) {
            while (number > 0) {
                number++;
            }
            System.out.println("the number is between 1 and 10");
        } else {
            System.out.println("the number is out of range");
        }
    }

}