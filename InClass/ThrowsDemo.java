class ThrowsDemo{
    static void  throw1() throws IllegalAccessException{
        
        System.out.println("Inside throw");
        //throw new ArithmeticException() ;
throw new IllegalAccessException() ;
    }
    public static void main(String[] args) {
        try{
        throw1();
        }

        catch(IllegalAccessException e){
            System.out.println("HAHA YOu nailed it");

        
        }
    }

}