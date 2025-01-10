package curso.OOP.aula5;

public class ContaBancoResp {
    // atributos
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    // metodos personalizados
    public void abrirConta(){
        this.setTipo(tipo);
        this.setStatus(true);
        if (tipo == "CC"){
            this.saldo = 150;
        } else if (tipo == "CP"){
            this.saldo = 50;
        }
    }
    public void fecharConta(){
        if (this.getSaldo() > 0){
            System.out.println("Não foi possível fechar a conta devido ao valor do seu saldo!");
        } else if (this.getSaldo() < 0){
            System.out.println("Não é possível fechar a conta devido ao débito pendente!");
        } else {
            this.setStatus(true);
        }

    }
    public void depositar(float v){
        if (this.getStatus()){
            this.saldo = this.saldo + v;
        }

    }
    public void sacar(float v){
        if (this.getSaldo() > v){
            this.saldo = this.saldo - v;
        } else if (getSaldo() < v){
            System.out.println("Não foi possível sacar devido ao valor do seu saldo");
        }

    }
    public void pagarMensal(){
        int v = 0;
        if (getTipo() == "CP"){
            v = 12;
        }else if (getTipo() == "CC"){
            v = 20;
        } else if (getSaldo() < v){

        }
    }
    // metodos especiais
    public ContaBancoResp(){
        this.saldo = 0;
        this.status = false;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int n) {
        this.numConta = n;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String t) {
        this.tipo = t;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String d) {
        this.dono = d;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float s) {
        this.saldo = s;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean st) {
        this.status = st;
    }

    public void estadoAtual(){
        System.out.println("----------SOBRE A CONTA------------");
        System.out.println("Nome do(a) dono(a): " + this.dono);
        System.out.println("Número da conta: " + this.numConta);
        System.out.println("Tipo: " + this.tipo);
        System.out.println("Saldo: " + this.saldo);
        System.out.println("Conta está aberta? " + this.getStatus());
    }
}
