import java.io.File;

class Create{

    public static void main(String[] args) {
        File f = new File("/Users/samir/Desktop");
        f.createNewFile("1.txt");
    }
}