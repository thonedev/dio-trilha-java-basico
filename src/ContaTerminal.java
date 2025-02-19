import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o número da conta: ");
        int numero = Integer.parseInt(sc.nextLine());
        System.out.println("Digite o número da agência: ");
        String agencia = sc.nextLine();
        System.out.println("Digite o nome do cliente: ");
        String nomeCliente = sc.nextLine();
        System.out.println("Digite o saldo da conta: ");
        double saldo = Double.parseDouble(sc.nextLine());

        System.err.println("Número da conta: " + numero);
        System.err.println("Número da agência: " + agencia);
        System.err.println("Nome do cliente: " + nomeCliente);
        System.err.println("Saldo da conta: " + saldo);
    }
}
