package curso.OOP.aula7;

public class Lutador {

    // Atributos
    private String nome;
    private String nacionalidade;
    private int idade;
    private double altura;
    private double peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;

    // Métodos Especiais


    public Lutador(String no, String nac, int i,
                   double al, double p, int v, int d, int e) {
        this.nome = no;
        this.nacionalidade = nac;
        this.idade = i;
        this.altura = al;
        this.setPeso(p);
        this.vitorias = v;
        this.derrotas = d;
        this.empates = e;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
        this.setCategoria();
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria() {
        if (peso <= 52.2){
            this.categoria = "Inválido";
        } else if (peso <= 70.3){
            this.categoria = "Leve";
        } else if (peso <= 83.9){
            this.categoria = "Médio";
        } else if (peso <= 120.2){
            this.categoria = "Pesado";
        } else {
            this.categoria = "Inválido";
        }
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

    // Métodos Abstratos
    public void apresentar(){
        System.out.println("     LUTADOR     \n" + this.getNome() + "\nEle é da(o) "
                + this.getNacionalidade() + "\nE tem " + this.getIdade() + " anos");
        System.out.println("Tem " + this.getAltura() + " de altura");
        System.out.println("Pesa: " + this.getPeso());

    }

    public void status(){
        System.out.println("     STATUS      ");
        System.out.println("Categoria: " + this.getCategoria());
        System.out.println("Vitórias: " + this.getVitorias());
        System.out.println("Derrotas: " + this.getDerrotas());
        System.out.println("Empates: " + this.getEmpates());
    }

    public void ganharLuta(){
        setVitorias(this.vitorias += 1);
    }

    public void perdeLuta(){
        setDerrotas(this.derrotas += 1);
    }

    public void empatarLuta(){
        setEmpates(this.empates += 1);
    }
}
