import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x1=0 , x2=1, x3;

        System.out.println("Enter the count to be printed:");
        int count = sc.nextInt();

        System.out.print(x1+" "+x2);

        for (int i=0; i<count; i++){
            x3= x1+x2;
            System.out.print(" "+x3);
            x1=x2;
            x2=x3;

        }

    }
}