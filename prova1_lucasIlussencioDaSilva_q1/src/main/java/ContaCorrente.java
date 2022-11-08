public class ContaCorrente {
    private String nome;
    private String numeroConta;
    private Double saldo;
    private String tipoConta;
    private Double limiteEspecial;

    //CONSTRUTOR PARA CONTA COMUM
    public ContaCorrente(String nome, String numeroConta, Double saldo, String tipoConta){
        this.nome = nome;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        this.tipoConta = tipoConta;
        this.limiteEspecial = 0.0;
    }
    //CONSTRUTOR PARA CONTA ESPECIAL
    public ContaCorrente(String nome, String numeroConta, Double saldo, String tipoConta, Double limiteEspecial) {
        this.nome = nome;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        this.tipoConta = tipoConta;
        this.limiteEspecial = limiteEspecial;
    }

    //METODOS GETTERS
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public Double getSaldo() {
        return saldo;
    }

    //METODOS SETTERS
    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public String getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }

    public Double getLimiteEspecial() {
        return limiteEspecial;
    }

    public void setLimiteEspecial(Double limiteEspecial) {
        this.limiteEspecial = limiteEspecial;
    }
    //METODOS
    public void depositar(Double valor){
        this.saldo += ( valor - (0.001*valor) );
        System.out.printf("Deposito de R$ %.2f realizado com sucesso!\n", valor);
    }

    public boolean sacar(Double valor){
        valor = valor + (0.001 * valor);
        if(this.saldo > valor){
            this.saldo -= valor;
            return true;
        }else{
            return false;
        }
    }

    public boolean sacar(Double valor, Double limite){
        valor = valor + (0.002 * valor);
        if( (this.saldo+this.limiteEspecial) > valor){
            this.saldo -= valor;
            return true;
        }else{
            return false;
        }
    }
}
