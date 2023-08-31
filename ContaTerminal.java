import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Enter the Account Number: ");
        int account = scanner.nextInt();

        System.out.println("Enter the Agency Number: ");
        int agency = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Enter the User Name: ");
        String name = scanner.nextLine();

        System.out.println("Enter the Balance: ");
        Double balance = scanner.nextDouble();

        scanner.close();

        System.out.println("Hello " + name + ", thanks for creating a account in our bank. Your agency is " + agency + ", account number " + account + ", and your balance of " + balance + " is ready to withdraw.");
    }
}