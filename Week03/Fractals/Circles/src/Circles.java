import javafx.scene.shape.Circle;

import javax.swing.*;
import java.awt.*;

public class Circles extends JComponent {


    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        int x0 = 100;
        int y0 = 100;
        int r = 200;
        int d = 200;
        int depth = 0;

        Graphics2D graphics = (Graphics2D) g;

        drawCircle(graphics, x0, y0, r, d, depth);
    }

    private void drawCircle(Graphics g, int x0, int y0, int r, int d, int depth) {

        if (depth > 4) {
            return;
        } else {
            g.drawOval(x0+r, y0+r, r, d);

            drawCircle(g, (int) (x0 +r- Math.sqrt(2) / 2 * r / 2), (int) (y0+r + Math.sqrt(2) / 2 * r / 2), r / 2, d/2, depth + 1);
            drawCircle(g, (int) (x0 +r), (int) (y0+r + r / 2), r / 2, d/2, depth + 1);
            drawCircle(g, (int) (x0+r + Math.sqrt(2) / 2 * r / 2), (int) (y0+r + Math.sqrt(2) / 2 * r / 2), r / 2, d/2, depth + 1);
        }
    }


    public static void main(String[] args) {
        JFrame frame = new JFrame("fractal");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        Circles main = new Circles();
        main.setPreferredSize(new Dimension(1000, 1000));

        frame.getContentPane().add(main);


        frame.pack();
        frame.setVisible(true);
    }

}