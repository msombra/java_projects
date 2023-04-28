public class CartaoCredito {
    // Atributos
    private double saldo;
    private double fatura;
    private String tipo;
    private int senha;
    
    // Métodos Públicos
    public void compraDebito(int s, double valor) {
        if(this.getSenha() == s) {
            if (this.getSaldo() < valor) {
                System.out.println("Saldo insuficiente");
            }
            else {
                this.setSaldo(this.getSaldo() - valor);
                System.out.println("Valor de R$" + valor + " descontado");
            }
        }
        else {
            System.out.println("Senha incorreta");
        }
    }
    
    public void compraCredito(int s, double valor, int parcela) {
        if(this.getSenha() == s) {    
            if (this.getTipo() == "Débito") {
                System.out.println("O cartão não aceita crédito");
            }
            
            if (this.getTipo() == "Crédito") {
                if (valor > 600) {
                    System.out.println("Infelizmente o valor atingiu o limite disponível");
                }
                else if (parcela > 1) {
                    this.setFatura((this.getFatura() + valor) / parcela);
                    System.out.println("Compra de R$" + valor + " aprovada no crédito.");
                    System.out.println("O valor foi parcelada em " + parcela + " vezes");
                }
                else {
                    this.setFatura(this.getFatura() + valor);
                    System.out.println("Compra de R$" + valor + " aprovada no crédito");
                }
            }
        }
        else {
            System.out.println("Senha incorreta");
        }
    }
    
    public void pagarFatura() {
        if(this.getSaldo() > this.getFatura()) {
            this.setSaldo(this.getSaldo() - this.getFatura());
            this.setFatura(this.getFatura() - this.getFatura());
            System.out.println("Fatura paga");
        }
        else {
            System.out.println("Você não possui saldo suficiente para efetuar o pagamento da fatura");
        }
    }
    
    /*public void receberSalario(double extra) {
        this.setSaldo(this.getSaldo() + 1200);
        
        if(extra > 0) {
            this.setSaldo(this.getSaldo() + extra);
            System.out.println("Total de hora extra: R$ " + extra);
        }
    }*/
    
    // Método de Status
    public void status() {
        System.out.println("----- STATUS DO CARTÃO -----");
        System.out.println("Saldo: " + getSaldo());
        System.out.println("Tipo: " + getTipo());
        System.out.println("Senha: " + getSenha());
        if(getTipo() == "Crédito") {
            System.out.println("Fatura: " + getFatura());
        }
        else {
            System.out.println("Não existe fatura pois o cartão é apenas débito!");
        }
        System.out.println();
    }
    
    // Métodos Getters
    public double getSaldo() {
        return saldo;
    }
    
    public double getFatura() {
        return fatura;
    }
    
    public String getTipo() {
        return tipo;
    }
    
    public int getSenha() {
        return senha;
    }
    
    // Métodos Setters
    public void setSaldo(double s) {
        saldo = s;
    }
    
    public void setFatura(double f) {
        fatura = f;
    }
    
    public void setTipo(String t) {
        tipo = t;
    }
    
    public void setSenha(int s) {
        senha = s;
    }
    
    // Construtor
    public CartaoCredito() {
        this.setSaldo(0);
        this.setTipo("Débito");
    }
}