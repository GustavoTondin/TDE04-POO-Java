
public class Main {
    public static void main(String[] args) {
        Produto camisa = new Produto();
        Produto jaqueta = new Produto();

        camisa.valor = 100.00;
        jaqueta.valor = 200.00;

        Pedido p1 = new Pedido();
        p1.adicionarProduto(camisa);
        p1.adicionarProduto(jaqueta);

        System.out.println(p1.calculaTotal());
    }
}