import java.util.Scanner;

public class ContaBancaria {


    private String NumeroConta;
    private String Titular;
    private double Saldo;

    ContaBancaria(String Titular,String NumeroConta){

        this.Titular = Titular;
        this.NumeroConta = NumeroConta;
        this.Saldo = 0;

    }

    public double Depositar(Scanner scanner){
        System.out.println("Digite o valor para depositar: ");
        double valor = scanner.nextDouble();
        if(valor > 0){
            Saldo += valor;
            System.out.println("Deposito realizado com sucesso!");
            pausar(2000);
            return Saldo;

        }
        else{
            System.out.println("Valor de Deposito Invalido!");
            pausar(2000);
            return Saldo;
        }
    }

    public double Sacar(Scanner scanner){
            System.out.println("Digite o valor para sacar: ");
            double valor = scanner.nextDouble();
            if(valor<=Saldo && valor > 0) {
                Saldo -= valor;
                System.out.println("Saque realizado com sucesso!");
                pausar(2000);
                return Saldo;
            }else{
                System.out.println("Valor de saque invalido!");
                pausar(2000);
                return Saldo;
            }

    }

    public void ConsultarSaldo(){
        System.out.println("Seu saldo é R$"+ this.Saldo);
        pausar(2000);
    }

    public void MostrarDados(){
        System.out.println("Dados do Titular");
        System.out.println("Titular: "+ Titular);
        System.out.println("Número da Conta: "+NumeroConta);
        pausar(2000);
    }


    public static void pausar(int milissegundos) {
        try { Thread.sleep(milissegundos); } catch (InterruptedException e) {}
    }
}
