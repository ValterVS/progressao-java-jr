import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ContaBancaria Valter = new ContaBancaria("Valter","8120-5");

        while(true){
            System.out.println("""
                    CENTRAL BANCÁRIA
                    Digite a opçao desejada:
                    1 - Depositar 
                    2 - Saque 
                    3 - Consulta Saldo  
                    4 - Mostrar Dados Bancários                
                    """);
            int opcao = scanner.nextInt();

            switch(opcao){
                case 1:
                    Valter.Depositar(scanner);
                    break;
                case 2:
                    Valter.Sacar(scanner);
                    break;
                case 3:
                    Valter.ConsultarSaldo();
                    break;
                case 4:
                    Valter.MostrarDados();
                    break;
                default:
                    System.out.println("Opção Inválida");
            }

        }

    }
}