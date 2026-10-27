package collectorTresPuntoCero;

public class FiltroNumero extends  Filtro{
    private int numero;

    public FiltroNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public boolean cumple(Figu figu) {
        
        return figu.getNumero() == this.numero;
    }
    
}
