import java.util.Scanner;

public class CheckPrime_Number {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Nhập vào 1 số : ");
        int number=scanner.nextInt();
        if (number <= 1) {
            System.out.printf("%d không là số nguyên tố!\n", number);
        } else {
            boolean isPrime = true;
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.printf("%d Là số nguyên tố!\n ", number);
            } else {
                System.out.printf("%d không là số nguyên tố! \n", number);
            }
        }
    }
}
