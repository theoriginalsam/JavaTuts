>**Interface**




<b><i>
-using the keyword 'interface' you can fully abstract a class interface from its implementation .

-That is , using interface you can specify what a class must do,but not how does it 

-they are syntatically similar to class but they lack instance variable and their methods are declared without any body.

-interface are define to support dynamic method resolution at runtime ;

</b></i>


>Defining an interface 

        access modifier interface name {
            return type method name (para list );
            .
            .
            .
            type final var name =value ;

        }

**But begunning with JDK 8 it is possible to add a default implementation to an interface method . thus it is now possible for interface to specify some behaviour .**

        default void mi(){
            -
            -
            -
            -
        }

>Implementing interface


        class class name [extends superclass][implements interface1,interface 2...]
        {
            //
        }
When you implemnet an interface method it must be declared as public



