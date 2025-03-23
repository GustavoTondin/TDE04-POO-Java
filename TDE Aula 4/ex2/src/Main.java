
public class Main {
    public static void main(String[] args) {
        ContaBancaria c1 = new ContaBancaria();
        ContaBancaria c2 = new ContaBancaria();

        c1.depositar(200.00);
        c1.sacar(50.00);
        c2.titular = "Gustavo";
        c1.transferir(100.00,c2);
        System.out.println(c1.saldo);
        System.out.println(c2.saldo);

    }
}