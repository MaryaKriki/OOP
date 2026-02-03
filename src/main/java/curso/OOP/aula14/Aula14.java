package curso.OOP.aula14;

public class Aula14 {
    public static void main(String[] args) {
        Video v[] = new Video[3];
        v[0] = new Video("Aula 14 de POO");
        v[1] = new Video("Aula 67 de Java");
        v[2] = new Video("Aula 01 de Python");

        System.out.println(v[0].toString());
        System.out.println(v[1].toString());
        System.out.println(v[2].toString());
    }
}
