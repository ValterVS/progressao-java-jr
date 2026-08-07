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
       /* Scanner scanner = new Scanner(System.in);
        String[] nomes = new String[5];

        for(int i=0; i < nomes.length; i++){
            System.out.println("Digite o nome do aluno " + (i+1) + ":");
            nomes[i] = scanner.nextLine();

            if("Valter".equals(nomes[i])){
                System.out.println("Valter - Aluno suspenso!");
            }
        }*/

/*        A ideia foi que cada valor da matriz das colunas da primeira linha, fossem armazenadas
        e somadas na primeira coluna da primeira linha*/

       /* int[][] Aluno_Idade = new int[2][4];

        Aluno_Idade[0][0] = 10;
        Aluno_Idade[0][1] = 20;
        Aluno_Idade[0][2] = 30;
        Aluno_Idade[0][3] = 40;
        for(int i=0; i<Aluno_Idade.length; i++){ // Certo
            for(int j=1; j<Aluno_Idade[i].length; j++){// Inicia em j = 1 para somar as colunas 1, 2 e 3 na coluna 0
                Aluno_Idade[i][0] += Aluno_Idade[i][j];
            }
        }

        System.out.println("Aluno Idade:" + Arrays.toString(Aluno_Idade[0]));
*/

        int[] linha = new int[10];
        linha[0] = 1;
        linha[1] = 2;
        linha[2] = 3;
        linha[3] = 4;
        linha[4] = 5;
        linha[5] = 6;
        linha[6] = 7;
        linha[7] = 8;
        linha[8] = 9;
        linha[9] = 10;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o numero que deseja encontrar na lista: ");
        int opcao =  scanner.nextInt();

        for (int i = 0; i < linha.length; i++) {
            if(linha[i] == opcao){
                System.out.println("Sua nota : " + opcao + " está na posicao " + (i+1) + " da lista");
            }
        }



    }
}