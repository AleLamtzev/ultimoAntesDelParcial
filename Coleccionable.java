package collectorTresPuntoCero;

import java.util.ArrayList;

public abstract class Coleccionable {
    protected String nombre;
    public abstract double getPrecio();
    public abstract ArrayList<Figu> filtrar(Filtro filtro);
    public String getNombre() {
        return nombre;
    }
}
