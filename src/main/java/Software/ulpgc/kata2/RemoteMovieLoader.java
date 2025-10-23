package Software.ulpgc.kata2;

import java.io.*;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.zip.GZIPInputStream;

public class RemoteMovieLoader implements MovieLoader {
    private static final String RemoteUrl = "https://datasets.imdbws.com/title.basics.tsv.gz";
    private static final int BufferSize = 65536;

    @Override
    public List<Movie> loadAll() {
        try {
            return loadAllFrom(new URL(RemoteUrl));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private List<Movie> loadAllFrom(URL url) throws IOException {
        return loadAllFrom(url.openConnection());
    }

    private List<Movie> loadAllFrom(URLConnection urlConnection) throws IOException {
        try (InputStream is = new GZIPInputStream(new BufferedInputStream(urlConnection.getInputStream()), BufferSize)){
            return loadAllFrom(is);
        }
    }

    private List<Movie> loadAllFrom(InputStream is) {
        return loadFrom(new BufferedReader(new InputStreamReader(is)));
    }

    private List<Movie> loadFrom(BufferedReader reader) {
        List<Movie> movies = new ArrayList<>();
        new TsvMovieParser();
    }
}
