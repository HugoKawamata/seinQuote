package episodes;

public class Episode {

    int season;
    int episode;
    String name;
    String url;

    public Episode(int s, int e, String n, String link) {
        season = s;
        episode = e;
        name = n;
        url = link;
    }

    public String toString() {
        return "Season " + season + ", Episode " + episode + ": The " + name;
    }
}