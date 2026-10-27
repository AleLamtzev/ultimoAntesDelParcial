package collectorTresPuntoCero;

public class CalculoFijo extends Calculador{
    private double precio;

    public CalculoFijo(double precio) {
        this.precio = precio;
    }

    @Override
    public double calcular(FiguLimitada figu) {
        return this.precio;
    }
    
}
