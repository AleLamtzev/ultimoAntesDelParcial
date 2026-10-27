package collectorTresPuntoCero;

public class FiltroAlbum extends Filtro{
    private String album;
    public FiltroAlbum(String album){
        this.album = album;
    }
    public boolean cumple(Figu figu){
        return figu.getAlbum().equals(album);
    }
}
