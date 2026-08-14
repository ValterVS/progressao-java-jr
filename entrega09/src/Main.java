import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        String[] Pessoas = new String[5]; //tamanho fixo, e criado assim que cria a variavel
        List<String> Nomes = new ArrayList<>(); // tamanho dinamico

        Pessoas[0] = "Valter";

        Nomes.add("Valter");
        Nomes.add("Maria");
        Nomes.add("Ana");

        System.out.println(Pessoas.length);

        System.out.println(Nomes.size());

        System.out.println(Nomes.get(0));

        //Nomes.remove(1);
        //Nomes.remove("Maria");
        System.out.println(Nomes.get(1));
        System.out.println(Nomes.size()); //Mostra o tamanho da lista
        Nomes.set(1,"Maryah"); // Altera o valort da posição 1 e para outro
        System.out.println(Nomes.get(1)); // Exibe o valor da posição 1
        System.out.println(Nomes.contains("Anah")); // Contém Ana ? True | False
        System.out.println(Nomes.isEmpty()); // lista está vazia? True| False
        Nomes.clear();
        System.out.println(Nomes.isEmpty());
    }
}