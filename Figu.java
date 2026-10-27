package collectorTresPuntoCero;

import java.util.ArrayList;

public class Figu extends Coleccionable{
    protected String album;
    protected int numero;
    protected double precio;
    //const
    public Figu(String album, int numero, double precio) {
        this.album = album;
        this.numero = numero;
        this.precio = precio;
    }
    
    @Override
    public ArrayList<Figu> filtrar(Filtro filtro) {
        ArrayList<Figu> salida = new ArrayList<>();
        if (filtro.cumple(this)) {
            salida.add(this);
        }
        return salida;
    }

    public double getPrecio() {
        return precio;
    }

    //get y set
    public String getAlbum() {
        return album;
    }
    public void setAlbum(String album) {
        this.album = album;
    }
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    
}
