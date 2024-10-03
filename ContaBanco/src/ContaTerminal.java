import java.util.Scanner;

public class ContaTerminal {    
    public static void main(String[] args) throws Exception {
        int numero = 0;
        String nomeCliente = " ", agencia = " ";
        double saldo = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Por favor digite o nome do Cliente: ");
        nomeCliente = scanner.nextLine();

        System.out.print("Por favor digite o número da Agencia: ");
        agencia = scanner.nextLine();

        System.out.print("Por favor digite o número da Conta: ");
        numero = scanner.nextInt();

        System.out.print("Por favor digite o Saldo da conta: ");
        saldo = scanner.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " +
        agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");

        scanner.close();
    }
}
