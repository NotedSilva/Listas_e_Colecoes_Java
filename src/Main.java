import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Pessoa pessoa1 = new Pessoa();
        pessoa1.setNome("Gabriel");
        pessoa1.setIdade(23);

        Pessoa pessoa2 = new Pessoa();
        pessoa2.setNome("Leticia");
        pessoa2.setIdade(20);

        Pessoa pessoa3 = new Pessoa();
        pessoa3.setNome("Vitor");
        pessoa3.setIdade(19);

        ArrayList<Pessoa> listaDePessoas = new ArrayList<>();
        listaDePessoas.add(pessoa1);
        listaDePessoas.add(pessoa2);
        listaDePessoas.add(pessoa3);

        System.out.println("Quantidade de pessoas na lista: " + listaDePessoas.size());

        System.out.println("A primeira pessoa da lista: " + listaDePessoas.get(0).getNome());

        System.out.println(listaDePessoas);
    }
}