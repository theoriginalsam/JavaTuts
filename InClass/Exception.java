class Exception {

    public static void main(String[] args) {
        int d,a;
        try{
            d=0;
            a=42/d;

            System.out.println("THis is nor=t possible");

        }
        catch(Exception e){
            System.out.println("not divisible by zero");
        }

        System.out.println("After catch");

    }
    
}