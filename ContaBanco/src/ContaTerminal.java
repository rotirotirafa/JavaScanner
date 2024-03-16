import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String NomeCliente;
        String Agencia;
        Float Saldo;
        Integer Numero;

        System.out.println("Por favor, digite o número da agência: ");
        Agencia = sc.next();

        System.out.println("Agora o número da conta:  ");
        Numero = sc.nextInt();

        System.out.println("Nome do cliente: ");
        NomeCliente = sc.next();

        System.out.println("Saldo em conta: ");
        Saldo = sc.nextFloat();

        System.out.println("Olá " + NomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + Agencia + ", conta " + Numero + " e seu saldo " + Saldo + " já está disponível para saque");
    }
}