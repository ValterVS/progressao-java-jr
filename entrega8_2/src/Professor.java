public class Professor extends Pessoa implements Dinheiro{

    private String Disciplina;
    private double Salario;

    Professor(String Nome, int Idade, String Disciplina, double Salario){
        super(Nome,Idade);
        this.Disciplina = Disciplina;
        this.Salario = Salario;
    }

    @Override
    public void MostraDados(){
        System.out.println("cccccccc");
    }

    public void DarOi(){};
    public void Pagar(double Valor){
        System.out.println("Conta paga valor: " + Valor);
    }


}
