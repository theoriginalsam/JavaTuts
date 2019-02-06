import java.awt.*;



class Layout extends Frame {

    public Layout(String title )
    {
        super(title);
        setLayout(new BorderLayout());
        add("North",new Button("North"));
        add("South",new Button("South"));
        add("East",new Button("East"));
        add("West",new Button("West"));
        add("Center",new Button("Center"));

    }

    public static void main(String[] args) {
        Layout bld = new Layout("Demo");
        bld.setSize(300,200);
       bld.setVisible(true);
    }

  

    
}