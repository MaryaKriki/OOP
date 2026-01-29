package curso.OOP.aula11;

public class Tecnico extends Aluno{
    private String profissionalidade;

    public void praticando(){
        System.out.println("Aluno(a) " + getNome() + " está praticando " + getProfissionalidade());
    }

    public String getProfissionalidade() {
        return profissionalidade;
    }

    public void setProfissionalidade(String profissionalidade) {
        this.profissionalidade = profissionalidade;
    }
}
