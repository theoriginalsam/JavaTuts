
import java.util.*;
import java.applet.Applet ;
import java.awt.*;
import java.awt.Event;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


/* <applet code = "ADD" width = "300" height ="300"></applet>  */

public class ADD extends Applet {
    Label l1 , l2,l3 ;
    TextField t1 , t2 ;
    Button b1 ;
    public void init (){

        
        l1 = new Label("!st num");
        l2= new Label("2nd Num");
        t1 = new TextField();
        t2= new TextField();
        l3=new Label("");
        b1 = new Button("Add");
        setLayout(null);
        l1.setBounds(100,150,80,20);
        t1.setBounds(100,180,80,20);
        l2.setBounds(200,150,80,20);
        t2.setBounds(200,180,80,20);
        b1.setBounds(150,200,80,20);
        l3.setBounds(150,250,80,20);
    add(l1);

    add(t1);
    add(l2);
    add(t2);
    add(b1);
    add(l3);
    b1.addActionListener(new MySum());

}
public class MySum implements ActionListener{
public void actionPerformed(ActionEvent e){
    int a = Integer.parseInt(t1.getText());
    int b = Integer.parseInt(t2.getText());
    int s = a+b ;
    l3.setText("Sum is "+s);
}
}
        

}