import java.awt.*;
import javax.swing.*;
/**
 * Write a description of class Driver here.
 * 
 * @author (your name) n
 * @version (a version number or a date)
 */
public class Driver
{
    public static void main(String[] args)
    {
        JFrame f = new JFrame("Slope Field");
        SlopePanel p = new SlopePanel();
        
        f.add(p);
        f.setSize(760,760);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
