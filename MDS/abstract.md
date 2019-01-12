
![Abstract](https://slideplayer.com/slide/5076963/16/images/2/Abstract+Classes+Java+allows+abstract+classes.jpg)

Abstract class 
-There are situation in which you will wannt to define a superclass that declares the structure of a given abstraction with out providing a complete implementaton of every method.
-That is , sometimees you will want to create a superclass that only defunes a generalized form that will be showed by all of its sub classes leaving it to each subclass to fills in the details .
-ONe way this situation can occur is when a super class is unable to create a meaning ful implementation for a method 
When you wabt to ensure that a subclass does indeed ,override all necessary method . Javas solutuion is the abstract method.

>Syntax of abstract method.


        abstract type name(parameter list );
        


       Eg:

       abstract void sum(int a , int b);



-these abstract methods are sometime referred to as subclass responsibility because they have no implementation specified in the subclass . Thus subclass must over ride them.

-Abstract class cannot be directly instantiated with new operator i.e no object