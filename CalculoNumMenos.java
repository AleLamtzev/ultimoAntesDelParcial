package collectorTresPuntoCero;

public class CalculoNumMenos extends Calculador{
    private double numero;

    public CalculoNumMenos(double numero) {
        this.numero = numero;
    }

    @Override
    public double calcular(FiguLimitada figu) {
        return numero - figu.getUnidades();
    }
    
}
