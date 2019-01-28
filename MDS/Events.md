>Events  Event Handling and AWT/Swing


# AWT 

# AWT Hierarcy


# Component (Abstract Class )

- Component is an abstract class that encapsulates all the attributes of a visual component .

- Except for menus all interface events that are displayed on the screen and that interact with the user of subclasses of component 

- A component object is responsible for remembering the current foreground and background colors and the currently selected text fonts.

 # Container ⬆️

 - It is subclass of component .
 - It has additional methods that allow other component object to be neated within it.Othe Container object can be stored inside of a container (Since they are itself instance of component).
 - This makes for a containment system .A container is responsible for laying out any components that it contains .It does this through the use of various layout managers. 
# Panels

- Panels is the container that doesnt contain title bar ,border and menu bars. It can have other components like button ,text field.
- Panel is the superclass for applet 
- This is why you dont see title bar , menu bar , border when an applet is run inside a browser . 
- when you run an applet using an applet viewer , the applet viewer provides the tile and border.
- Other components can be added to pannel objects using add method.Once these components have  been added you can resize them using manually using ```setLocation``` method ,```setSize``` method,```setBounds``` method.

# Window 

- The window is the container that has no borders and menu bars.

- The window class creates a top level window.A top level window is not contained with in any other object .
- Generally you wont create window object directly .Instead you'll use a WINDOW subclass object called Frame.

# Frame
- Frame has a title bar ,menu bars , borders and resizing corners .
- The precise look of a frame will differ from an environment.Frame is a container that contain several different component like button title bar ,textfield , labe, etc. 
 - In java most of the AWT app are created using frame window .