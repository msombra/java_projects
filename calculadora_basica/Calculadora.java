import java.util.Scanner;

public class Calculadora {
    // Atributos
    private int valorA, valorB;
    private char operador;
    
    // Métodos públicos
    public void mostrarResultado() {
        int resultado = 0;
        String prtResultado = "Resultado: ";
        switch(this.operador) {
            case '+':
                resultado = this.valorA + this.valorB;
                System.out.println(prtResultado + resultado);
                break;
            case '-':
                resultado = this.valorA - this.valorB;
                System.out.println(prtResultado + resultado);
                break;
            case '*':
                resultado = this.valorA * this.valorB;
                System.out.println(prtResultado + resultado);
                break;
            case '/':
                if(this.valorA > this.valorB || this.valorA == this.valorB) {
                    resultado = this.valorA / this.valorB;
                    System.out.println(prtResultado + resultado);
                }
                else {
                    System.out.println("Divisor não pode ser maior que o dividendo.");
                }
                break;
            default:
                System.out.println("Operador inválido!");
                break;
        }
    }
    
    public void calcular() {
        Scanner scan = new Scanner(System.in);
		
		System.out.print("Informe um número: ");
		int num1 = scan.nextInt();
		this.setValorA(num1);
		
		System.out.print("Informe um número: ");
		int num2 = scan.nextInt();
		this.setValorB(num2);
		
		System.out.print("Informe o operador: ");
		char op = scan.next().charAt(0);
		this.setOperador(op);
		
		this.mostrarResultado();
		scan.close();
    }
    
    
    // Getters
    public int getValorA() {
        return valorA;
    }
    
    public int getValorB() {
        return valorB;
    }
    
    public char getOperador() {
        return operador;
    }
    
    // Setters
    public void setValorA(int v_A) {
        this.valorA = v_A;   
    }
    
    public void setValorB(int v_B) {
        this.valorB = v_B;
    }
    
    public void setOperador(char op) {
        this.operador = op;
    }
}