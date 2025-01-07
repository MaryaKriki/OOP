package curso.OOP.aula5;

public class Aula5 {
    public static void main(String[] args) {
        ContaBanco cb1 = new ContaBanco(true, 0.0f);
        cb1.abrirConta();
        cb1.setDono("Marya Eduarda");
        cb1.numConta = 361425;
        cb1.setTipo("cc");
        cb1.sacar(100.0f);
        cb1.status();



    }
}
