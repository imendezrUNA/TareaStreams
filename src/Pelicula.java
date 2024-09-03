public class Pelicula {
    private final String titulo;
    private final String director;
    private final int estreno;

    public Pelicula(String titulo, String director, int estreno) {
        this.titulo = titulo;
        this.director = director;
        this.estreno = estreno;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDirector() {
        return director;
    }

    public int getEstreno() {
        return estreno;
    }

    @Override
    public String toString() {
        return titulo + " (" + director + ", " + estreno + ")";
    }
}
