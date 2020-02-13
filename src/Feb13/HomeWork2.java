package Feb13;

import java.net.SocketOption;

public class HomeWork2 {
    public static void main(String[] args) {
for(int a=1; a<10;a++){
    System.out.print("\t"+a);
}
    System.out.print("\n");
      System.out.println("---------------------------------------");
        for(int i=1; i<10;i++){
            System.out.print(i+":"+"\t");

            for(int j=1; j<10; j++){
                System.out.print((i*j)+"\t");
                          }
            System.out.print("\n");

        }
    }
}
