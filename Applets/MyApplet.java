import java.applet.* ;
import java.awt.*;

public class MyApplet extends Applet{

String msg ;
public void init(){
    msg+="Inside init" ;
    System.out.println(msg);
}

public void destroy(){
    msg+="Destroyed";
    System.out.println(msg);
}

public void start(){

}

public void paint (Graphics g){
    g.drawString("Hello How are you", 10, 30);

}



}

