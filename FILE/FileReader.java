import java.io.* ;


class FileReader {
    public static void main(String[] args) {
        FileReader fr = new FileReader("1.txt");
        int i = fr.read();
        while(i!=-1){
            System.out.println((char )i);
            i=fr.read();


        }
        fr.close();
    }
}