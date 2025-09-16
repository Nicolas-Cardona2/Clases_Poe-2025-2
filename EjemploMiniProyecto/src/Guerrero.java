public class Guerrero {

    private TipoGuerrero tipoGuerrero;
    private String nombre;

    public Guerrero(TipoGuerrero tipoGuerrero, String nombre) {
        this.tipoGuerrero = tipoGuerrero;
        this.nombre = nombre;
    }

    public TipoGuerrero getTipoGuerrero() {
        return tipoGuerrero;
    }

    public void setTipoGuerrero(TipoGuerrero tipoGuerrero) {
        this.tipoGuerrero = tipoGuerrero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}   
