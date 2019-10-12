public class Banco {
    public static void main(String[] args) {
        ContaCorrente conta = new ContaCorrente();
        conta.titular = new Cliente();

        conta.depositar(100);

        conta.sacar(50);

    }
}
