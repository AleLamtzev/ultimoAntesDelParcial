package collectorTresPuntoCero;

import java.util.ArrayList;

public class ColeccionPrivada extends Coleccion {

    public ColeccionPrivada(String nombre, int porcentaje) {
        super(nombre, porcentaje);
    }

    @Override
    public ArrayList<Figu> filtrar(Filtro filtro) {
        return new ArrayList<Figu>();
    }
    
}
