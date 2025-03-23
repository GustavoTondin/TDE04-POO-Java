import java.util.ArrayList;

public class Pedido {
    public ArrayList<Produto> listaProdutos;

    public Pedido(){
        listaProdutos = new ArrayList<>();
    }

    public void adicionarProduto(Produto produto){
        listaProdutos.add(produto);
    }

    public double calculaTotal(){
        double total = 0;
        for (Produto produto : listaProdutos){
            total += produto.valor;
        }
        return total;
    }
}
