class ThrowDemo 
{
    public static void main(String[] args) {

     System.out.println("Example of throw keyword: ");
try{
     throw new ArithmeticException("Divide by zero explicitely");

    //  int  a =5;
    //  int c=a/0;
}
catch(ArithmeticException e){
    System.out.println(e);
    System.out.println("Get messege="+ e.getMessage()

    );
}

    }
}