package curso.OOP.aula5;

public class ContaBanco {
    public int numConta;
    protected String tipo = "";
    protected String tipo2 = "";
    private String dono;
    private float saldo;
    private boolean contaAberta;

    private float saque;
    public ContaBanco() {
        this.contaAberta = false;
        this.saldo = 0.0f;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String t) {
        this.tipo = t;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int n) {
        this.numConta = n;
    }

    public String getDono() {
        return dono = dono;
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

    public boolean isContaAberta() {
        return contaAberta;
    }

    public void setContaAberta(boolean cA) {
        this.contaAberta = cA;
    }

    public void status(){
        System.out.println("SOBRE A CONTA: ");
        System.out.println("Nome do(a) dono(a): " + this.dono);
        System.out.println("Número da conta: " + this.numConta);
        System.out.println("Tipo: " + this.tipo);
        System.out.println("Saldo: " + this.saldo);
        System.out.println("Conta está aberta? " + this.contaAberta);
    }

    public void abrirConta(String t){
        setTipo(t);
        setContaAberta(true);
        if (t == "cc"){
            saldo = 50;
        } else if (t == "cp"){
            saldo = 150;
        }
    }

    public void fecharConta(){

        if (saldo > 0.0){
            System.out.println("Não é possível fechar a conta com saldo positivo!!!");
        } else if (saldo < 0.0){
            System.out.println("Não é possível fechar a conta com saldo negativo!!!");
        } else{
            contaAberta = false;
        }
    }

    public  void depositar(float v){
        if (contaAberta == true){
            saldo = saldo + v;
        } else {
            System.out.println("Abra sua conta para depositar!");
        }
    }

    public void sacar(float v){
        if (saldo < v){
            System.out.println("Não foi possível sacar devido ao valor do seu saldo!!!");
        } else if (saldo > v){
            saldo = saque - v;
        }
    }

    public float mensalidade;

    public void pagarMensal(){
        if (tipo.equals("cp")){
            mensalidade = 20.90f;
        } else if (tipo.equals("cc")){
            mensalidade = 12.90f;
        }
       saldo = saldo - mensalidade;
    }
}
