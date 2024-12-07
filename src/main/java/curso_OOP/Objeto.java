package curso_OOP;

public class Objeto {
    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.cor = "azul";
        c1.ponta = 0.5f;
        c1.carga = 75;
        c1.tampar();
        c1.status();
        c1.rabiscar();

        Caneta c2 = new Caneta();
        c2.modelo = "transparente";
        c2.cor = "preta";
        c2.ponta = 0.7f;
        c2.carga = 33;
        c2.destampar();
        c2.status();
        c2.rabiscar();

    }
}
