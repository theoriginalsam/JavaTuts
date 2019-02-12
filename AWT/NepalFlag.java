
import java.awt.*;
import java.applet.Applet;
import java.awt.event.*;

// <applet code ="NepalFlag" height="700" width="700"></applet> 



public class NepalFlag extends Applet implements MouseListener, MouseMotionListener{


    int x, y;
  String str="";
  public void init()
  {
    addMouseListener(this);
    addMouseMotionListener(this);
  }
                                  
  public void mousePressed(MouseEvent e)
  {
    x = e.getX();
    y = e.getY();
    str = "Mouse Pressed";
    repaint();
  }
  public void mouseReleased(MouseEvent e)
  {
    x = e.getX();
    y = e.getY();
    str = "Mouse Released";
    repaint();
   }
   public void mouseClicked(MouseEvent e)
   {
     x = e.getX();
     y = e.getY();
     str = "Mouse Clicked";
     repaint();
   }
   public void mouseEntered(MouseEvent e)
   {
     x = e.getX();
     y = e.getY();
     str = "Mouse Entered";
     repaint();
   }
   public void mouseExited(MouseEvent e)
   {
     x = e.getX();
     y = e.getY();
     str = "Mouse Exited";
     repaint();
   }
                                    // override two abstract methods of MouseMotionListener
   public void mouseMoved(MouseEvent e)
   {
     x = e.getX();
     y = e.getY();
     str = "Mouse Moved";
     repaint();
   }
   public void mouseDragged(MouseEvent e)
   {
     x = e.getX();
     y = e.getY();
     str = "Mouse dragged";
     repaint();
   }
                                    // called by repaint() method


public void paint(Graphics f){
    int [] xValuesR = {50,50,305,135,300,50,50};
    int [] yValuesR = {25,330,330,164,164,15,20};
    Polygon p2 = new Polygon(xValuesR,yValuesR,6);
    f.setColor(new Color(209,8,44));
   f.drawPolygon(p2);
   f.fillPolygon(p2);
    //Blue Horizontal

    int [] xValuesH = {50,50,305,135,300,50,50,288,125,295,55,55};
    int [] yValuesH = {25,330,330,164,164,15,20,160,160,325,325,20};
    Polygon p1 = new Polygon(xValuesH,yValuesH,12);
    f.setColor(new Color(4,34,130));
   f.drawPolygon(p1);
   f.fillPolygon(p1);
   f.setColor(new Color(255,255,255));

   f.drawArc(80,110,50,40,0,-180);



   //Mouse
    f.setFont(new Font("Monospaced", Font.BOLD, 20));
    f.fillOval(x, y, 10, 10);
    f.drawString(x + "," + y,  x+10, y -10);
    f.drawString(str, x+10, y+20);
    showStatus(str + " at " + x + "," + y);


 



    // int [] xValuesH = {50,50,55,55};
    //      int [] yValuesH = {20,330,330,20};
    //      Polygon p1 = new Polygon(xValuesH,yValuesH,4);
    //      f.setColor(new Color(0,0,255));
    //     f.drawPolygon(p1);
    //     f.fillPolygon(p1);


    //     int [] xValuesV = {50,300,300,50};
    //     int [] yValuesV = {330,330,325,325};
    //     Polygon p2 = new Polygon(xValuesV,yValuesV,4);
    //     f.setColor(new Color(0,0,255));
    //    f.drawPolygon(p2);
    //    f.fillPolygon(p2);


    //    int [] xValuesVa = {305,300,130,135};
    //    int [] yValuesVa = {330,330,160,160};
    //    Polygon p3 = new Polygon(xValuesVa,yValuesVa,4);
    //    f.setColor(new Color(0,0,255));
    //   f.drawPolygon(p3);
    //   f.fillPolygon(p3);



    //   int [] xValuesVb = {130,295, 300, 135};
    //   int [] yValuesVb = {160,160,165,165};
    //   Polygon p4 = new Polygon(xValuesVb,yValuesVb,4);
    //   f.setColor(new Color(0,0,255));
    //  f.drawPolygon(p4);
    //  f.fillPolygon(p4);


    //  int [] xValuesVc = {50,50,305,300};
    //  int [] yValuesVc = {20,15,165,165};
    //  Polygon p5 = new Polygon(xValuesVc,yValuesVc,4);
    //  f.setColor(new Color(0,0,255));
    // f.drawPolygon(p5);
    // f.fillPolygon(p5);


        // Polygon gon2 = new Polygon();
        // gon2.addPoint(10,80);
        // gon2.addPoint(10,90);
        //  gon2.addPoint(10,40);      
        //   gon2.addPoint(90,10);
        //   gon2.addPoint(90,90);
        //   gon2.addPoint(90,90);
    
        //   f.fillPolygon(gon2);

}


}