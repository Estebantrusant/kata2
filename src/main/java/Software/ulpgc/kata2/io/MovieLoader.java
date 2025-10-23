package Software.ulpgc.kata2.io;

import Software.ulpgc.kata2.model.Movie;

import java.util.List;

public interface MovieLoader {
    List<Movie> loadAll();
}
