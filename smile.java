import java.awt.*;

public class smile extends Frame {
    public smile() {
        setTitle("Smiley Face");
        setSize(500, 400);
        setVisible(true);
        setBackground(Color.white);
    }

    public void paint(Graphics g) {
        // Draw face
        g.setColor(Color.yellow);
        g.fillOval(100, 100, 200, 200);

        // Draw eyes
        g.setColor(Color.black);
        g.fillOval(150, 150, 20, 20);
        g.fillOval(230, 150, 20, 20);

        // Draw mouth
        g.drawArc(150, 180, 100, 80, 0, -180);
    }

    public static void main(String[] args) {
        new smile();
    }
}
