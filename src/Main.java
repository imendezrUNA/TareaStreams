import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Pelicula> peliculas = new ArrayList<>();
        peliculas.add(new Pelicula("E.T.", "Steven Spielberg", 1982));
        peliculas.add(new Pelicula("Avatar", "James Cameron", 2009));
        peliculas.add(new Pelicula("Salvar al soldado Ryan", "Steven Spielberg", 1998));
        peliculas.add(new Pelicula("Origen", "Christopher Nolan", 2010));
        peliculas.add(new Pelicula("L.A. Confidential", "Curtis Hanson", 1997));

        // 1. Obtener un sublistado con las películas estrenadas en el siglo XXI
        List<Pelicula> peliculasSigloXXI = peliculas.stream()
                .filter(p -> p.getEstreno() >= 2000)
                .collect(Collectors.toList());
        System.out.println("Películas estrenadas en el siglo XXI:");
        peliculasSigloXXI.forEach(System.out::println);

        // 2. Mostrar por pantalla los títulos de las películas de Steven Spielberg
        String titulosSpielberg = peliculas.stream()
                .filter(p -> p.getDirector().equals("Steven Spielberg"))
                .map(Pelicula::getTitulo)
                .collect(Collectors.joining(", "));
        System.out.println("\nPelículas de Steven Spielberg:");
        System.out.println(titulosSpielberg);

        // 3. Sublistado con los nombres de las películas alfabéticamente
        List<String> titulosOrdenados = peliculas.stream()
                .map(Pelicula::getTitulo)
                .sorted()
                .collect(Collectors.toList());
        System.out.println("\nPelículas ordenadas alfabéticamente:");
        titulosOrdenados.forEach(System.out::println);
    }
}
