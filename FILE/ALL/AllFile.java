import java.io.*;
class ALLFile{

    public static void main(String[] args)throws IOException,FileNotFoundException {
  
        PrintWriter pw = new java.io.PrintWriter("/Users/samir/Desktop/JavaTuts/File/ALL/final.txt");
File loc = new File("/Users/samir/Desktop/JavaTuts/File/ALL/");
File[] contents = loc.listFiles();

for (File obj: contents) {
    String location = "/Users/samir/Desktop/JavaTuts/File/ALL/" + obj.getName() ;

    BufferedReader br = new BufferedReader(new java.io.FileReader(location));
    String line = br.readLine();

    while(line != null){
        pw.println(line);

        line = br.readLine();
    }

    
}

pw.flush();
pw.close();
  
  



    }

}