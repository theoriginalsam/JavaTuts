
![Package](https://cdncontribute.geeksforgeeks.org/wp-content/uploads/java-types-of-packages.jpg)



># <b>Packages</b> 

- are continous for classes

- Package you to create a class named ABC ,whic you can stire in oyur own paclkage without concern that it will collide with some other class named ABC stored elsewheere.

- Java provides a mechanism for partioning the class the name space into more managable chu ks .THis mechanism is package .

- Package us both a naming and a visibility -> "default" control mechanism


# <b>Defining Package</b>

 >To create 

 - include a package command as the first statement in a java source file .

 - Any classes declared within that file will belong to the specified package 

 - if you omit the package statement , the class mnames are put into the default package whuch has no name .

 >In C/C++ header file 

     Syntax pkage_name;


- Java uses file system directories to store packages .

- For example , the *.class files for any classes you declare to be part of MyPackage must be stored in directory called MyPackage 

   "Directory name must match the package name exactly"
-Can create a hierarchy of package 

    package com.samir.java 
    com\samir\java



# <b>Finding Packages and CLASSPATH</b>

- >How does the java runtime system know where to look for package that you create
 
 1) First , by default the java runtime system uses the current working directory as its starting point .Thus if your package is in a subdirectory of the current directory , it will be formed.
 2) Second , you can specify a directory path or paths by setting CLASS PATH environment variable .
 3) Third, can use -classpath option with java and javac to specify the path to your class.

 ># <b>Types of Packages</b> 

 # 1) Pre-Defined
 # 2) User-Defined
   
   -defined by the developer as per their application requirements 

package abe;

[x] package bac;

package cac;




 ># importing the Packages

     import java.util.Date

     class MyDate extends Date
     {


     }


>Fully Qualifide Java name

    class AnyDate extends java.util.*   





