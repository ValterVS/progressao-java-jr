//Compreendendo Arrays

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void Media(Integer[] notas){
        double media = 0;

        for(int i=0; i<notas.length; i++){
            media = media + notas[i];
        }

        media = media/notas.length;
        System.out.println("Sua media final é: " + media);
    }

    public static void main(String[] args) {
 /*
        String[] cidade = new String[5];

        cidade[0] = "Lins";
        cidade[1] = "Rio de Janeiro";
        cidade[2] = "São Paulo";
        cidade[3] = "Brasilia";
        cidade[4] = "SJRP";

        System.out.println("Cidades do conjunto cidade:" + Arrays.toString(cidade));
        /*
        for(String c : cidade){
            System.out.println(c);
        }


        for(int i = 0 ; i < cidade.length; i++){
            System.out.println(cidade[i]);
        }
        System.out.println(cidade.length);
    */
        /*
        Scanner scanner = new Scanner(System.in);
        Integer[] notas = new Integer[5];

        for (int i = 0; i < notas.length; i++) {
            System.out.println("Digite a nota " + (i + 1) + ":");
            notas[i] = scanner.nextInt();
        }

        Media(notas);
*/
        Scanner scanner = new Scanner(System.in);
        String[] nomes = new String[5];

        for(int i=0; i < nomes.length; i++){
            System.out.println("Digite o nome do aluno " + (i+1) + ":");
            nomes[i] = scanner.nextLine();

            if("Valter".equals(nomes[i])){
                System.out.println("Valter - Aluno suspenso!");
            }
        }



    }
}