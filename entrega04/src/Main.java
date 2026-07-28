import java.util.Scanner;
public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int opcao = 1;

        while(opcao != 0){
            System.out.println("Sistema de Cadastro" +
                    "\n1 - Cadastrar Cliente" +
                    "\n2 - Listar Clientes" +
                    "\n3 - Quantidade de Cadastros" +
                    "\n0 - Sair" +
                    "\n Insira a opção abaixo:");

            opcao = scanner.nextInt();

            if(opcao == 1){
                CadastrarCliente();
            }else if(opcao == 2){
                ListarClientes();
            }else if(opcao == 3){
                QtdCadastros();
            }

        }

    }
}