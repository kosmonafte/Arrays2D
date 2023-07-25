import java.util.concurrent.Callable;

public class Task10 {
    public static void main(String[] args) {
        Cinema cinema = new Cinema(10, 20);
        System.out.println(cinema.showArray());
        System.out.println(cinema.searchPlaces(4));
    }
}
