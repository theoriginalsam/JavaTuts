import java.io.*;

class CountOnDesktop{

    public static void main(String[] args) {
        int count =0;
        File Contents = new File("/Users/samir/Desktop");
        File[] lists= Contents.listFiles();

        for (int z = 0;z < lists.length;z++){
            if(lists[z].isFile()){
                count ++;

            }
           
        }
        System.out.println("Total files are: "+count);
    }
    
}