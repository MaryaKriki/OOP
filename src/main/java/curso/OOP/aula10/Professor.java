package curso.OOP.aula10;

public class Professor extends Pessoa{
    //Atributos
    private String especialidade;
    private double salario;
    //Métodos
    public boolean apresentar(){
        System.out.println("Nome: " + this.getNome());
        System.out.println("Idade: " + this.getIdade());
        System.out.println("Sexo: " + this.getSexo());
        System.out.println("Especialidade: " + this.getEspecialidade());
        System.out.println("Salário atual: " + this.getSalario());
        return false;
    }
    public void receberAumento(double aumento){
        setSalario(salario += aumento);
    }
    //Métodos especiais

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
