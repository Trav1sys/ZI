import java.util.Scanner;

public class Laba1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int p = 30803;
        int g = 2;
        System.out.print("Enter secret key 1: ");
        int x = s.nextInt();
        System.out.print("Enter secret key 2: ");
        int y = s.nextInt();

        double valuex;
        double valuey;

        valuex = Math.pow(g,x)%p; //публичные числа
        valuey = Math.pow(g,y)%p; //публичные числа

        double secretkey1 = Math.pow(valuex,y)%p;
        double secretkey2 = Math.pow(valuey,x)%p;

        if (secretkey1 == secretkey2)
            System.out.printf("Secret key is the same");
        else
            System.out.printf("Secret key is not the same");
    }
}
