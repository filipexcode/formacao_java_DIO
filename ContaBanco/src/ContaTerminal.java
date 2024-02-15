//*aqui estou fazendo nada*//
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Solicita e recebe o número da agência
        System.out.println("Por favor, digite o número da Agência:");
        String agencia = sc.next();

        // Solicita e recebe o número da conta
        System.out.println("Por favor, digite o número da Conta:");
        int numeroConta = sc.nextInt();

        // Solicita e recebe o nome do cliente
        System.out.println("Por favor, digite o nome do Cliente:");
        String nomeCliente = sc.next();

        // Solicita e recebe o saldo inicial
        System.out.println("Por favor, digite o saldo inicial:");
        double saldo = sc.nextDouble();

        // Exibe a mensagem com as informações da conta

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
                + agencia + ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque.");

    sc.close();
    }
}

