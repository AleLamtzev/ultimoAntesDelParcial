package collectorTresPuntoCero;

public class FiltroPrecio extends Filtro {
    private double precio;
    public FiltroPrecio(double precio){
        this.precio = precio;
    }
    public boolean cumple(Figu figu){
        return figu.getPrecio() > this.precio;
    }
}
