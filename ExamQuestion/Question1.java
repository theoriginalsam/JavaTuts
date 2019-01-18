// Create a class Employee with id, name, post and salary. Create parameterized constructor to initialize
//  the instance variables. Override the toString( ) method to display the employee details.


class Question{        //Replace Questuin with Employee
String name ;
String post;
int salary;

Question(String name,String Post,int salary){
    this.name=name;
    this.post=Post;
    this.salary=salary;

}

public String toString() { 
    return "Name: '" + this.name + "', Post '" + this.post + "', Salary '" + this.salary + "'";
} 


}










class Question1{
    public static void main(String[] args) {
        
    
    Question obj = new Question("Samir","CEO",1500000);
    Question obj2 = new Question("Arjun","CTO",1200000);
    System.out.println("Details are"+obj);
    System.out.println("Details are"+obj2);
    }
}