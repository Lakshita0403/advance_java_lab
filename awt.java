

import java.awt.*;
  public class awt extends Frame 
{
awt()
{
Button b=new Button("Click me");
b.setBounds(30, 100, 800, 30);
add(b);
setSize(700,600);
setLayout(null);
setVisible(true);
}
public static void main(String ar[])
{
awt f=new awt();
}
}


