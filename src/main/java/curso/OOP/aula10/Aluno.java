package curso.OOP.aula10;

public class Aluno extends Pessoa{
    //Atributos
    private int matricula;
    private String curso;
    //Métodos
    public boolean apresentar(){
        System.out.println("Nome: " + this.getNome());
        System.out.println("Idade: " + this.getIdade());
        System.out.println("Sexo: " + this.getSexo());
        System.out.println("Matrícula: " + this.getMatricula());
        System.out.println("Curso: " + this.getCurso());
        return false;
    }
    public void cancelarMatr(){
        System.out.println("Cancelando...\nMatricula foi cancelada!!!");
    }
    //Métodos especiais

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}
