import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.Scanner;

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

        Set<String> emails = new HashSet<>();
        emails.add("teste@gmail.com");
        emails.add("java@gmail.com");
        emails.add("teste@gmail.com");
        emails.add("backend@gmail.com");

        for(String l : emails){
            System.out.println(l);
        }

        System.out.println(emails.size());
        System.out.println(emails.contains("teste@gmail.com"));
        emails.remove("java@gmail.com");
        for(String l : emails){
            System.out.println(l);
        }


        //Map <Chave , Tipo > nome = new HashMap<>();
        Map<Integer, String> CadNomes = new HashMap<>();

        CadNomes.put(1, "Valter");
        CadNomes.put(2, "Bethy");
        CadNomes.put(3, "Antonio");
        CadNomes.put(4, "Pedro");
        CadNomes.put(5, "Marcos");

        System.out.println(CadNomes.get(1)); //Mostra valor da posicao
        System.out.println("-----");
        CadNomes.remove(2); // Remove da posicao informada
        System.out.println(CadNomes.containsKey(3)); //  Verifica a chave
        System.out.println(CadNomes.containsValue("Marcos")); // Verifica se valor existe
        System.out.println(CadNomes.size()); // Verifica o tamanho

        Map<Integer,String> Produtos = new HashMap<>();
        Produtos.put(1,"Notebook");
        Produtos.put(2,"Computador");
        Produtos.put(3,"Smartphone");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o código do produto desejado: ");
        Integer opcao = scanner.nextInt();
        System.out.println(Produtos.get(opcao));


        Map<Integer,Produtos> Produto = new HashMap<>();
        Produto.put(1, new Produtos(1,"Arroz", 15.00));
        Produto.put(2, new Produtos(2,"Feijao", 7.00));
        Produto.put(3, new Produtos(3,"Macarrao", 5.00));
        Produto.put(4, new Produtos(4,"Peixe", 32.00));
        Produto.put(5, new Produtos(5,"Ovo", 2.50));
        System.out.println("Digite qual ID do produto: ");
        Integer opcao2 = scanner.nextInt();
        if(Produto.containsKey(opcao2)){
            Produtos ProdutoEncontrado = Produto.get(opcao2);
            System.out.println("Produto Encontrado!");
            System.out.println("Nome: " + ProdutoEncontrado.Nome);
            System.out.println("Preco: " + ProdutoEncontrado.Preco);
        }else{
            System.out.println("Produto não encontrado!");
        }

        //Generics - Nela você determina que tipo de dado aquela lista aceita, e caso tente inserir outro, dá erro



    }
}