public class ContaCorrente {
    private int numero;
    private int agencia;
    private double saldo;
    private Cliente titular;
    private static int totalDeContas;

    // construtor
    public ContaCorrente(int agencia, int numero) {

        //contador do total de contas criadas
        ContaCorrente.totalDeContas++;

        this.agencia = agencia;
        this.numero = numero;
    }

    // metodo depositar
    public void depositar(double valor) {
        System.out.println("Saldo anterior: R$ "+saldo);
        saldo += valor;
        System.out.println("Depósito de: R$ "+valor);
        System.out.println("Saldo atual: R$ "+saldo);
    }

    // metodo sacar
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

    //metodo transferir
    public boolean tranferir(double valor, ContaCorrente destino) {
        if (this.saldo >= valor){
            this.sacar(valor);
            destino.depositar(valor);
            return true;
        } else {
            return false;
        }

    }

    public double getSaldo() {
        return this.saldo;
    }

    public int getAgencia() {
        return this.agencia;
    }

    public int getNumero() {
        return this.numero;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public Cliente getTitular() {
        return titular;
    }

    public static int getTotalDeContas() {
        return ContaCorrente.totalDeContas;
    }
}
