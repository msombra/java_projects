public class ContaBanco {
    // Atributos
    public int numConta;
    protected String tipoConta;
    private String dono;
    private double saldo;
    private boolean status;
    
    // Construtor
    public ContaBanco() {
        this.setSaldo(0);
        this.setStatus(false);
    }
    
    // ---- GETTERS & SETTERS - ÍNICIO ----
    
    // NÚMERO DA CONTA
    public int getNumConta() {
        return this.numConta;
    }
    
    public void setNumConta(int n) {
        this.numConta = n;
    }
    
    // TIPO DA CONTA
    public String getTipoConta() {
        return tipoConta;
    }
    
    public void setTipoConta(String t) {
        tipoConta = t;
    }
    
    // DONO
    public String getDono() {
        return this.dono;
    }
    
    public void setDono(String d) {
        this.dono = d;
    }
    
    // SALDO
    public double getSaldo() {
        return this.saldo;
    }
    
    public void setSaldo(double s) {
        this.saldo = s;
    }
    
    // STATUS 
    public boolean getStatus() {
        return this.status;
    }
    
    public void setStatus(boolean e) {
        this.status = e;
    }
    // ---- GETTERS & SETTERS - FIM ----
    
    // Métodos
    
    public void abrirConta(String t) {
        this.setTipoConta(t);
        this.setStatus(true);
        String contaAberta = "Conta aberta com sucesso!!!";
        
        if(t == "CC") {
            this.setSaldo(50);
            System.out.println(contaAberta);
        }
        else if(t == "CP") {
            this.setSaldo(150);
            System.out.println(contaAberta);
        }
        /*else {
            System.out.println("Erro");
        }*/
    }
    
    public void fecharConta() {
        if (this.getSaldo() > 0) {
            System.out.println("Conta com dinheiro, impossível realizar o fechamento da conta!");
        }
        else if (this.getSaldo() < 0) {
            System.out.println("Conta em débito, impossível realizar o fechamento da conta!");
        }
        else {
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso!");
        }
    }
    
    public void depositar(double v) {
        if (this.getStatus()) {
            this.setSaldo(this.getSaldo() + v);
            System.out.println("Depósito realizado na conta de " + this.getDono()
            + " no valor de " + v);
        }
        else {
            System.out.println("Impossível depositar");
        }
    }
    
    public void sacar(double v) {
        if (this.getStatus()) {
            if (this.getSaldo() >= v) {
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Saque de " + v + " realizado na conta de " + this.getDono());
            }
            else {
                System.out.println("Saldo insuficiente para saque");
            }
        }
        else {
            System.out.println("Impossível sacar");
        }
    }
    
    public void pagarMensal() {
        int v = 0;
        if(this.getTipoConta() == "CC") {
            v = 12;
        }
        else if(this.getTipoConta() == "CP") {
            v = 20;
        }
        
        if(this.getStatus()) {
            this.setSaldo(this.getSaldo() - v);
            System.out.println("Mensalidade paga com sucesso por " + this.getDono());
        }
        else {
            System.out.println("Impossível pagar!");
        }
    }
    
    // Status da Classe
    public void estadoAtual() {
        System.out.println("------------------------------");
        System.out.println("Número da conta: " + this.getNumConta());
        System.out.println("Tipo da conta: " + this.getTipoConta());
        System.out.println("Nome do dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Está aberta? " + this.getStatus());
        System.out.println();
    }
}