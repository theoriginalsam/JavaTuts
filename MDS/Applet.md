 > # Applet 


  >init()

 **It is method is the first method to ba called .This is where you should initialize variable this method is called only once during the runtime of your applet.**

 >Start()

 **It is called after init() method it is also called to
 restart an applet after it has been stopped start() is called each time an applet html doc is displayed in screen. So if a user leaves a webpage and comes back the applet resumes executon at start().**

 >paint()

 **It is called each time and awt based applet's outputs must be redrawn
 This situation can occur for several reasons.Whenever an applet must redraw its output , paint() is called.
 The paint() has one parameter of type Graphics.**


 >stop()

 **It is called when web browser leaves the html document containing the applet when it goes to another page . You should use stop()  to suspend threads that don't need to run when the applet is not visible**

 >destroy()

 **It is called when the environment determines that your applets need to be removed completely from memory . At this point you should free up any resources the applet may be using.The stop() is always called before destroy().**
