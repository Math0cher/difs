import javax.swing.*;
import java.awt.*;
import java.util.List;
import java.util.function.BinaryOperator;

public class Visualiser extends JFrame implements Runnable {
    private static final double COEF = 0.05;
    private static final int RELOAD_TIME = 200;
    private static final int POINT_RADIUS = 5;

    private final int width;
    private final int height;
    private final List<Point> points;

    private final boolean cat;


    public Visualiser(int width, int height, List<Point> points, boolean cat) {
        this.width = width;
        this.height = height;
        this.points = points;
        this.setSize(width, height);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.cat = cat;
    }

    @Override
    public void run() {
        while (true) {
            repaint();
            transform();
            try {
                Thread.sleep(RELOAD_TIME);
            } catch (InterruptedException ignored) {

            }
        }
    }

    private void transform() {
        for (Point point : points) {
            if (cat) {
                point.x += point.x * COEF;
                point.y -= point.y * COEF;
            } else {
                point.x += baking(point, true) * COEF;
                point.y += baking(point, false) * COEF;
            }
        }
    }

    private double baking(Point point, boolean x) {
        double coord = (x ? point.x : point.y);
        return (coord * 200/Math.sqrt(point.x * point.x  + point.y * point.y)
                - coord);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.BLACK);
        for (Point point : points) {
            g.fillOval((int) point.x + width / 2,
                    (int) -point.y + height / 2,
                    POINT_RADIUS, POINT_RADIUS);
        }
    }
}
