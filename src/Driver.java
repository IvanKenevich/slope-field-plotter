import javax.swing.*;
import java.awt.*;

public class Driver
{
    public static void main(String[] args)
    {
        JFrame f = new JFrame("Slope Field");
        f.setSize(Toolkit.getDefaultToolkit().getScreenSize());
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Insets i = f.getInsets();
        f.add(new SlopePanel(f.getWidth() - i.right - i.left,f.getHeight() - i.top - i.bottom));
        f.setVisible(true);
    }
}
