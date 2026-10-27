package collectorTresPuntoCero;

import java.util.ArrayList;
import java.util.Comparator;

public class Collector3 {
    private ArrayList<Coleccionable> lista;

    public Collector3() {
        this.lista = new ArrayList<>();
    }

    public void agregarColeccionable(Coleccionable elemColeccionable){
        lista.add(elemColeccionable);
    }

    public ArrayList<Figu> buscar(Filtro filtro){
        ArrayList<Figu> salida = new ArrayList<>();
        for (Coleccionable eColeccionable : lista) {
            salida.addAll(eColeccionable.filtrar(filtro));
        }
        salida.sort(Comparator.comparing(Figu::getPrecio).thenComparing(Figu::getNombre));
        return salida;
    }
    
}
