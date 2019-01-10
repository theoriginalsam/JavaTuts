class Animal {
    public void eat(){

      System.out.println("I eat grass");

    }

}

class Man extends Animal{

    public void eat(){
        super.eat();
       
       

    }


}
public class Inherit{
    public static void main(String[] args) {
       Man obj=new Man();
        Man samman=new Man();

        obj.eat();
        samman.eat();
        
        
    }
}