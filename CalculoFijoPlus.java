package collectorTresPuntoCero;

public class CalculoFijoPlus extends Calculador {
    private double fijo;
    private int multiplicador;
    public CalculoFijoPlus(double fijo, int multiplicador) {
        this.fijo = fijo;
        this.multiplicador = multiplicador;
    }
    @Override
    public double calcular(FiguLimitada figu) {
        return (fijo * multiplicador)- figu.getUnidades();
    }
    
}
