
import java.applet.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class text extends Applet implements ActionListener{
    button b1;
    textfield tf;
    public void init()
    {
        tf = new textField();
        tf.setbounds(30, 40, 500, 800);
        b1 = new button("click");
        b1.setBounds(90, 100, 100, 100);
        add(b1);
        add(tf);
        b1.addActionListener(this);
        setLayout(null);
    }

    public void actionPerformed(ActionEvent e)
    {
        tf.setText("Hello ji ");
    }
}



