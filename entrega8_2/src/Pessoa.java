public abstract class Pessoa {
    private String Nome;
    private int Idade;

    Pessoa(String Nome, int Idade){
        this.Nome = Nome;
        this.Idade = Idade;
    }

    public void MostraDados(){
        System.out.println("aaaaaa");
    }

    public abstract void DarOi();
}
