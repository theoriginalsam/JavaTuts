import java.awt.*;



class Layout extends Frame {

    public Layout(String title )
    {
        super(title);
        setLayout(new GridLayout(2,3));
        
        add(new Button("1"));
        add(new Button("2"));
        add(new Button("3"));
        add(new Button("4"));
        add(new Button("5"));
        add(new Button("6"));

    }

    public static void main(String[] args) {
        Layout bld = new Layout("Demo");
        bld.setSize(300,200);
       bld.setVisible(true);
    }

  

    
}