import java.util.Scanner;

public class ConditionalQues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your balance? ");
        int balance = scanner.nextInt();
        System.out.print("Enter the amount you want to withdraw? ");
        int withdrawal = scanner.nextInt();

        if (withdrawal > balance) {
            System.out.println("Insufficient balance: Cannot withdraw");
        } else {
            System.out.println("Transaction successful");
            System.out.println("Current balance after withdraw: " + (balance - withdrawal));
        }
    }
}
