package collectorTresPuntoCero;

public class FiguLimitada extends Figu {
    private int unidades;
    private Calculador calc;
    //const
    public FiguLimitada(String album, int numero, double precio, int unidades) {
        super(album, numero, precio);
        this.unidades = unidades;
        this.calc = new CalculoFijo(precio); // inicialmente el precio es el mismo luego se puede setear
    }
    //metodos
    @Override 
    public double getPrecio(){
        if (calc.calcular(this)> this.precio) {
            return calc.calcular(this);
        } else {
            return this.precio;
        }
    }

    //get
    public int getUnidades() {
        return unidades;
    }
   
    public void setCalc(Calculador calc) {
        this.calc = calc;
    }

    
}
