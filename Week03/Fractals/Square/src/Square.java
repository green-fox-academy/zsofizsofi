
import javax.swing.*;
import java.awt.*;

public class Square extends JComponent {

    //private static int MAX_DEPTH = 4;

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        int x0 = 400;
        int y0 = 400;
        int width = 300;
        int depth = 0;

        drawTriangle(g, x0, y0, width, depth);

    }


    private void drawTriangle(Graphics g, int x0, int y0, int width, int depth) {
        int x[] = {x0 - width / 2, x0 + width / 2, x0};
        int y[] = {(int) (y0 - Math.sqrt(3) / 2 * width * 1 / 3), (int) (y0 - Math.sqrt(3) / 2 * width * 1 / 3), (int) (y0 + Math.sqrt(3) / 2 * width * 2 / 3)};


        if (depth > 7) {
            return;
        } else {
            g.drawPolygon(x, y, 3);
            //meghívni a g.drawPolygon fv-t
            drawTriangle(g, x0, (int) (y0 - Math.sqrt(3) / 2 * width * 1 / 3 - Math.sqrt(3) / 2 * 2 / 3 * width / 2), width / 2, depth + 1);
            drawTriangle(g, (int) (x0 - width / 2), (int) (y0 + Math.sqrt(3) / 6 * width), width / 2, depth + 1);
            drawTriangle(g, (int) (x0 + width / 2), (int) (y0 + Math.sqrt(3) / 6 * width), width / 2, depth + 1);
        }
    }


    public static void main(String[] args) {
        JFrame frame = new JFrame("fractal");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        Square main = new Square();
        main.setPreferredSize(new Dimension(1000, 1000));

        frame.getContentPane().add(main);


        frame.pack();
        frame.setVisible(true);
    }
}

