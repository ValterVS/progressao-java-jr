public class Main {
    public static void main(String[] args) {

        Pessoa Ana = new Aluno("Ana",22,"Engenharia Civil", 317226);
        Pessoa Valter = new Professor("Valter",22,"Pilares", 2800.00);

        Ana.MostraDados();
        Valter.MostraDados();

    }
}