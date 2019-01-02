interface Shape{
     void area();
     double length=5;   //final is default here so it should be initialzed 

     default void init(){
         System.out.println("Init shape");
     }
    
}