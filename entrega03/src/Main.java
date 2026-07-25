import java.util.Scanner;


public class Main {

    public static void Salario(){

            Scanner scan =  new Scanner(System.in);

            System.out.println("Digite seu salario: ");
            Double SalarioMensal = scan.nextDouble();

            if(SalarioMensal > 5000 && SalarioMensal < 1000000)
                System.out.println("Salario acima da media");
            else if(SalarioMensal < 5000)
                System.out.println("Salario dentro da media");
            else
                System.out.println("MILIONARIOOOOOOO!");
    }

    public static void Idade(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite sua idade: ");
        int Idade = scanner.nextInt();

        if(Idade >= 18){
            System.out.println("Maior de idade");
        }
        else{
            System.out.println("Menor de idade");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite sua opcao\n1 - Idade\n2 - Salario\n3 - Sair");
        int opcao = scanner.nextInt();

        switch(opcao){
            case 1:
                Idade();
                break;

            case 2:
                Salario();
                break;

            default:
                System.out.println("SAINDO DO SISTEMAAA!");
        }
    }
}