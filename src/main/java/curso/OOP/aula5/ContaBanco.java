package curso.OOP.aula5;

public class ContaBanco {
    public int numConta;
    protected String tipo;
    private String dono;
    public float mensalidade;
    private float saldo;
    private boolean contaAberta;

    //Métodos Especiais


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

    public float getMensalidade() {
        return mensalidade;
    }

    public void setMensalidade(float mensalidade) {
        this.mensalidade = mensalidade;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float s) {
        this.saldo = s;
    }

    public boolean getContaAberta() {
        return contaAberta;
    }

    public void setContaAberta(boolean cA) {
        this.contaAberta = cA;
    }
    //Métodos


    public void status(){
        System.out.println("SOBRE A CONTA: ");
        System.out.println("Nome do(a) dono(a): " + getDono());
        System.out.println("Número da conta: " + getNumConta());
        System.out.println("Tipo: " + getTipo());
        System.out.println("Saldo: " + getSaldo());
        System.out.println("Conta está aberta? " + getContaAberta());
    }

    public void abrirConta(String tipo){
        setTipo(tipo);
        setContaAberta(true);
        if (tipo == "cc"){
            setSaldo(50.00f);
        } else if (tipo == "cp"){
            setSaldo(150.00f);
        }
    }

    public void fecharConta(){
        if (saldo > 0.0){
            System.out.println("Não é possível fechar a conta com saldo positivo!!!");
        } else if (saldo < 0.0){
            System.out.println("Não é possível fechar a conta com saldo negativo!!!");
        } else {
            contaAberta = false;
        }
    }

    public  void depositar(float v){
        if (getContaAberta()){
            setSaldo(saldo + v);
        } else {
            System.out.println("Abra sua conta para depositar!");
        }
    }

    public void sacar(float v){
        if (saldo < v){
            System.out.println("Não foi possível sacar devido ao valor do seu saldo!!!");
        } else if (saldo > v){
            setSaldo(saldo + v);
        }
    }

    public void pagarMensal(){
        if (tipo.equals("cp")){
            setMensalidade(20.90f);
        } else if (tipo.equals("cc")){
            setMensalidade(12.90f);
        }
        setSaldo(saldo - mensalidade);
    }
}
