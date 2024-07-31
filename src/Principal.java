import java.util.ArrayList;

public class Principal extends Produto {
    public Principal(String nome, int preco, int quantidade) {
        super(nome, preco, quantidade);
    }

    public static void main(String[] args) {
        ArrayList<Produto> listaDeObjetos = new ArrayList<>();

/*        Produto produto1 = new Produto();
        produto1.setNome("Bexiga");
        produto1.setPreco(7);
        produto1.setQuantidade(25);

        Produto produto2 = new Produto();
        produto2.setNome("Arroz");
        produto2.setPreco(32);
        produto2.setQuantidade(112);

        Produto produto3 = new Produto();
        produto3.setNome("Vinagre");
        produto3.setPreco(4);
        produto3.setQuantidade(300);*/


        Produto produtoNovo = new Produto("Garrafa", 23, 70);
        System.out.println(produtoNovo);
    }
}
