package Feb13;

public class SwitchCase {
public static void main(String[] args) {
    int i=10;
    switch (i){
        case 1:
            System.out.println(i+" is one");
            //break;
        case 2:
            System.out.println(i+" is two");
            break;
        default:
            System.out.println(i+" is smaller than 15");
    }

    }
}