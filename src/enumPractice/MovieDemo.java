package enumPractice;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MovieDemo {
    public static void main(String[] args) {

        List<Movie> movies = Arrays.asList(
                new Movie("Titanic", MovieCategory.ROMANTIC),
                new Movie("Matrix", MovieCategory.SCI_FI),
                new Movie("Jurrasic Park", MovieCategory.SCI_FI),
                new Movie("Saw", MovieCategory.HORROR)
        );

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj kategorię filmu. Dostępne to:");

        MovieCategory[] movieCategories = MovieCategory.values();
        for (MovieCategory movieCategory : movieCategories) {
            System.out.println(movieCategory.name());
        }
        String cat = scanner.nextLine();
        MovieCategory movieCategory = MovieCategory.valueOf(cat); // zamienia String na enum
        System.out.println("Filmy z tej kategorii:");

        for (Movie movie : movies) {
            if (movie.getMovieCategory() == movieCategory){ // enum jest tworzony tylko raz, wiec mozna tak porownac
                System.out.println(movie.getTitle() + movie.getMovieCategory());
            }
        }
        // metoda compareTo porownuje pozycje dwoch enumow
        // metoda ordinal zwraca pozycje enuma w tablicy

    }
}
