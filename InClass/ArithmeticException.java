

class ArithmeticException{
    
    public static void main(String[] args) {
        try{
        int len = args.length;
        if (len <=2){
            throw new ArithmeticException("Error");
        }
    }

        catch(ArithmeticException e){
            System.out.println("Get message =" + e.getMessage());
        }

        System.out.println("See yor");

    }
}

//error due to the java version