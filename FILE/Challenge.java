import java.io.*;


// WAP to Create file , show files and folders and count files and folders of given destination.
// Be sure that to take two arguments through command line . First argument should be location and
// second one should be -c for creating , -s to show and -co to count.



    class Challenge {
    public static void main(String[] args) throws ArrayIndexOutOfBoundsException  {
    String loc = "/Users/samir/Desktop" + args[0];

    if (args[1].equals("-c")){

         try{
            File file = new File(loc);
                if(file.createNewFile()){
                 System.out.println("File is m=now creted");
                }

                else{
                 System.err.println("failed to create the file : Try again later with a better judgement of your code");

                 
            }

            }
            catch(IOException e){
                System.out.println("Error "+e);
            }
            
        }

        else if (args[1].equals("-s")){
          
               File file = new File(loc);
            File[] list = file.listFiles();

            for (int z = 0;z < list.length;z++) {
              if (list[z].isFile()) {
                System.out.println("It is a file and name is " + list[z].getName());
              } else if (list[z].isDirectory()) {
                System.out.println("It is a directory and name is " + list[z].getName());
              }
            }

        
   



        }

        else if (args[1].equals("-co")){
            
            File file = new File(loc);
            File[] list = file.listFiles();

            int count = list.length;
            System.out.println("Total folder and files are "+count);
        
     
        }
        else {
            System.out.println("Sorry worng Command");
        }
    
        
}
}
    
    
    
   