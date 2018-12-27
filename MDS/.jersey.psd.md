Abstract class 
-There are situation in which you will wannt to define a superclass that declares the structure of a given abstraction with out providing a complete implementaton of every method.
-That is , sometimees you will want to create a superclass that only defunes a generalized form that will be showed by all of its sub classes leaving it to each subclass to fills in the details .
-ONe way this situation can occur is when a super class is unable to create a meaning ful implementation for a method 
When you wabt to ensure that a subclass does indeed ,override all necessary method . Javas solutuion is the abstract method.

>Syntax of abstract method.


       abstract type name(parameter list );
        


       Eg:

       abstract void sum(int a , int b);



-these abstract methods are sometiome reffered to as subclass responsibility because they have no implementaition specified in the subclass . Thus subclass must over ride them.