import javax.swing.*;
import java.awt.*;

/* 
<applet code="paint.class" width="800" height="800"> </applet>
*/


public class paint extends JApplet {

    @Override
    public void init() {
        // Initialization code, if needed
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        // Drawing squares
        g.drawLine(10, 10, 100, 10);
        g.drawLine(10, 10, 10, 10);
        g.drawLine(10, 100, 100, 100);
        g.drawLine(100, 100, 100, 10);

        // Drawing triangle
        g.drawLine(10, 120, 100, 120);
        g.drawLine(10, 120, 50, 200);
        g.drawLine(50, 200, 100, 120);

        // Drawing Rectangle
        g.drawRect(120, 10, 220, 120);
        g.fillRect(120, 120, 220, 120);

        // Drawing ellipse and circle
        g.drawOval(10, 220, 100, 220);
        g.setColor(Color.yellow);
        g.fillOval(120, 250, 250, 250);

        // Draw a filled arc
        g.fillArc(350, 50, 400, 100, 0, 90);

        // Draw a polygon
        int x[] = {400, 500, 400, 500};
        int y[] = {240, 240, 340, 340};
        g.drawPolygon(x, y, 4);
    }
}
