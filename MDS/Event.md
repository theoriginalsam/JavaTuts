# Event handling 


   >What is Event :

- Change in the state of an object is known as even ie event describes the change in the state
- Events are generated as a result of user interaction with GUI component .But they can also be generated explicitly 

  For e.g Clicking on a button moving the mouse entering character through keyboard 


     What is Listener :

     - A listener is an object that is notified when event occurs
     - Also known as Event Handler.
     - Listener is responsible for generating response to an event .
     - It has 2 major requirements

        1. FIRST  it must have been registered with one or more source recieve notification about specific types of events

        2. It must implemwt methods to receive and process these notification.

    What is event source :

    - A source is an object that generates an event .This occurs when the internal state of the object changes in some way .
    - Sources may generate more than one type of event .
    - A source must register listener in order for the listener to receive notification about specific type of event .
    - Each type od event has its own registration method . Here is the gemera; form 

            public void addTypeListener(TypeListener el) // for eg- addKeyListener()

        Here type is the name of the event and el is the referenceto the event listner.
     
    - When an event occurs all regestered listner are notified and receive a copy of the event object .This is known as multicasting the event .
    - SOme sources may allow only ane listener to register When such event occurs the registered lsitener is modified .This is known as unicating
    - A source must also provide methid that allows a listener to unregister an interest in a specific type of event .

            public void removeTypeListener (TypeListener el) ;

    - What is Event Handling ;
    it is the mechanism that controls the event and decides what should happen if an event occurs .
   - Java uses Event Delefation model.

   # Event Delegation Model
      
     A source generates an event and sends it to one or more listener.
     - the listener simply waits until it receives an event. Once an event is receives , the listener process the event and returns.
     - The advantage of the design is that application logic that processes events is clearly seperated from the UI logic that generates those events.


     # Event class 

     AN Action Event is generated when 
       - a button is pressed 
       - a list item is double clicked 
       - menu items is selected

    # Constructor 
        ActionEvent(Object src , int type , String cmd)
        ActionEvent(Object src , int type , String Cmd , int modifiers )
        ActionEvent(Object src , int type ,Sting cmd ,long when , int modifiers)




     Here 
       src = reference to the object that generated this event 
       type = Determine type of event
       cmd = command string 
       modifiers = indicates modifire key (option,CMD,SHIFT values are ALT_MASK )

       <!-- Action Event Class 

        - You can obtain  -->
    