package curso.OOP.aula4;

public class Aula4 {
    public static void main(String[] args) {

        Caneta c1 = new Caneta("Bic", 0.5f, "Rosa choque");
        c1.status();

        Caneta c2 = new Caneta("Faber Castel", 0.2f, "verde");
        c2.status();
    }
}
