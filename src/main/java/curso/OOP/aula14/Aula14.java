package curso.OOP.aula14;

public class Aula14 {
    public static void main(String[] args) {
        Video v[] = new Video[3];
        v[0] = new Video("Aula 14 de POO");
        v[1] = new Video("Aula 67 de Java");
        v[2] = new Video("Aula 01 de Python");


        Gafanhoto g[] = new Gafanhoto[5];
        g[0] = new Gafanhoto("Laura", 18, "Female", "laurita");
        g[1] = new Gafanhoto("Júlia", 21, "Female", "jujuba");
        g[2] = new Gafanhoto("Fernando", 25, "Male", "fefefe");
        g[3] = new Gafanhoto("Creuza", 59, "Female", "creuzinha");
        g[4] = new Gafanhoto("João", 11, "Male", "joao");

        Visualizacao vis[] = new Visualizacao[4];
        vis[0] = new Visualizacao(g[0], v[1]);
        vis[1] = new Visualizacao(g[1], v[2]);
        vis[2] = new Visualizacao(g[2], v[2]);
        vis[3] = new Visualizacao(g[3], v[2]);

        vis[0].avaliar(6);
        vis[1].avaliar(76.0f);
        vis[2].avaliar();
        vis[3].avaliar(2);


        System.out.println(vis[0].toString());
        System.out.println(vis[1].toString());
        System.out.println(vis[2].toString());
        System.out.println(vis[3].toString());

        /*System.out.println(v[0].toString());
        System.out.println(v[1].toString());
        System.out.println(v[2].toString());
        System.out.println(g[0].toString());
        System.out.println(g[1].toString());*/
    }
}
