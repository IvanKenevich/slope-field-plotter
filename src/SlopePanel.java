import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.Timer;
/**
 * Write a description of class Panel here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SlopePanel extends JPanel implements ActionListener
{
    
    int vx,vy,dx,dy,expr,offset,increment;
    int r;
    Timer t;
    
    public SlopePanel()
    {
        vx=0;
        dx=0;
        vy=0;
        dy=0;
        r=5;
        offset=0;
        increment=1;
        t = new Timer(40,this);
        t.start();
    }
    
    public void drawLines(Graphics g)
    {
        g.setColor(Color.black);
        for (int i = -19; i<19; i++)
        {
            for (int j = -19; j<=19; j++)
            {
               expr=i*j+offset;

               dx=1;
               dy=dx*expr;
               g.drawLine(2*i*10-dx,2*j*10-dy,2*i*10+dx,2*j*10+dy);
            }
        }
    }
    
    public void actionPerformed (ActionEvent e)
    {
        if (offset==20 || offset==-20)
        {increment=-increment;}
        offset+=increment;
        expr+=offset;
        repaint();
    }
    
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        
        g.translate(380,380);
              
        
        g.drawLine(-380,0,380,0);
        g.drawLine(0,380,0,-380);
        drawLines(g);
    }
}
