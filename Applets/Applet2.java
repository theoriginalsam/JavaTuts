import java.applet.* ;
import java.awt.*;

public class Applet2 extends Applet{

String msg ;
public void init(){
   // msg+="Inside init" ;
    System.out.println("Initialized");
}
public void stop(){
   // msg+="Minimized";
    System.out.println("Mini");
    
}

public void destroy(){
   // msg+="Destroyed";
    System.out.println("Stopped");
}

public void start(){

}

public void paint (Graphics g){
    g.drawString("Testing ", 10, 30);

}



}

