public class Banco {
    public static void main(String[] args) {
        Cliente gleyson = new Cliente("Gleyson Santos");

        ContaCorrente contaDoGleyson = new ContaCorrente(178, 29115);

        contaDoGleyson.setTitular(gleyson);

        System.out.println("Agencia: "+contaDoGleyson.getAgencia());
        System.out.println("Conta: "+contaDoGleyson.getNumero());
        System.out.println("Titular: "+contaDoGleyson.getTitular().getNome());
        System.out.println("Saldo: R$ "+contaDoGleyson.getSaldo());

        System.out.println("Total de contas criadas: "+ContaCorrente.getTotalDeContas());

    }
}
