package curso.OOP.aula10;

public class Funcionario extends Pessoa{
    private String setor;
    private boolean trabalhando;
    //Métodos
    public void mudarTrabalho(){
        setTrabalhando(trabalhando = true);
    }
    //Métodos especiais

    public boolean getTrabalhando() {
        return trabalhando;
    }

    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }
}
