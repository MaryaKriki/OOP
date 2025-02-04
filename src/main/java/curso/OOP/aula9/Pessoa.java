package curso.OOP.aula9;

public class Pessoa {
    private String nome;
    private int idade;
    private String sexo;

    public Pessoa(String n) {
        this.nome = n;
    }

    // Métodos especiais

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    // Métodos
    public void fazerAniversario(){
        setIdade(idade += 1);
    }

    public void apresentar(){
        System.out.println("Pessoa\n" + getNome() + "\n" + getIdade() + " anos\n" + getSexo());
    }
}
