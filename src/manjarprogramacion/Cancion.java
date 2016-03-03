package manjarprogramacion;
/**
 *
 * @author pablolago97
 */
public class Cancion {
    private String titulo;
    private int numeroCancion;
    private String rutaCancion = "/audio/"+titulo+".wav";

    public Cancion() {
    }

    public Cancion(String titulo, int numeroCancion) {
        this.titulo = titulo;
        this.numeroCancion = numeroCancion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getNumeroCancion() {
        return numeroCancion;
    }

    public void setNumeroCancion(int numeroCancion) {
        this.numeroCancion = numeroCancion;
    }

    public String getRutaCancion() {
        return rutaCancion;
    }

    public void setRutaCancion(String rutaCancion) {
        this.rutaCancion = rutaCancion;
    }
    
}