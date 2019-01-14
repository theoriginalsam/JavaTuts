><h1>File writer </h1>

# Constructor 
 1. Filewriter fw = new FileWriter(String name) ;

 2. FileWriter fw = new File Writer (File f);
 3. FileWriter fw = new FileWriter (String name ,boolean append);
 4. FileWriter fw = new FileWriter(file f , boolean append );

 Note : if no file available , this will create the file.


 >**Methods**

 1. write (int ch)
   - to write a single character to the file ;
      fw.write(100);
      fw.write('d');

      2 write (char [] ch);
      3. write (String s);
      4 flush()
      --to gurantee our data including last char also is written property.
      5 Close()