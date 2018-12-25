class A {
    A(){
        System.out.println("Inside A");
    }
}
class B extends A {
    B(){
        System.out.println("Inside B");
    }
}
class C extends A {
    C(){
        System.out.println("Inside C");
    }
}
class D extends A {
    D(){
        System.out.println("Inside D");

    }

}

class OrderDerivation{

    
    public static void main(String[] args) {
        D obj=new D();
    }
}