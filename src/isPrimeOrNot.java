import java.util.Scanner;

public class isPrimeOrNot {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your number:");
        int num= sc.nextInt();

        boolean flag = true;

        for (int i=2; i<=num/2 ; i++){
            if (num%i==0){
                flag = false;
                break;
            }
        }
        if (flag){
            System.out.println("The number is Prime.");
        }
        else {
            System.out.println("The number is not Prime.");
        }
    }
}
