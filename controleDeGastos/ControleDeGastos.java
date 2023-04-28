public class ControleDeGastos {
    
    
    public void valorPagar(double v) {
        if (v <= 500.00) {
            System.out.println("O valor será pago a vista!");
        }
        else if (v > 500.00 && v <= 1000.00) {
            double v_2x = v / 2;
            System.out.printf("O valor será pago em duas vezes: %.2f", v_2x);
        }
        else if (v > 1000.00 && v <= 2000.00) {
            double v_6x = v / 6;
            System.out.printf("O valor será pago em 6 vezes: %.2f", v_6x);
        }
        else if (v >= 4000.00) {
            System.out.println("Não será possível pagar, pois ultrapassou o valor da cota");
        }
        else {
            double v_10x = v / 10;
            System.out.printf("O valor será pago em 10 vezes: %.2f",v_10x);
        }
    }
}