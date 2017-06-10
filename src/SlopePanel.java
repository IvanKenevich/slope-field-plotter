import java.awt.*;
import java.awt.geom.AffineTransform;
import javax.swing.*;

public class SlopePanel extends JPanel {
    private int width, height,
            minX, maxX, minY, maxY;

    public SlopePanel(int width, int height) {
        this.width = width;
        this.height = height;

        minX = Math.round(-width / 2);
        maxX = Math.round(width / 2);
        minY = Math.round(-height / 2);
        maxY = Math.round(height / 2);
    }

    public void drawCoordinateAxes(Graphics2D g) {
        g.drawLine(minX, 0, maxX, 0); // x-axis
        g.drawLine(0, minY, 0, maxY); //y-axis
    }

    public void drawGrid(Graphics2D g, int stepX, int stepY) {
        for (int x = minX; x <= maxX; x += stepX) {
            for (int y = minY; y <= maxY; y += stepY) {
                int slope = (x + y)/8;
                double theta = Math.atan(slope);
                g.drawLine((int)(x - 5*Math.cos(theta)), (int)(y - 5*Math.sin(theta)),
                        (int)(x + 5*Math.cos(theta)), (int)(y + 5*Math.sin(theta)));
            }
        }
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics2D g2 = (Graphics2D) g;
        g2.setTransform(new AffineTransform(1, 0, 0, -1, Math.round(width / 2), Math.round(height / 2)));

        g2.setColor(Color.BLACK);
        drawCoordinateAxes(g2);
        drawGrid(g2, Math.round(width/8),Math.round(height/8));
    }
}
