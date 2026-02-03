package curso.OOP.aula13;

public class Cachorro extends Lobo {

    @Override
    public void emitirSom() {
        System.out.println("Au Au Auu!!");
    }

    public void reagir(String frase){
        if (frase.equals("Toma comida") || frase.equals("Olá")){
            System.out.println("Abanando o rabo e latindo");
            this.emitirSom();
        } else {
            System.out.println("Rosnando");
        }
    }
    public void reagir(int hora, int min){
        if(hora < 12){
            System.out.println("Abanando o rabo");
        } else if(hora >= 18){
            System.out.println("Ignorou");
        } else {
            System.out.println("Abanando o rabo e latindo");
            this.emitirSom();
        }

    }
    public void reagir(boolean dono){
        if (dono){
            System.out.println("Abanando o rabo");
        } else {
            System.out.println("Rosnando e latindo");
            this.emitirSom();
        }

    }
    public void reagir(int idade, float peso){
        if (idade < 5){
            if (peso < 10){
                System.out.println("Abanando o rabo");
            } else {
                System.out.println("Latindo");
                this.emitirSom();
            }
        } else {
            if (peso < 10){
                System.out.println("Rosnando");
            } else {
                System.out.println("Ignorou");
            }
        }

    }

}
