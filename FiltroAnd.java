package collectorTresPuntoCero;

public class FiltroAnd extends Filtro{
    Filtro f1, f2;

    public FiltroAnd(Filtro f1, Filtro f2) {
        this.f1 = f1;
        this.f2 = f2;
    }

    @Override
    public boolean cumple(Figu figu) {
        return f1.cumple(figu) && f2.cumple(figu);
    }
    
}
