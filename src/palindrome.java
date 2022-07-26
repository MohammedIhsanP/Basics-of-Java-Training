import java.util.Scanner;

public class palindrome {

    static int reverseNumber(int n){

        int rev_n = 0;

        while(n>0){
            int digit = n%10;
            rev_n = (rev_n*10) + digit;
            n = n/10;
        }
        return rev_n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true){
            System.out.println("Enter the number :");
            int numb = sc.nextInt();

            int rev_numb = reverseNumber(numb);

            if (rev_numb==numb){
                System.out.println("The number is Palindrome");
            }
            else {
                System.out.println("The number is not Palindrome");
            }


    }
}
}
