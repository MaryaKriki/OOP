package curso.OOP.aula11;

public class Aula11 {
    public static void main(String[] args) {
        //Visitante v1 = new Visitante();
        //v1.setNome("Oswaldo");
        //v1.setIdade(19);
        //v1.setSexo("Male");
        //System.out.println(v1.toString());

        Aluno a1 = new Aluno();
        a1.setNome("Ana Clara");
        a1.setMat(987654);
        a1.setCurso("Moda");
        a1.setIdade(17);
        a1.setSexo("Female");
        a1.pagarMensalidade();

        Bolsista b1 = new Bolsista();
        b1.setNome("Cleudette");
        b1.pagarMensalidade();
        b1.setIdade(16);
        b1.setMat(963852);
        b1.setCurso("Medicina");
        b1.setBolsa(28.7f);
        b1.setSexo("Female");

        Professor p1 = new Professor();
        p1.setNome("Jubileu");
        p1.setSexo("Male");
        p1.setIdade(56);
        p1.setSalario(1528.7f);
        p1.receberAumento();
        p1.setEspecialidade("Filosofia");

        Tecnico t1 = new Tecnico();
        t1.setNome("Neudane");
        t1.setIdade(19);
        t1.setMat(966252);
        t1.setProfissionalidade("Logística");
        t1.setSexo("Female");
        t1.pagarMensalidade();
        t1.praticando();

    }

}
