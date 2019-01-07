import java.util.*;




class WhileEvent{


    pubslic static void main(String[] args) {
       
        Scanner obj = new Scanner(System.in);
        String name="";
        int count =0;
        while(! name.equals("Samir") ){
            System.out.println("enter the password");

           
            name=obj.nextLine();
            if(name.equals("Samir"))
                System.out.println("Correct");
            

            

            else{
                System.out.println("Try again");

            }

            count++ ;
            if(count==3){
               
                System.out.println("Wrong many times");
                
              System.exit(0);

            }


        }
    }
}