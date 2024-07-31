

public class ProdutoPerecivel extends Produto {

    String dataValidade;

    public ProdutoPerecivel(String nome, int preco, int quantidade, String dataValidade) {
        super(nome, preco, quantidade);
        this.dataValidade = dataValidade;

    }
    public static void main(String[] args) {
        ProdutoPerecivel produtoperecivel = new ProdutoPerecivel("Leite", 7, 250, "11/12/2024");
        System.out.println(produtoperecivel);
    }

}
