public class ContaBancaria {
    public String titular;
    public double saldo;

    public void depositar(double valor){
        saldo += valor;
        System.out.println("Voce depositou o valor de " + valor);
    }

    public void sacar(double valor){
        if (valor > saldo){
            System.out.println("Nao foi possivel sacar pois o valor é maior que o seu saldo");
        } else {
            saldo -= valor;
            System.out.println("Voce sacou " + valor + " seu novo saldo é de: " + saldo);
        }
    }

    public void transferir(double valor, ContaBancaria contadestino){
        if (valor > 0 && valor <= saldo){
            saldo -= valor;
            contadestino.depositar(valor);
            System.out.println("Foi transferido o valor de " + valor + "para o titular " + contadestino.titular);
        } else {
            System.out.println("Saldo insuficiente para fazer a transferencia");
        }
    }

}
