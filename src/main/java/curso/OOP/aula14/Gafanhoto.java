package curso.OOP.aula14;

import org.w3c.dom.ls.LSOutput;

public class Gafanhoto extends Pessoa{
    private String login;
    private int totAssistido;

    public Gafanhoto(String nome, int idade, String genero, String login) {
        super(nome, idade, genero);
        this.login = login;
        this.totAssistido = 0;
    }


    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotAssistido() {
        return totAssistido;
    }

    public void setTotAssistido(int totAssistido) {
        this.totAssistido = totAssistido;
    }

    public void viuMaisUm(){
        setTotAssistido(this.totAssistido ++);
    }

    @Override
    protected void ganharExp() {
        setExp(this.exp ++);
    }

    @Override
    public String toString() {
        return "Gafanhoto{" +
                "login='" + login + '\'' +
                ", totAssistido=" + totAssistido +
                ", nome='" + nome + '\'' +
                ", idade=" + idade +
                ", genero='" + genero + '\'' +
                ", exp=" + exp +
                '}';
    }
}
