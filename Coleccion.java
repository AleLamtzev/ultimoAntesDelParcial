package collectorTresPuntoCero;

import java.util.ArrayList;

public class Coleccion extends Coleccionable {
    protected int porcentaje;
    protected ArrayList <Coleccionable> lista;
    //const
    public Coleccion(String nombre, int porcentaje) {
        this.nombre = nombre;
        this.porcentaje = porcentaje;
        this.lista = new ArrayList<>();
    }
    //metodos
    public void agregarColeccionable(Coleccionable col){
        lista.add(col);
    }

    public double getPrecio(){
        double suma = 0.0;
        for (Coleccionable elemColeccionable : lista) {
            suma += elemColeccionable.getPrecio();
        }
        return suma - (suma * porcentaje)/100;
    }

    public ArrayList<Figu> filtrar(Filtro filtro){
        ArrayList<Figu> salida = new ArrayList<>();
        for (Coleccionable eColeccionable : lista) {
            salida.addAll(eColeccionable.filtrar(filtro));
        }
        return salida;
    }

    //get y set
    public int getPorcentaje() {
        return porcentaje;
    }
    public void setPorcentaje(int porcentaje) {
        this.porcentaje = porcentaje;
    }
    
}
