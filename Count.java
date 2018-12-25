import java.util.Scanner;

class Count{

    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the sentence");
        int space=0;
        int unicode=0;
        int index;
String sent;

         sent=obj.nextLine();

        index=sent.length()-1;
        while(index>=0){
            unicode=sent.codePointAt(index);
            


            if(unicode==32){
                space++;
            }
            index--;
        }
        System.out.println("Spaces are "+ space);
      




        
    }
} 