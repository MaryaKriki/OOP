package curso.OOP.aula9;

public class Livro implements Publicacao {
    private String titulo;
    private String autor;
    private int totalPag;
    private int pagAtual;
    private boolean aberto;
    private String leitor;

    // Métodos especiais


    public Livro(String t, String a, String l) {
        this.titulo = t;
        this.autor = a;
        this.leitor = l;
        this.aberto = false;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotalPag() {
        return totalPag;
    }

    public void setTotalPag(int totalPag) {
        this.totalPag = totalPag;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean getAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public String getLeitor() {
        return leitor;
    }

    public void setLeitor(String leitor) {
        this.leitor = leitor;
    }

    // Métodos

    public void detalhes(){
        System.out.println("Titulo: " + getTitulo());
        System.out.println("Autor: " + getAutor());
        System.out.println("Leitor: " + getLeitor());
        System.out.println("Total de páginas: " + getTotalPag());
        System.out.println("Página atual: " + getPagAtual());
        System.out.println("Está aberto? " + getAberto());
    }

    @Override
    public void abrir() {
        this.setAberto(true);
    }

    @Override
    public void fechar() {
        this.setAberto(false);
    }

    @Override
    public void folhear(int p) {
        this.setPagAtual(pagAtual += p);
    }

    @Override
    public void avancarPag() {
        this.setPagAtual(pagAtual += 1);
    }

    @Override
    public void voltarPag() {
        this.setPagAtual(pagAtual -= 1);
    }
}
