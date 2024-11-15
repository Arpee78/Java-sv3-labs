package algorithmsfilter.movies;

import java.util.ArrayList;
import java.util.List;

public class VideoTheque {

    private List<Movie> movies = new ArrayList<>();

    public List<Movie> getMovies() {
        return new ArrayList<>(movies);
    }

    public void addMovie(Movie movie) {
        movies.add(movie);
    }

    public List<Movie> getGoodMoviesWithCategoryGiven(Category category) {
        List<Movie> goodMoviesWithCategoryGiven = new ArrayList<>();

        for (Movie movie : movies) {
            if (movie.getCategory() == category && movie.getRating() > 3) {
                goodMoviesWithCategoryGiven.add(movie);
            }
        }

        return goodMoviesWithCategoryGiven;
    }
}
