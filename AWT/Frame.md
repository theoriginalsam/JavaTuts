Closable Frame 

 - It is possible to impletment the close button of any frame or window in java application.
 - By default the close button of frame is not functionnig 
 - The close button has to be set.

  * Program for creating closable frame .

        import java.awt.*;

            import java.awt.event.*;

            public class FrameCloseDemo {

                psv main(){

                    Frame frame = new Frame("CLose");
                    Label lbl = new Label("Testing clpse oop");
                    frame.add(lbl) ;
                    frame.setSize(300,0300);
                    frame.setVisible(true);
                    frame.addWindowListener(new WindowAdapter(){
                        public void windowClosing(WindowEvent we ){
                            System.exit(0);

                        }
                    });
                    

                }
            }