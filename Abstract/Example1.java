abstract class Name{
    String name;
    int rollNo;
    Name(String user , int roll){
        name = user;
        rollNo=roll;

    }
    abstract int  prinT();

    
    
}

class Me extends Name{
    Me(String nam , int roll){
        super(nam,roll);      //parent access
    }
    int  prinT(){
        System.out.println(" My name is "+name+" and roll is "+rollNo);
        return 0;
    }
    
}

class Example1{
    public static void main(String[] args) {
        
    
    Me obj = new Me("Samir",29);
    obj.prinT();
  Name ref;
    ref=obj;
    System.out.println("2 nd function called " + ref.prinT());
    }

}