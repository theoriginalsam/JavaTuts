

class NestCatch{

    public static void main(String[] args) {

        System.out.println(args[1]);
        try{
            int a =args.length;
            int b =42/a;
            System.out.println("A "+a);
            try{
                if (a==1){
                    a=a/(a-a);

                }
            }

                catch(ArrayIndexOutOfBoundsException e){
                    System.out.println("ARRAY OUT OF BOUND"+e);
                }

            

        
    }
    catch(ArithmeticException e){
        System.out.println("DIvided by 0"+e);
    }
    
}
    
}