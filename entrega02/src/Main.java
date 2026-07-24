//import java.util.Scanner;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

  /*  public static void calcIMC(){

        System.out.println("CALCULADORA DE IMC");
        System.out.println("Digite seu peso: ");
        double peso = new Scanner(System.in).nextDouble();
        System.out.println("Digite sua altura: ");
        double altura = new Scanner(System.in).nextDouble();

        double IMC = peso/(altura*altura);

        System.out.println("Seu imc é: " + IMC);
    };*/
    public static double CalcSalario(double salario, double horaExtra, double valorHora){
        double SalarioFinal;

        SalarioFinal = (valorHora*horaExtra)+salario;

        return SalarioFinal;

    };

    public static double CalcMedia(double n1, double n2, double n3, double n4){

        double NotaFinal;
        NotaFinal = (n1+n2+n3+n4)/4;

        return NotaFinal;
    };
    public static void main(String[] args) {
        /*
        * int  suporta até 32 bits w, enquanto long até 64 bits
        * float suporta até 32 bits , enquanto o double até 64 bits
        * */
        Scanner scanner = new Scanner(System.in);

        /*int QtdProdutos = 200;
        double Preco = 10.50;
        String Telefone = "(14) 99723-9722";
        String CPF = "485.842.658-05";
        boolean resposta = true;
        char letra = 'a';


        System.out.println("Digite seu nome: ");
        String Nome = scanner.nextLine();
        System.out.println("Olá " + Nome);

        calcIMC();*/

        System.out.println("PROJETO 1");
        System.out.println("-Apresentando na tela");
        System.out.println("Digite seu nome: ");
        String Nome = scanner.nextLine();

        System.out.println("Digite sua idade: ");
        int Idade = Integer.parseInt(scanner.nextLine());

        System.out.println("Digite sua cidade: ");
        String Cidade = scanner.nextLine();

        System.out.println("Digite seu telefone: ");
        String Telefone = scanner.nextLine();

        System.out.println("Digite seu email: ");
        String Email = scanner.nextLine();

        System.out.println(Nome);
        System.out.println(Idade);
        System.out.println(Cidade);
        System.out.println(Telefone);
        System.out.println(Email);


        System.out.println("PROJETO 2");
        System.out.println("-Calculadora de Salário");
        //total 4800- 30
        System.out.println("Digite o valor do seu salario:");
        double salario = scanner.nextDouble();
        System.out.println("Digite a quantidade de horas extras: ");
        double horaExtra = scanner.nextDouble();
        System.out.println("Digite o valor da hora: ");
        double valorHora =  scanner.nextDouble();

        System.out.printf("Seu Salario no fim do mês é: R$ %.2f reais", CalcSalario(salario,horaExtra,valorHora));

        System.out.println("PROJETO 3");
        System.out.println("- Calculadora de Média");

        double nota =  scanner.nextDouble();
        double nota2 = scanner.nextDouble();
        double nota3 = scanner.nextDouble();
        double nota4 = scanner.nextDouble();

        System.out.println("Sua media final é : " + CalcMedia(nota, nota2, nota3, nota4));
    }


}