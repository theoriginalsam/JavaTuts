import java.awt.*;
import java.applet.Applet;



// <applet code ="ColorDemo" height="300" width="300"></applet>  

public class ColorDemo extends Applet{


 

 public void paint(Graphics g){
     g.setColor(new Color(255,0,0));

     g.drawString("Hello", 23,23);
g.setColor(new Color(0,255,0));
     g.drawString("GCES", 23,43);
     g.setColor(new Color(0,255,0));
     g.fillRect(200, 250, 100, 100);
 }
}