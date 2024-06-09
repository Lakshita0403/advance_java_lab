import java.applet.*;
import java.awt.*;

public class choice extends Applet {
    Choice ch = new Choice();

    public void init() {
        ch.addItem("Radha");
        ch.addItem("Krishna");
        ch.setSize(200, 300);  // Set the size explicitly
        add(ch);

    }
}
/* <applet code="choice.class" width="300" height="300"></applet> */
