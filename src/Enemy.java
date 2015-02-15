import javax.swing.JFrame;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import javax.swing.JComponent;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.Color;
import java.awt.Polygon;



public class Program1 {
    public static void main(String[] args) {

        // contruction of new JFrame object
        JFrame frame = new JFrame();

        // set the window size and title
        frame.setSize(300,400);
        frame.setTitle("My beautiful picture");

        // program ends when window closes
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.add(new DrawingArea());
        
        // voila!
        frame.setVisible(true);
    }


    // define the thing that draws
    public static class DrawingArea extends JComponent
    {
        public void paintComponent(Graphics g)
        {
            Graphics2D g2 = (Graphics2D) g;
            

            // CREATE OBJECTS AND DRAW THEM, HERE
            Ellipse2D.Double e = new Ellipse2D.Double(95, 115, 35, 35);
            g2.fill(e);
            

            

        }

        
        
    }
}