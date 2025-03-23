
public class Main {
    public static void main(String[] args) {
        Desenvolvedor dev1 = new Desenvolvedor();
        dev1.salario = 100.00;
        System.out.println(dev1.calcularbonus());

        Gerente ge1 = new Gerente();
        ge1.salario = 100.00;
        System.out.println(ge1.calcularbonus());

    }
}
