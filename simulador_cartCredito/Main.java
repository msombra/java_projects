
public class Main
{
	public static void main(String[] args) {
		CartaoCredito c1 = new CartaoCredito();
		c1.setSaldo(300);
		c1.setTipo("Crédito");
		c1.setSenha(4355);
		c1.status();
		
		c1.compraDebito(4355, 11.9);
		
		c1.compraCredito(4355, 400, 3);
		
		c1.status();
		
		c1.pagarFatura();
		c1.status();
	}
}
