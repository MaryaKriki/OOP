package curso.OOP.aula9;

public class Aula9 {
    public static void main(String[] args) {
        Pessoa[] p = new Pessoa[3];

        p[0] = new Pessoa("Marya Eduarda");

        p[0].setIdade(13);
        p[0].setSexo("Feminino");
        p[0].fazerAniversario();
        p[0].apresentar();

        p[1] = new Pessoa("João");

        p[1].setIdade(12);
        p[1].setSexo("Masculino");
        p[1].apresentar();

        p[2] = new Pessoa("Cristina Bomfim");

        p[2].setIdade(22);
        p[2].setSexo("Feminino");
        p[2].apresentar();

        Livro[] l = new Livro[2];

        l[1] = new Livro("A Sereia sem Dons", p[2], false);

        l[1].setLeitor(p[1]);
        l[1].setTotalPag(352);
        l[1].folhear(12);
        l[1].detalhes();

    }
}
