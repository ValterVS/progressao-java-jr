//import java.util.Scanner;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void calcIMC(){

        System.out.println("CALCULADORA DE IMC");
        System.out.println("Digite seu peso: ");
        double peso = new Scanner(System.in).nextDouble();
        System.out.println("Digite sua altura: ");
        double altura = new Scanner(System.in).nextDouble();

        double IMC = peso/(altura*altura);

        System.out.println("Seu imc é: " + IMC);
    };

    public static void main(String[] args) {
        /*
        * int  suporta até 32 bits w, enquanto long até 64 bits
        * float suporta até 32 bits , enquanto o double até 64 bits
        * */
        Scanner scanner = new Scanner(System.in);

        int QtdProdutos = 200;
        double Preco = 10.50;
        String Telefone = "(14) 99723-9722";
        String CPF = "485.842.658-05";
        boolean resposta = true;
        char letra = 'a';


        System.out.println("Digite seu nome: ");
        String Nome = scanner.nextLine();
        System.out.println("Olá " + Nome);

        calcIMC();
    }


}