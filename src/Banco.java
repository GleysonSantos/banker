public class Banco {
    public static void main(String[] args) {
        ContaCorrente conta = new ContaCorrente();
        Cliente cliente = new Cliente();
        conta.titular = cliente;

        conta.depositar(100);
    }
}
