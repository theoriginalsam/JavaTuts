import java.awt.*;

import java.applet.Applet;

public class TextAreaDemo extends Applet implements TextListener{
TextArea echo , echo2 ;
void init(){
    
echo =new TextArea(2,40);
echo2 = new TextArea(2,40);

LayoutManager layout = new FlowLayout();
setLayout(layout);
echo.addTextListener(this);
echo2.setEditable(false);
add(echo);
add(echo2);
echo.setText("Enter the name");


}
public void textValueChanged(TextEvent e){
    String Entry1 = echo.getText();
    echo2.setText(Entry1);
}
  }