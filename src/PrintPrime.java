import java.util.Scanner;

public class PrintPrime {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the maximum number:");
        int max = sc.nextInt();

        System.out.print("The prime numbers up to "+ max + " are ");

        for (int num=2; num<=max; num++){
            boolean isPrime=true;
            for (int i=2; i<=num/2; i++){
                if (num%i==0){
                    isPrime=false;
                    break;
                }
            }
            if (isPrime==true){
                System.out.print(num+" ");
            }
        }
    }
}
