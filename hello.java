
import java.applet.*;
import java.awt.*;

public class hello extends Applet {
    Button b1 = new Button("radhe");

    public void init() {
        setLayout(null);  // Use null layout

        b1.setSize(200, 300);  // Set the size explicitly

        // Set the location of the button
        b1.setLocation(200, 100);

        add(b1);
    }
}
/*
  <applet code="hello.class" width="150" height="200"></applet>
 */