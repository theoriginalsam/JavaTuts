import java.applet.* ;
import java.awt.*;





public class Applet3 extends Applet{

    String fontName ;
    int fontSize ;
    float leading ;
    boolean active;
    Font myFont = new Font(fontName, Font.BOLD, 18);
    // Color c = new Color(140,140,120);

   
    public void start(){
        String param ;
      param=getParameter("fontName");
        try{
            if(param!=null){
                fontName= param ;
            }
                else 
                    fontName = "Arial";
                
            
        }
        catch(NumberFormatException e){
            fontName = "";
        }

        param=getParameter("Size");
        try{
            if(param!=null){
                fontSize= Integer.parseInt(param);
            }
                else 
                    fontSize = 0;
                
            
        }
        catch(NumberFormatException e){
            fontSize = -1;
        }

        param=getParameter("leading");

        try{
            if(param!=null)
            leading = Float.valueOf(param).floatValue();
            else
            leading= 0;

        }
        catch(NumberFormatException e){
            leading=-1;
        }
        param=getParameter("acc enabled");
        if(param!=null)
        active = Boolean.valueOf(param).booleanValue();



    }
      


    

    public void paint(Graphics g){
        g.drawString( "Name", 50, 200);
        g.drawString("Size", 50,220 );
        g.drawString("leading", 50, 240);
        g.drawString("Active", 50, 260);
g.setFont(myFont);
g.setColor(Color.orange);

        g.drawString(""+fontName, 100, 200);
        g.drawString(""+fontSize, 100,220 );
        g.drawString(""+leading, 100, 240);
        g.drawString(""+active, 100, 260);

    }


}