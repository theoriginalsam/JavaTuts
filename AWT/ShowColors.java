import java.awt.Graphics;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JFrame;


class Color1 extends JPanel{
     
        
    
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        this.setBackground(Color.WHITE);
        g.setColor(new Color(255,53,35));
        g.fillRect(15, 50, 100,20 );
        g.drawString("Current RGB"+g.getColor(),130 , 40);

        
    }



}
public class ShowColors{
    public static void main(String[] args) {
        JFrame frame = new JFrame("Using colors ");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      Color1 colorJPanel = new Color1();
      frame.add(colorJPanel);
      frame.setSize(400,180);
      frame.setVisible(true);
    }
}

