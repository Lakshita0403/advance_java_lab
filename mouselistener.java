import java.awt.*;
import java.awt.event.*;

public class mouselistener extends Frame implements MouseListener {
    public mouselistener() {
        // Set the title of the frame
        setTitle("Mouse Listener Example");

        // Set the size of the frame
        setSize(300, 200);

        // Add the MouseListener to the frame
        addMouseListener(this);

        // Set default close operation
        // setDefaultCloseOperationJ(Frame.EXIT_ON_CLOSE);

        
    }

    public void mouseClicked(MouseEvent e) {
        System.out.println("Mouse Clicked at: " + e.getX() + ", " + e.getY());
    }

    public void mousePressed(MouseEvent e) {
        System.out.println("Mouse Pressed at: " + e.getX() + ", " + e.getY());
    }

    public void mouseReleased(MouseEvent e) {
        System.out.println("Mouse Released at: " + e.getX() + ", " + e.getY());
    }

    public void mouseEntered(MouseEvent e) {
        System.out.println("Mouse Entered");
    }

    public void mouseExited(MouseEvent e) {
        System.out.println("Mouse Exited");
    }

    public static void main(String[] args) {
        // Create an instance of the MouseListenerExample class
        mouselistener frame = new mouselistener();

        // Set the frame to be visible
        frame.setVisible(true);
    }
}
