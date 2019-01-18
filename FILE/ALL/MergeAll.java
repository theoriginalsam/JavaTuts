import java.io.*;
class MergeAll{
    public static void main(String[] args) throws IOException {
        File f = new File("/Users/samir/Desktop/JavaTuts/File/ALL/");

     

        PrintWriter pw = new PrintWriter("/Users/samir/Desktop/JavaTuts/File/ALL/final.txt");

        String[] s = f.list();
       

        for (String s1 : s) {
            File f1 = new File(f, s1);
            BufferedReader br = new BufferedReader(new FileReader(f1));

            String line = "";
            while ((line = br.readLine()) != null) {
               
                pw.println(line);
            }
        }
        pw.flush();
        pw.close();
    }
}
