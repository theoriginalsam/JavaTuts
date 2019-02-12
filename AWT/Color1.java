import java.awt.Graphics;
import java.awt.Color;
import java.swing.*;


class Color1 extends JPanel{
     
        
    
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        this.setBackground(COLOR.WHITE);
        g.setColor(new Color(255,53,35));
        g.fillRect(15, 50, 100,20 );
        g.drawString("Current RGB"+g.getColor(),130 , 40);

        
    }



}
public class ShowColors{
    public static void main(String[] args) {
        JFrame frame = new JFrame("Using colors ");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      ColorJPanel ColorJPanel = new ColorJPanel();
      frame.add(ColorJPanel);
      frame.setSize(400,180);
      frame.setVisible(true);
    }
}

