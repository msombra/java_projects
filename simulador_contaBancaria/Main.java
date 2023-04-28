
public class Main
{
	public static void main(String[] args) {
		ContaBanco c1 = new ContaBanco();
		c1.setNumConta(4738);
		c1.setDono("Matheus");
		c1.abrirConta("CC");
		c1.estadoAtual();
		
		ContaBanco c2 = new ContaBanco();
		c2.setNumConta(8391);
		c2.setDono("Joana");
		c2.abrirConta("CP");
		c2.estadoAtual();
		
		// realizando depósito
		c1.depositar(100);
		c1.estadoAtual();
		
		c2.depositar(500);
		c2.estadoAtual();
		
		// realizando saque na conta
		c1.sacar(300);
		c1.estadoAtual();
		
        c2.sacar(100);
        c2.estadoAtual();
        
        // pagando mensalidade
        c1.pagarMensal();
        c1.estadoAtual();
        
        c2.pagarMensal();
        c2.estadoAtual();
        
        // fechando a conta 
        c1.sacar(138);
        c1.fecharConta();
        c1.estadoAtual();
        
        c2.fecharConta();
        c2.estadoAtual();
	}
}
