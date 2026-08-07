import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pessoa cliente1 = new Pessoa("Valter",22, "Lins");
        cliente1.altura = 1.87;
        cliente1.NomeMae = "Marcia";
        cliente1.MostrarDados();
        Pessoa cliente2 = new Pessoa();
        cliente2.idade = 22;
        cliente2.altura = 1.60;

        System.out.println("Teste um");
        System.out.println(cliente2.IdadeAlterar(cliente2.idade, cliente2.altura));

        System.out.println("Teste dois");
        System.out.println(cliente2.IdadeAlterar(cliente2.idade));

    }
}