package gces ;
public class Student {


    String name ;
    int rollNo;

   public Student(String n,int x){
        name=n;
        rollNo=x;

    }
    public void display(){

        System.out.println("My name is "+name);
        System.out.println("My roll is "+rollNo);
    }




}