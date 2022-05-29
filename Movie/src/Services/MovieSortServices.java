package Services;

import Models.Movie;
import Repositories.MovieRepository;
import java.io.FileNotFoundException;
import java.util.Comparator;
import java.util.List;

public class MovieSortServices {
    private final MovieRepository movieRepository;

    public MovieSortServices() throws FileNotFoundException {
        movieRepository = new MovieRepository();
    }

    public List<Movie> sortMovieByName(SortType sortTypeMovie) {
        if (sortTypeMovie.equals(SortType.ASC)) {
            return movieRepository.getMovieList().stream().sorted(Comparator.comparing(Movie::getName)).toList();
        }
        else {
            return movieRepository.getMovieList().stream().sorted(Comparator.comparing(Movie::getName).reversed()).toList();

        }


    }



    }

