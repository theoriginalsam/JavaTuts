- Are conatiners for class 

- Paackage allows you to create a class named ABC , which you can store in your own package without concern that it will collide with some other class named ABC stored elsewhere.

- JAVA provides a mechanism for partitioning the class name space into more manageable chinks. This mechanism is the package.

- Package is both a naming and a visibility ->"default" control mechanism.


                    
# Defining a package
        To create:
        - Include a package command as the first statement in a JAVA source file.
        - Any classes declared within that file will belong to the specified package .
        - If you omit the package statement , the class names are put into the default package , which has no name.
            In C and CPP
                header file
            Syntax:
                package package_name ; 
        - JAVA uses file system directories to store packages.
        - For example , the class files for any classes you declare to be part of MyPackage must be stored in a directory called MyPackage.
             " Directory name must match the package name exactly. "

        - Can create a hierarchy of package
            package com.suman.java
                    com\suman\java


# Finding Packages and CLASSPATH
    How does the JAVA runtime system know where to look for package that you create ?
    a) First , by default , the Java run time system uses the current working directory as its starting point.
       Thus, if your package is in a sub directory of the current directory , it will be found.
    b) Second , you can specify a directory path or paths by setting CLASSPATH environmental variable.
    c) Third , can use -classpath option with Java and Javac to specify the path to your class.


# Importing packages
All cases below are correct. Case 3 isnot a good practise.

> Case 1
import java.util.Date ;

class MyDate extends Date
{

}

> Case 2
import java.util.* ;

class MyDate extends Date
{

}

> Case 3

class MyDate extends java.util.Date
{

}


# Advantages of Packages :
<i>- Modularity 
- Abstraction
- Security 
- Sharability
- Resusability</i>

#<b> TYPES OF PACKAGES:</b>
  # 1) User Defined Packages :
- Defined by the developer as per thier application requirements.
    ```java
        package abc ;
        package bac ;
        package cba ;
        class  Test
        {

        }
   ```

  # 2) Predefined Packages
> Are defined by java programming language and provide along with java software.
    
    Eg1 : java.lang

- this is default package, no need to import in java.

- It is able to include all basic classes and interface which are required to prepare basic programs.

- System , Object , String , StringBuffer , StringBuilder ,Thread , Runnable , All wrapper classes ( Byte , Short ) , Exception and its sub classes come under java.lang .


Eg 2 : java.io

- to perform inpot and out put operation 

- input stream, ByteArratInputStream,File input system ,
Output stream reader writer...etc

Eg 3 : java.util

- representing all data structure .
- List ,arraylist, vector ,stack, linkedlist ,set, hasset queue sortedset, Map, HashMap

Eg 4 : java.awt 

- TO prepare GUI operation .
- Frame ,Button,Label,List,Textfield,Textarea,etc...

Eg 5 : javax.swing
- to prepare gui application .
- to overcome drawback of awt.
- JFRAME ,JLABEL , JTAB....

Eg 6 : java.net
- to prepare distributed application on the basis of socket programming .
- Soxket , URL , URC Connection


