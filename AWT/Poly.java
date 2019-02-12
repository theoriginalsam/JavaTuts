 

import java.awt.*;


import java.applet.Applet;
// <applet code ="Poly" height="300" width="300"></applet> 
public class Poly extends Applet{

    public void paint(Graphics g){

// int [] xValues = {20,40,50,30,20,15};
//      int [] yValues = {50,50,50,80,80,60};
//      Polygon polygon1 = new Polygon(xValues,yValues,6);
//      g.setColor(new Color(0,255,0));
//      g.drawPolygon(polygon1);

     Polygon polygon2 = new Polygon();
     polygon2.addPoint(10,80);
     polygon2.addPoint(10,90);
      polygon2.addPoint(10,40);      
       polygon2.addPoint(90,10);
       polygon2.addPoint(90,90);
       polygon2.addPoint(90,90);
 
       g.fillPolygon(polygon2);


}
}