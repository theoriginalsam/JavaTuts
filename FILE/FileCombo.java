import java.io.*;

class FileCombo{
public static void main(String[] args) throws IOException {
    PrintWriter pw = new PrintWriter ("file3.txt");
    BufferedWriter br = new BufferedWriter(new FileReader("file1.txt"));
    String line = br.readLine();
    while(line !=null){
        pw.write(line);
        line=br.readLine();
    }
    br = new BufferedWriter(new FileReader("file2.txt"));
    line = br.readLine();
    while(line != null){
        pw.write(line );
        line = br.readLine();
    }
        pw.flush();
        pw.close();
        br.close();
        
    
}

    
}