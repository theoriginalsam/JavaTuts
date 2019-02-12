import java.awt.*;


import java.applet.Applet;



// <applet code ="ColorDemo" height="300" width="300"></applet>  

public class ColorDemo extends Applet{


 

 public void paint(Graphics g){

    

     g.setColor(new Color(255,0,0));
   g.setFont(new Font("Serif",Font.BOLD+Font.ITALIC,50));

// FontMetrics f1 ;
// f1 = getFontMetrics(new Font("Serif",Font.BOLD+Font.ITALIC,50));
// g.drawString("Ascent Vlaue "+f1.getAscent(),20 , 30);
// g.drawString("Ascent Vlaue "+f1.getDescent(),20 , 50);
// g.drawString("Ascent Vlaue "+f1.getLeading(),20 , 70);


    
 
    
   

//      g.drawString("Hello", 23,23);
// g.setColor(new Color(0,255,0));
    //  g.drawString("GCES", 23,43);
    //  g.setColor(new Color(0,255,0));
     g.fillRect(200, 250, 100, 100);

     g.drawLine(80, 10, 80, 10);
  g.drawArc(0, 0  ,80, 80, 0, -70);
     g.drawLine(10, 10, 10, 80);
  g.drawArc(0, 0  ,80, 80, 0, 70);
     g.drawLine(10, 80, 80, 80);
     g.drawLine(80, 10, 80, 80);


     int [] xValues = {20,40,50,30,20,15};
     int [] yValues = {50,50,50,80,80,60};
     Polygon polygon1 = new Polygon(xValues,yValues,60);
     g.setColor(new Color(0,255,0));
     g.drawPolygon(polygon1);

     Polygon polygon2 = new Polygon();
     polygon2.addPoint(165,135);
     polygon2.addPoint(205,185);
      polygon2.addPoint(295,260);
       polygon2.addPoint(350,120);
       polygon2.addPoint(450,220);
       polygon2.addPoint(550,320);
 
       g.fillPolygon(polygon2);

 


 }
}