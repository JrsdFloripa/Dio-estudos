
import java.util.Scanner;

public class ContaTerminal{
    public static void main(String[] args) {

        // Construtor representando nova instância scanner.
        Scanner scanner = new Scanner(System.in);

        // Entrada de dados (texto).
        System.out.print("Digite o nome do cliente: ");
        String nomeCliente = scanner.nextLine();

        // Entrada de dados (texto).
        System.out.print("Por favor, digite o número da Agência: ");
        String agencia = scanner.nextLine();// quebra de linha.

        // Entrada de dados nº inteiro.
        System.out.print("Digite o número da conta: ");
        int numero = scanner.nextInt();

        // Entrada de dados de nº real.
        System.out.print("Digite o saldo da conta: ");
        double saldo = scanner.nextDouble();

        // Exibindo a mensagem com os dados inseridos
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco.");
        System.out.println("Sua agência é " + agencia + ", conta " + numero + " e seu saldo é R$" + saldo);
        System.out.println("Seu saldo já está disponível para saque.");

        // Encerrando o processo.

        scanner.close();
    }
}