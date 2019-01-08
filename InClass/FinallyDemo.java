class FinallyDemo{
static void finallyOne(){
    int b =0;
    try{
        int a =2/b;
        return ;

    }

    catch(ArithmeticException e){
        System.out.println("Nailed it bro");
        System.out.println("Cannot be divided by 0");
        
    }
    finally{
    System.out.println("Have a good time");
    }
}

public static void main(String[] args) {
    finallyOne();
    
}
}
