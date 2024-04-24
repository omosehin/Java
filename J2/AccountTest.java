import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) {
            Account account = new Account("Jane Green", 50.00);
            Account account2 = new Account("John Blue", -7.53);

            System.out.printf("%s balance: $%.2f%n",account.getName(),account.getBalance());
            System.out.printf("%s balance: $%.2f%n",account2.getName(),account2.getBalance());
            
             Scanner input = new Scanner(System.in);
             
             double depositAmount = input.nextDouble();
             System.out.printf("%nadding %.2f to account1 balance%n%n", depositAmount);
             account.deposit(depositAmount);

             System.out.printf("%s balance: $%.2f%n ",account.getName(),account.getBalance());
             System.out.printf("%s balance: $%.2f%n ",account2.getName(),account2.getBalance());
            
            System.out.print("Enter deposit amount for account2: ");
            depositAmount = input.nextDouble();
            System.out.printf("&nadding %2.f to account2 balance%n%n",depositAmount);
            account2.deposit(depositAmount);

            System.out.printf("%s balance: $%.2f%n", account.getName(),account.getBalance());
            System.out.printf("%s balance: $%.2f%n", account2.getName(),account2.getBalance());
    }
}
