    import java.io.File;
    public class DeleteFile {
        /**
         * Utility functions for System.out.println() and System.out.print()
         */
        private static void println(String str) {
            System.out.println(str);
        }
        private static final String fileName = "new.txt"; //file name with path
        public static void main(String args[]) {
            File file = new File(fileName);
            if(file.delete()){
                println("File is deleted successfully.");
            }else{
                println("Not able to delete the file");
            }
        }
    }