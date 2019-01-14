import java.io.IOException;

class UseOfThrowS{


    public static void main(String[] args)throws IOException{

       
        try{
throw new IOException("Exception");       //unreported exception IOException because IOExcepiton is a checked exception and it will need the try and catch to catch the exception and to compile to work



}catch(IOException e){
    System.out.println("Error"+e.getMessage());
}   
System.out.println("After the exception");
    }
              //  throw new ArithmeticException("Eroor");    //since AE is unchecked exception so the compiler will not check the unexpected exception so no try and catch is needed and the program will compile 

}
