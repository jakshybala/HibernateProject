package Services;

import Exceptions.MovieException;
import Models.Movie;
import Repositories.MovieRepository;

import java.io.FileNotFoundException;
import java.util.Optional;

public class MovieFindServices {
    private final MovieRepository movieRepository;

    public MovieFindServices() throws FileNotFoundException {
        movieRepository = new MovieRepository();
    }

    public Movie findMovieByName(String movieName) {
//        Optional<Movie> movieOptional = movieRepository.getMovieList().stream().filter(movie -> movie.getName().equals(moviName)).findFirst();
//        Movie movie = movieOptional.orElseThrow(() -> new MovieException("Movie not Found"));
        return movieRepository.getMovieList().stream().filter(movie -> movie.getName()
                .equalsIgnoreCase(movieName)).findFirst().orElseThrow(() -> new MovieException("Movie by that name: " + movieName + " not founded"));


    }
}
