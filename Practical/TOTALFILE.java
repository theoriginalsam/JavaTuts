import java.io.*;

class TOTALFILE{
    public static void main(String[] args) {
        
    
    File contents = new File("/Users/samir/Desktop/JavaTuts");
File[] list = contents.listFiles();

for (int z = 0;z < list.length;z++) {
  if (list[z].isFile()) {
    System.out.println("It is a file and name is " + list[z].getName());
  } else if (list[z].isDirectory()) {
    System.out.println("It is a directory and name is " + list[z].getName());
  }
}
    }
}
