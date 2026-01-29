package curso.OOP.aula11;

public class Aluno extends Pessoa {
    //Atributos
    private int mat;
    private String curso;
    //Métodos
    public void pagarMensalidade(){
        System.out.println("Mensalidade do(a) aluno(a) "
                + this.getNome() + " paga com sucesso!!!");
    }
    //Métodos Especiais

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getMat() {
        return mat;
    }

    public void setMat(int mat) {
        this.mat = mat;
    }
}
