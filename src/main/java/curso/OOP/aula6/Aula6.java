package curso.OOP.aula6;

public class Aula6 {
    public static void main(String[] args) {
        ControleRemoto cm1 = new ControleRemoto();
        cm1.ligar();
        cm1.abrirMenu();
        cm1.maisVolume();
        cm1.play();
        cm1.fecharMenu();

        ControleRemoto2 cm2 = new ControleRemoto2();
        cm2.ligar();
        cm2.ligarMudo();
        cm2.play();
        cm2.abrirMenu();
        cm2.fecharMenu();

        ControleRemoto2 cm3 = new ControleRemoto2();
        cm3.ligar();
        cm3.maisVolume();
        cm3.play();
        cm3.pause();
        cm3.abrirMenu();
        cm3.fecharMenu();

        ControleRemoto2 cm4 = new ControleRemoto2();
        cm4.abrirMenu();
    }
}
