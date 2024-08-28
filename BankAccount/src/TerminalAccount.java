import java.util.Locale;
import java.util.Scanner;
import java.text.MessageFormat;

public class TerminalAccount {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.println("Write your name:");
        String nameClient = scanner.next();

        System.out.println("Write your number account:");
        int numberAccount = scanner.nextInt();

        System.out.println("Write your number agency:");
        String numberAgency = scanner.next();

        System.out.println("Write your balance");
        double balance = scanner.nextDouble();

        String message = MessageFormat.format(
                "Olá, {0}, obrigado por criar uma conta em nosso banco, sua agência é {1}, conta {2} e seu saldo {3} já está disponível para saque.", nameClient, numberAgency, numberAccount, balance);
        // String.format(
        // "Olá, %s,obrigado por criar uma conta em nosso banco, sua agência é %s, conta
        // %d e seu saldo %2f já está disponível para saque.",
        // nameClient, numberAgency, numberAccount, balance);
        System.out.println(message);
        scanner.close();
    }
}