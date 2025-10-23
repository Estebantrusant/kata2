package Software.ulpgc.kata2.serializers;

import Software.ulpgc.kata2.model.Movie;

public interface MovieParser {
    Movie from(String str);
}
