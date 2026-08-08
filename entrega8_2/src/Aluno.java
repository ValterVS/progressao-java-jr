public class Aluno extends Pessoa{

    private String Curso;
    private int Matricula;

    Aluno(String Nome, int Idade,String Curso, int Matricula){
        super(Nome,Idade);
        this.Curso = Curso;
        this.Matricula = Matricula;
    }

    @Override
    public void MostraDados(){
        System.out.println("bbbbbbbb");
    }


}
