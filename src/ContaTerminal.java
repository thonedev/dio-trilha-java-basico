public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        int numero = Integer.parseInt(args[0]);
        String agencia = args[1];
        String nomeCliente = args[2];
        double saldo = Double.parseDouble(args[3]);

        System.err.println("Número da conta: " + numero);
        System.err.println("Número da agência: " + agencia);
        System.err.println("Nome do cliente: " + nomeCliente);
        System.err.println("Saldo da conta: " + saldo);
    }
}
