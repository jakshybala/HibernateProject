import Exceptions.BadSortException;
import Exceptions.MovieException;
import Models.Movie;
import Repositories.MovieRepository;
import Services.MovieFindServices;
import Services.MovieSortServices;
import Services.SortType;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.SortedMap;

public class MainMovie {
    public static void main(String[] args) throws FileNotFoundException {
        MovieFindServices movieFindServices = new MovieFindServices();
        MovieSortServices movieSortServices = new MovieSortServices();
        Scanner enterData = new Scanner(System.in);
        System.out.println("ASC or DESC");
        String sort = enterData.nextLine();
        List<Movie> movieList;
        if (sort.equalsIgnoreCase("ASC")) {
            movieList = movieSortServices.sortMovieByName(SortType.ASC);
        }else if (sort.equalsIgnoreCase("DESC")) {
            movieList = movieSortServices.sortMovieByName(SortType.DESC);
        }else {
            throw new BadSortException("you gice bad sort type");
        }
        movieList.forEach(System.out::println);



//        try {
//            System.out.print("Search by name *** Enter movie name: ");
//            String searchText = enterData.nextLine();
//            Movie findMovie = movieFindServices.findMovieByName(searchText);
//            System.out.println(findMovie);
//
//        }catch (MovieException movieException) {
//            System.out.println("\u001B[36m" + movieException.getMessage());
//        }

    }


    }

