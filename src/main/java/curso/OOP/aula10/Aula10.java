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
        p3.setNome("Lucas");
        p4.setNome("Bruna");

        p1.setIdade(12);
        p2.setIdade(15);
        p3.setIdade(32);

        p1.setSexo("F");
        p3.setSexo("M");
        p4.setSexo("F");

        p2.setCurso("Teatro");
        p3.setSalario(1333.83);
        p4.setSetor("Cozinha");

        p1.fazerAniv();
        p2.cancelarMatr();
        p3.receberAumento(12.9);
        p4.mudarTrabalho();

        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
    }
}
