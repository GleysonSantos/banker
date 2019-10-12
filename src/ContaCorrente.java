public class ContaCorrente {
    int numero;
    int agencia;
    double saldo;
    Cliente titular;

    public void depositar(double valor) {
        System.out.println("Saldo anterior: R$ "+saldo);
        saldo += valor;
        System.out.println("Depósito de: R$ "+valor);
        System.out.println("Saldo atual: R$ "+saldo);
    }

    public boolean sacar(double valor) {
        if (valor <= saldo){
            System.out.println("Saldo antes do saque: R$ "+saldo);
            saldo -= valor;
            System.out.println("Valor do saque: R$ "+valor);
            System.out.println("Valor restante de saldo: R$"+saldo);
            return true;
        } else {
            System.out.println("Você não possui saldo suficiente!");
            return false;
        }
    }

}
