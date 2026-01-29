package curso.OOP.aula11;

public class Bolsista extends Aluno {
    //Atributos
    private float bolsa;

    //Metodos
    public void renovarBolsa() {
        System.out.println("Bolsa de " + this.nome + " renovada!!");
    }

    public void pagarMensalidade(){
        System.out.println( this.nome + " é bolsista, o pagamento foi facilitado!!!");
    }
    //Métodos Expeciais

    public float getBolsa() {
        return bolsa;
    }

    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }
}
