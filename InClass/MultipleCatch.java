class MultipleCatch{
public static void main(String[] args) {
    
    try{
    // int length=0 ;
    // int num1=42/length;
    // System.out.println("This is not possible");    //THe process will stop after this exception . and can 't move foreward'
    int Array[]=new int[3];
    Array[3]=5;


    

    }

    catch(ArithmeticException e) {
        System.out.println("not divisible by zero");
    
    }
    catch(ArrayIndexOutOfBoundsException f){
        System.out.println("Array not possible");

    }
    System.out.println("After catch this has appeared");
    
}
    
    
}

// The try statement can be nested ie , a try statement can be inside the block of another try.
// each tume a try statement is entered , the contect of that exception is pushed in the stack 
// if an inner try sstatement doesn't have a catch handler for a particular exception , the stack is 
// unwound and the next try statements catch handler are inspected for a match.This continues until one 
// of the catch statemm=ent succeeds or until all of the nested try statementds are exhausted.If no catch s
// tatement matches then the java runtime system will handle this exception