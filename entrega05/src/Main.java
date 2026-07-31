import java.util.Scanner;

public class Main {

    public static void Somar(Scanner scan){
        System.out.println("Digite o primeiro valor: ");
        int a = scan.nextInt();
        System.out.println("Digite o segundo valor: ");
        int b = scan.nextInt();
        System.out.println("Resultado: "  + (a+b));

    }

    public static void Subtrair(Scanner scan){
        System.out.println("Digite o primeiro valor: ");
        int a = scan.nextInt();
        System.out.println("Digite o segundo valor: ");
        int b = scan.nextInt();
        System.out.println("Resultado: "  + (a-b));
    }

    public static void Dividir(Scanner scan){
        System.out.println("Digite o primeiro valor: ");
        int a = scan.nextInt();
        System.out.println("Digite o segundo valor: ");
        int b = scan.nextInt();
        System.out.println("Resultado: "  + (a/b));
    }

    public static void Multiplicar(Scanner scan){
        System.out.println("Digite o primeiro valor: ");
        int a = scan.nextInt();
        System.out.println("Digite o segundo valor: ");
        int b = scan.nextInt();
        System.out.println("Resultado: "  + (a*b));
    }

    public static void main(String[] args) {
        Scanner scan =  new Scanner(System.in);



        System.out.println("Digite a opcao\n1-somar\n2-subtrair\n3-dividir\n4-multiplicar");
        int opcao = scan.nextInt();
        switch (opcao) {
            case 1:
                Somar(scan);
                break;
            case 2:
                Subtrair(scan);
                break;
            case 3:
                Dividir(scan);
                break;
            case 4:
                Multiplicar(scan);
                break;
            default:
                System.out.println("Opcao invalida");
        }
        scan.close();
    }
}