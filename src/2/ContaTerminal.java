package ContaBanco;

import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitação e entrada de dados
        System.out.println("Por favor, digite o número da Agência:");
        int numero = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer

        System.out.println("Por favor, digite a Agência:");
        String agencia = scanner.nextLine();

        System.out.println("Por favor, digite o Nome do Cliente:");
        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o Saldo:");
        double saldo = scanner.nextDouble();

        // Mensagem final usando concatenação
        String mensagem = "Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.";

        // Exibição da mensagem
        System.out.println(mensagem);

        scanner.close();
    }
}