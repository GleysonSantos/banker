public class ContaCorrente {
    int numero;
    int agencia;
    double saldo;
    Cliente titular;

    public void depositar(int valor){
        System.out.println("Saldo anterior: R$ "+saldo);
        saldo += valor;
        System.out.println("Depósito de: R$ "+valor);
        System.out.println("Saldo atual: R$ "+saldo);
    }



}
