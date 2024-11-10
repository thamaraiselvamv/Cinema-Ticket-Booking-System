public class MovieDetails {
    private String title;
    private int price;
    private String[] showtimes;

    public MovieDetails(String title, int price, String[] showtimes) {
        this.title = title;
        this.price = price;
        this.showtimes = showtimes;
    }

    public String getTitle() {
        return title;
    }

    public int getPrice() {
        return price;
    }

    public String[] getShowtimes() {
        return showtimes;
    }
}