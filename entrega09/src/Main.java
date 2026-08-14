import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
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
        // System.out.println(Nomes.isEmpty());
        System.out.println("-----------");
        for(int x = 0;x<Nomes.size();x++){
            System.out.println(Nomes.get(x));
        }
        System.out.println("-----------");
        for(String n : Nomes){
            System.out.println(n);
        }

        List<Aluno> alunos = new ArrayList<>();
        alunos.add(new Aluno("Valter",22));
        alunos.add(new Aluno("Maycon",18));
        alunos.add(new Aluno("Carlos",48));
        System.out.println("-------");
        for(Aluno a : alunos){
            System.out.println(a.Nome);
            System.out.println(a.Idade);
            System.out.println("-------");
        }

        // SET - onde um valor tem tem como duplicar na lista
        Set<String> cpf = new HashSet<>();
        cpf.add("12345");
        cpf.add("24689");
        cpf.add("12345");
        cpf.add("99871");

        for(String a : cpf){
            System.out.println(a);
        }

    }
}