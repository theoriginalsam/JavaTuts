import java.awt.*;  
public class MenuExample  
{  
     MenuExample(){  
         Frame f= new Frame("Menu and MenuItem Example");  
         MenuBar mb=new MenuBar();  



         //Adding First menu
         Menu menu=new Menu("File");  
    
         MenuItem i1=new MenuItem("New");  
         MenuItem i2=new MenuItem("Open");  
         MenuItem i3=new MenuItem("Save");  
         MenuItem i4=new MenuItem("Save As");  
         MenuItem i5=new MenuItem("Exit");  
         menu.add(i1);  
         menu.add(i2);  
         menu.add(i3);  
         menu.add(i4);  
         menu.add(i5);  
       
         mb.add(menu);  
   

         //Adding second menu
         Menu menu1=new Menu("View");  

         //Adding sub menu
         Menu submenu1=new Menu("Font"); 
         Menu submenu2=new Menu("Sort"); 
         Menu submenu3=new Menu("Thumb");  
      //submenu items
         MenuItem j1=new MenuItem("Underline");  
         MenuItem j2=new MenuItem("Normal");  
         MenuItem j3=new MenuItem("Italic"); 
         MenuItem j4=new MenuItem("Bold");  


         MenuItem k1=new MenuItem("Size");  
         MenuItem k2=new MenuItem("Type");  
         MenuItem k3=new MenuItem("Date"); 
         MenuItem k4=new MenuItem("Name");  



         MenuItem l1=new MenuItem("Small");  
         MenuItem l2=new MenuItem("Medium");  
         MenuItem l3=new MenuItem("Large"); 
         
        //  menu1.add(submenu1);  
        //  menu1.add(submenu2);  
        //  menu1.add(submenu3);
         
         
         submenu1.add(j1);
         submenu1.add(j2);
         submenu1.add(j3);
         submenu1.add(j4);



         submenu2.add(k1);
         submenu2.add(k2);
         submenu2.add(k3);
         submenu2.add(k4);




         submenu3.add(l1);
         submenu3.add(l2);
         submenu3.add(l3);


       


         mb.add(menu1);
         menu1.add(submenu1);
         menu1.add(submenu2);
         menu1.add(submenu3);

         Menu menu3 = new Menu("Help");
         MenuItem m1= new MenuItem("Check Online");

         
         mb.add(menu3); 
         menu3.add(m1);

         f.setMenuBar(mb);  
         f.setSize(400,400);  
         f.setLayout(null);  
         f.setVisible(true);  
       




         
}  
public static void main(String args[])  
{  
new MenuExample();  
}  
}  