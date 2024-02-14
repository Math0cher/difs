import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Point> bun = List.of(
                new Point(25 * 2, 25 * 4),
                new Point(25 * 0, 25 * 4.5),
                new Point(25 * -2, 25 * 4),
                new Point(25 * 3, 25 * 2),
                new Point(25 * 3.5, 25 * 0),
                new Point(25 * 3, 25 * -2),
                new Point(25 * -3, 25 * -2),
                new Point(25 * -3.5, 25 * 0),
                new Point(25 * -3, 25 * 2),
                new Point(25 * 2, 25 * -3),
                new Point(25 * 0, 25 * -3.5),
                new Point(25 * -2, 25 * -3)
                );

        List<Point> cat = List.of(
                new Point(25 * 1, 25 * 2),
                new Point(25 * 0, 25 * 2),
                new Point(25 * 3, 25 * 4),
                new Point(25 * 4, 25 * 2),
                new Point(25 * 4.5, 25 * 0),
                new Point(25 * 4, 25 * -2),
                new Point(25 * 2, 25 * -4),
                new Point(25 * 0, 25 * -4),
                new Point(25 * -2, 25 * -4),
                new Point(25 * -4, 25 * -2),
                new Point(25 * -4.5, 25 * 0),
                new Point(25 * -4, 25 * 2),
                new Point(25 * -3, 25 * 4),
                new Point(25 * -1, 25 * 2)
        );
        Visualiser v1 = new Visualiser(1080, 720, bun, false);
        new Thread(v1).start();

        Visualiser v2 = new Visualiser(1080, 720, cat, true);
        new Thread(v2).start();
    }
}
