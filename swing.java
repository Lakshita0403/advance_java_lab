 import javax.swing.*;
 import java.awt.Font;




public class swing {
    public static void main(String[] args) {
        // Create a JFrame
        JFrame frame = new JFrame("Simple Swing Example");

        // Create a JLabel
        JLabel label = new JLabel("Hello, Swing!");

        // Increase the font size
        Font labelFont = label.getFont();
        label.setFont(new Font(labelFont.getName(), Font.PLAIN, 45));


        // Add the JLabel to the JFrame
        frame.getContentPane().add(label);

        // Set default close operation
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Set the size of the JFrame
        frame.setSize(150, 200);

        // Set the JFrame to be visible
        frame.setVisible(true);
    }
}
 
