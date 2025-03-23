public class Gerente extends Funcionario{
    @Override
    public double calcularbonus() {
        return (salario * 0.2) + salario;
    }
}
