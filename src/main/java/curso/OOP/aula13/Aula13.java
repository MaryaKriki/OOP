package curso.OOP.aula13;

public class Aula13 {
    public static void main(String[] args) {
        Lobo l = new Lobo();
        l.emitirSom();

        Cachorro c = new Cachorro();

        Cachorro c2 = new Cachorro();

        c.emitirSom();
        c.reagir("Olá");
        c2.reagir("VAI PRA FORAA");
        c.reagir(11, 45);
        c2.reagir(23, 22);
        c.reagir(true);
        c2.reagir(false);
        c.reagir(3, 12.5f);
        c2.reagir(11, 5.7f);
    }
}
