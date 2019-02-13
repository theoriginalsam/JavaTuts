import java.awt.*;

    import java.awt.event.*;

     public class Frame1  {

         public static void main(String[] args) 
             
         {

             Frame frame = new Frame("CLose");
             Label lbl = new Label("Testing clpse oop");
             frame.add(lbl) ;
             frame.setSize(300,300);
             frame.setVisible(true);
             frame.addWindowListener(new WindowAdapter(){
                 public void windowClosing(WindowEvent we ){
                     System.exit(0);
                     
                 }
             });
             

         }
     }