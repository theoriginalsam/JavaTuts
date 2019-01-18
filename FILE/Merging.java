import java.io.*;


class Merging {

    public static void main(String[] args) throws IOException {
        PrintWriter pw = new PrintWriter("/Users/samir/Desktop/JavaTuts/File/file3.txt");
        BufferedReader br = new BufferedReader(new java.io.FileReader("/Users/samir/Desktop/JavaTuts/File/file1.txt"));
        String line = br.readLine();



        while(line != null)
{
    pw.println(line);
    line = br.readLine();
}

br = new BufferedReader(new  java.io.FileReader("/Users/samir/Desktop/JavaTuts/File/file2.txt"));
line = br.readLine();
while(line != null) 
{ 
    pw.println(line); 
    line = br.readLine(); 
} 
pw.flush(); 
          
// closing resources 
br.close(); 
pw.close(); 



    }
    
}