
import java.io.*;

import java.util.Scanner;

class FileWriter{

    public static void main(String[] args){
    //   FileWriter fw = new FileWriter("samir.txt");
    //   fw.write(100);
    //   fw.write("abc \n software ");
    //   fw.write("ln");
    //   char[] ch = {'a','b','c'};
    //   fw.write(ch);
    //   fw.write("\n");
    //   fw.flush();
    //   fw.close();

      File file2 = new File("1.txt");
      try{
      PrintWriter out = new PrintWriter(file2);
      out.println("Samir");
      out.println("Legend");
      out.close();
      }
      catch(IOException e){
          System.out.println("Error");
      }
try{
      Scanner scan = new Scanner(file2);
      String name = scan.next();
      String name1 = scan.next();
scan.close();
System.out.println("Name is "+name);
System.out.println("Legend"+name1);
}

catch(FileNotFoundException e){
    System.out.println("Error");
}





        

    }
}