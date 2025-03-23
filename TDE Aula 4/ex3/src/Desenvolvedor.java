public class Desenvolvedor extends Funcionario{
    @Override
    public double calcularbonus() {
        return (salario * 0.15) + salario;
    }
}
