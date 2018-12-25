class CopyC {
    int i ; 
    String b;

    CopyC(int a , String name ){
        
    }

    

    CopyC(CopyC obj1){
        i=obj1.i;
        b=obj1.b;

    }
    void display(){
        System.out.println(""+i+""+b);
    }
    public static void main(String[] args) {
        CopyC obj1=new CopyC(5,"Sam");
        CopyC obj2=new CopyC(obj1);
        obj2.i=12;
        obj2.b="Sishir";
        obj1.display();
        obj2.display();
    }





}