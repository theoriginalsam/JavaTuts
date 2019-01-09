* Java's Built in extemtions 



        java.lang



- Most general of these exception are subclasses of the standard type Runtime Exception .


   > # 1.  Checked Exception             
   - that must be included in a method of throw list if that method can generate in of these Exception and doesnot handle itself.

   - eg ClassNotFound Exception ,
   IllegalAccessException

    **ClassNotFoundException**

    >Class not found.

   ** CloneNotSuppor tedException**

  >Attempt to clone an object that does not implement the Cloneable inter face.

   **IllegalAccessException**

    > Access to a class is denied.

    **InstantiationException**

    >Attempt to create an object of an abstract class or interface.

    **InterruptedException**

    > One thread has been interrupted by another thread.

    **NoSuchFieldException**

    >A requested field does not exist.

    **NoSuchMethodException**
    >A requested method does not exist.

   > # 2. Unchecked

   - these exception need not be included in any methods throw list.
   - compiler doesnot check to see if a method handles or throws these exceptions .
   - eg ArithmeticException ,ArrayOutOfBoundExpection...

    ArithmeticException

    >Arithmetic error, such as divide-by-zero.

    ArrayIndexOutOfBoundsException

    >Array index is out-of-bounds.

    ArrayStoreException

    >Assignment to an array element of an 
    incompatible type.

    ClassCastException

    >Invalid cast.

    EnumConstantNotPresentException

    >An attempt is made to use an undefined enumeration value.

    IllegalArgumentException

    >Illegal argument used to invoke a method.

    IllegalMonitorStateException

    >Illegal monitor operation, such as waiting on an unlocked thread.

    IllegalStateException

    >Environment or application is in incorrect state.

    IllegalThreadStateException

    >Requested operation not compatible with current thread state.

    IndexOutOfBoundsException

    >Some type of index is out-of-bounds.

    NegativeArraySizeException

    >Array created with a negative size.

    NullPointerException

    >Invalid use of a null reference.

    NumberFormatException

    >Invalid conversion of a string to a numeric format.

    SecurityException

    >Attempt to violate security.

    StringIndexOutOfBounds

    >Attempt to index outside the bounds of a string.

    TypeNotPresentException

    >Type not found.

    Unsuppor tedOperationException

    >An unsupported operation was encountered.







