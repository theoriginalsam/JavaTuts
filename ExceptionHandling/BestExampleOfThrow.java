import java.io.* ;
import java.util.*;



class BestExampleOfThrow{

    public static void main(String[] args) {
        int amount ;
        int balance=5000;

        Scanner scan =new Scanner(System.in);
        amount = scan.nextInt();
try{
        if(balance <amount )
        throw new ArithmeticException("Insufficient Balance");

        balance = balance-amount;
        System.out.println("The balance is "+balance);
}catch(ArithmeticException e){
    System.out.println("Your account has "+e.getMessage());
}
        System.out.println("Thank You!!");
    }

}