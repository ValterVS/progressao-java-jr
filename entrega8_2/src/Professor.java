public class Professor extends Pessoa{

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


}
