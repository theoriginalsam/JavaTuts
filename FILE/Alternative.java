import java.io.*;

class FileCombo{
public static void main(String[] args) throws IOException {
    PrintWriter pw = new PrintWriter ("file3.txt");
    BufferedWriter br = new BufferedWriter(new FileReader("file1.txt"));
    BufferedWriter br1 = new BufferedWriter(new FileReader("file2.txt"));
    String line = br.readLine();
    String line1 = br1.readLine();

    while(line !=null || line1!= null){
        pw.write(line);
        pw.write(line1);
        line=br.readLine();
        line1=br1.readLine();
    }
 
    
        pw.flush();

        pw.close();
        br.close();
        br.close();
}
}