public class Pessoa {

    String nome;
    int idade;
    double altura;
    String cidade;
    String NomeMae;


   Pessoa(String nome, int idade, String cidade){
        this.nome = nome;
        this.idade = idade;
        this.cidade = cidade;
    }

    Pessoa(){

    }

    public void MostrarDados(){
        System.out.println(nome+"\n"+idade+"\n"+altura+"\n"+cidade+"\n"+NomeMae);
    }


    // Nessa parte entendemos a questão quando duplicamos um metodo de mesmo nome e como o código responde a isso
    public double IdadeAlterar(int idade, double altura){
        double alterado = (double) idade * altura;
        return alterado;
    }

    public double IdadeAlterar(int idade){
       double alterar = (double) idade * 10;
       return alterar;
    }
}
