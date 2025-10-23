package Software.ulpgc.kata2;

import Software.ulpgc.kata2.io.RemoteMovieLoader;
import Software.ulpgc.kata2.model.Movie;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        RemoteMovieLoader remoteMovieLoader = new RemoteMovieLoader();
        List<Movie> movies = remoteMovieLoader.loadAll();
        for (Movie movie : movies) {
            System.out.println(movie.tittle());
        }
    }
}
