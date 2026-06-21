import java.util.Scanner;

class InsufficientFundsException extends Exception {
    InsufficientFundsException(String msg) {
        super(msg);
    }
}

public class BankAccount {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter balance: ");
        double balance = sc.nextDouble();

        System.out.print("Enter withdrawal amount: ");
        double amount = sc.nextDouble();

        try {
            if(amount > balance)
                throw new InsufficientFundsException(
                        "Insufficient Funds!");

            balance -= amount;
            System.out.println("Withdrawal Successful");
            System.out.println("Updated Balance = " + balance);
        }
        catch(InsufficientFundsException e) {
            System.out.println(e.getMessage());
        }
    }
}
