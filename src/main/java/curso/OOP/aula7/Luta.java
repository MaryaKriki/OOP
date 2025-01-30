package curso.OOP.aula7;

import java.util.Random;

public class Luta {
    //Atributos

    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovado;

    //Metodos Especiais


    Luta() {
    }

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean getAprovado() {
        return aprovado;
    }

    public void setAprovado(boolean aprovado) {
        this.aprovado = aprovado;
    }

    //Metodos Abstratos

    public void marcarLuta(Lutador l1, Lutador l2){
        if (l1.getCategoria().equals(l2.getCategoria()) && l1 != l2){
           this.setAprovado(true);
           this.setDesafiado(l1);
           this.setDesafiante(l2);
        } else {
            this.setAprovado(false);
            this.setDesafiado(null);
            this.setDesafiante(null);
        }

    }

    public void lutar(){
        if (getAprovado()){
            System.out.println("----> DESAFIADO <----");
            this.desafiado.apresentar();
            System.out.println("----> DESAFIANTE <----");
            this.desafiante.apresentar();

            Random random = new Random();
            int vencedor = random.nextInt(3);

            switch (vencedor) {
                case 0:
                    System.out.println("==============");
                    System.out.println("Empatouuu!!!");
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                    System.out.println("==============");
                case 1:
                    System.out.println("==============");
                    System.out.println("Vitória do: " + desafiado.getNome());
                    this.desafiado.ganharLuta();
                    this.desafiante.perdeLuta();
                    System.out.println("==============");
                case 2:
                    System.out.println("==============");
                    System.out.println("Vitória do: " + desafiante.getNome());
                    this.desafiante.ganharLuta();
                    this.desafiado.perdeLuta();
                    System.out.println("==============");
            }
        } else {
            System.out.println("Luta não pode acontecer!!");
        }
    }
}
