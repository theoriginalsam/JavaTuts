 > **FINALLY**  

when exceptions are thrown executing in a method takes a rather abrupt , 
non linear path that alters the normal flow through the method . Depending
upon how the method is coded it is even possible an exception to cause the
method to return prematurely this could be a problem in some methods 

- The ```finally``` keyword is designed to address this kind of problem.
```finally``` creates a block of code that will be executed after a ```try / catch``` block has completed and before the code following the ```try/catch``` block. The ```finally``` block will be executed whether or not the exceotion is thrown .
- If an exception is thrown the ```finally``` block will executed even if no catch statement matches the exception .This can be useful for cosing file handles and freeing up any other resiurces. ```finally``` block is opt.
>NOTE 
Each try statement requires atleast one catch or ```finally``` clause