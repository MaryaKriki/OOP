package curso.OOP.aula10;

public class Aula10{
    public static void main(String[] args) {
        //Programa Principal
        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();

        p1.setNome("Gabriela");
        p2.setNome("Marya");
        p3.setNome("Maleah");
        p4.setNome("Bruna");

        p1.setIdade(12);
        p2.setCurso("Teatro");
        p3.setSalario(1333.83);
        p4.setSetor("Cozinha");

        p1.fazerAniv();
        p2.cancelarMatr();
        p3.receberAumento(12.9);
        p4.mudarTrabalho();
    }
}
