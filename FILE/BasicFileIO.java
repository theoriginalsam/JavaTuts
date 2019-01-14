import java.io.*;
import java.util.Scanner;


class BasicFileIO{

    public static void main(String[] args) {
        

        File file = new File("one.txt");
try{           //Exception may arise so we should include the try catch.
        PrintWriter out = new PrintWriter(file);
        out.println("Samir");
        out.println(29);
        out.close();
    }
    catch(IOException e){
        System.out.println("Error is :"+e);

    }
try{      ///Readding to the file 
    Scanner file1 = new Scanner ( file );
    String name = file1.nextLine();
    int age = file1.nextInt();
    file1.close();
    System.out.println("Name is "+ name );
    System.out.println("age is "+age);
}
catch(FileNotFoundException ex){     //Catching the exception and the displaying
    System.out.println(ex.getMessage());
}



}


    
}