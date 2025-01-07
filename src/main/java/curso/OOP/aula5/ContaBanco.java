package curso.OOP.aula5;

public class ContaBanco {

    public int numConta;
    protected String tipo = "";
    private String dono;
    private float saldo;
    private boolean contaAberta;

    public float mensalidade;
    private float saque;

    public String getTipo() {
        return tipo = "";
    }

    public void setTipo(String tipo) {
        this.tipo = "";
    }

    public int getNumConta() {
        return numConta = numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getDono() {
        return dono = dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public void getSaldo() {
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean isContaAberta() {
        return contaAberta;
    }

    public void setContaAberta(boolean contaAberta) {
        this.contaAberta = contaAberta;
    }

    public ContaBanco(boolean contaAberta, float saldo) {
        this.contaAberta = false;
        this.saldo = 0.0f;
    }

    public void abrirConta(){
        this.contaAberta = true;

        if (tipo.equals("cp")) {
            this.saldo = 150.0f;
        } else if (tipo.equals("cc")){
            this.saldo = 50.0f;
        }

    }

    public void fecharConta(){
        this.contaAberta = false;

        if (saldo > 0.0){
            System.out.println("Não é possível fechar a conta com saldo positivo!!!");
        } else if (saldo < 0.0){
            System.out.println("Não é possível fechar a conta com saldo negativo!!!");

        }
    }

    public  void depositar(float saldo){

    }

    public void sacar(float saque){
        if (saldo < saque){
            System.out.println("Não foi possível sacar devido ao valor do seu saldo!!!");
        } else if (saldo > saque){
            saldo -= saque;
        }
    }

    public void pagarMensal(){
        if (tipo.equals("cp")){
            mensalidade = 20.90f;
        } else if (tipo.equals("cc")){
            mensalidade = 12.90f;
        }
       saldo -= mensalidade;
    }

    public void status(){
        System.out.println("SOBRE A CONTA: ");
        System.out.println("Nome do(a) dono(a): " + this.dono);
        System.out.println("Número da conta: " + this.numConta);
        System.out.println("Tipo: " + this.tipo);
        System.out.println("Saldo: " + this.saldo);
        System.out.println("Conta está aberta? " + this.contaAberta);
    }
}
