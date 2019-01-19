import java.io.*;


class CountWords{
    

    public static void main(String[] args)throws IOException {
        PrintWriter pw = new PrintWriter("one.txt");
    

        BufferedWriter bw = new BufferedWriter(new java.io.FileWriter("one.txt"));
        String line  = bw.readLine();
        while((line)!= null){
            pw.print(line);
            line = bw.readLine();
        }
pw.flush();
bw.close();
        pw.close();
        


      
       
    }
}