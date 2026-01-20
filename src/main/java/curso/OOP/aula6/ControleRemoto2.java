package curso.OOP.aula6;

public class ControleRemoto2 implements Controlador {
    //Atributos
        private int volume;
        private String ligado;
        private String tocando;

    //Métodos Especiais
        public ControleRemoto2() {
            this.ligado = "Desligado...";
            this.tocando = "Nada reproduzindo...";
            this.volume = 0;
        }

    private String getTocando() {
        return tocando;
    }

    private void setTocando(String tocando) {
        this.tocando = tocando;
    }

    private String getLigado() {
        return ligado;
    }

    private void setLigado(String ligado) {
        this.ligado = ligado;
    }

    private int getVolume() {
        return volume;
    }

    private void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public void ligar() {
        this.setLigado("Ligado...");
        this.setVolume(50);
    }

    @Override
    public void desligar() {
        this.setLigado("Desligado...");
    }

    @Override
    public void abrirMenu() {
        System.out.println("-------------- MENU --------------");
        System.out.println(this.getLigado());
        System.out.println(this.getTocando());
        System.out.println("VOLUME: " + this.getVolume());
        for (int i = 1; i <= this.getVolume(); i += 10){
            System.out.print("o ");
        }
    }

    @Override
    public void fecharMenu() {
        System.out.println("\nFechando o menu...");
    }

    @Override
    public void maisVolume() {
        if (this.getLigado().equals("Ligado...")){
            this.setVolume(getVolume() + 10);
        }
    }

    @Override
    public void menosVolume() {
        if (this.getLigado().equals("Ligado...")){
            this.setVolume(getVolume() - 10);
        }
    }

    @Override
    public void ligarMudo() {
        if (this.getLigado().equals("Ligado...") && this.getVolume() > 0){
            this.setVolume(0);
        }
    }

    @Override
    public void desligarMudo() {
        if (this.getLigado().equals("Ligado...") && this.getVolume() == 0){
            this.setVolume(50);
        }
    }

    @Override
    public void play() {
       if (this.getLigado().equals("Ligado...") && !(getTocando().equals("Reproduzindo..."))){
           this.setTocando("Reproduzindo...");
       }

    }

    @Override
    public void pause() {
        if (this.getLigado().equals("Ligado...") && getTocando().equals("Reproduzindo...")){
            this.setTocando("Nada reproduzindo...");
        }
    }
}
