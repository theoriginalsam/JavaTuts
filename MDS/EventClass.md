2.  Key Event 
 
 - it is generated when :
    -keyboard input occurs
 - 3 Types of  KeyEvent

    - KEY_PRESSED
    - KEY_RELEASED 
    - KEY_TYPED    .........character is generated


 Constants 
   = 
  > VK_ALT, VK_DOWN, VK_LEFT, VK_RIGHT, VK.ENTER, VK.ESCAPE , VK.CONTROL , VK.SHIFT etc

   * Methos 
    - char getKeyChar();
    - int getKeyCode();


    The MouseEvent Class
There are eight types of mouse events. The MouseEvent class defines the following integer constants that can be used to identify them:

MOUSE_CLICKED -
The user clicked the mouse.

MOUSE_DRAGGED -
The user dragged the mouse.

MOUSE_ENTERED -
The mouse entered a component.

MOUSE_EXITED -
The mouse exited from a component.

MOUSE_MOVED -
The mouse moved.

MOUSE_PRESSED -
The mouse was pressed.

MOUSE_RELEASED -
The mouse was released.

MOUSE_WHEEL -
The mouse wheel was moved.


# Methods 
    int getX()
    int getY()

Alternatively, you can use the getPoint( ) method to obtain the coordinates of the mouse. It is shown here:

    Point getPoint( )

It returns a Point object that contains the X,Y coordinates in its integer members: x and y.

 The translatePoint( ) method changes the location of the event. Its form is shown here:

    void translatePoint(int x, int y)
Here, the arguments x and y are added to the coordinates of the event.

The getClickCount( ) method obtains the number of mouse clicks for this event.
Its signature is shown here:

    int getClickCount( )

-------------
    boolean isPopupTrigger()

 -tests if the event causes a popup menu to appear.




| SN |Event |  Action|
-----|--------|------|---
|1|ActionEvent |  Generated when a button is pressed, a list item is double-clicked, or a menu item is selected.|
|2| AdjustmentEvent | Generated when a scroll bar is manipulated.
|3| ComponentEvent | Generated when a component is hidden, moved, resized, or becomes visible.|
|4|ContainerEvent|Generated when a component is added to or removed from a container.
|5|FocusEvent|Generated when a component gains or loses keyboard focus.
|6|InputEvent|Abstract superclass for all component input event classes.
|7|ItemEvent|Generated when a check box or list item is clicked; also occurs when a choice selection is made or a checkable menu item is selected or deselected.
|8|KeyEvent|Generated when input is received from the keyboard.
|9|MouseEvent|Generated when the mouse is dragged, moved, clicked, pressed, or released; also generated when the mouse enters or exits a component.
|10|MouseWheelEvent|Generated when the mouse wheel is moved.
|11|TextEvent|Generated when the value of a text area or text field is changed.
|12|WindowEvent|Generated when a window is activated, closed, deactivated, deiconified, iconified, opened, or quit.







