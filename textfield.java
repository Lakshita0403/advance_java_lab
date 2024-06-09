import java.applet.Applet;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class textfield extends Applet implements ActionListener {
    private TextField textField;

    public void init() {
        textField = new TextField("Type here", 20);
        textField.addActionListener(this); // Registering the ActionListener

        add(textField);
    }

    public void actionPerformed(ActionEvent e) {
        // This method is called when the Enter key is pressed in the text field
        String inputText = textField.getText();
        showStatus("Text entered: " + inputText);
    }
}
