package Software.ulpgc.kata2;

public class TsvMovieParser implements MovieParser {
    @Override
    public Movie from(String str) {
        return from(str.split("\t"));
    }

    private Movie from(String[] split) {
        return new Movie(split[2], toInt(split[7]));
    }

    private int toInt(String s) {
        if (s.equals("\\N")) {
            return -1;
        }
        return Integer.parseInt(s);
    }
}
