 ># Applet 


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


# The HTML APPLET Tag 
   
syntax :

    <APPLET 
    [CODEBASE=codebaseURL]
    CODE=appletFile
    [ALT=alternateText]
    [NAME=appletInstanceName]
    WIDTH = pixels
    HEIGHT=pixels
    [ALIGN=alignment]
    [VSPACE=pixels]
    [HSPACE=pixels]
    >

    [<PARAM NAME=attributeName VALUE=AttributeValue>]
    .
    ..
    .
    [HTML Displayed in the absence of Java]
    </APPLET>

**It is an optional attribute that specifies the base url of the applet code,which is the directory taht will be searched for the applets executable class file**

>Code 

Code is the required attribute that gives the name of the file conaining of the applet compiled .class file.
This file is related to the code based URL of the applet.

 The HTML document URL directory is used as the code based if this atribute is not specified.

> ALT 

 ALT tag is an optional attribute used to specify a short texxt message that should be displayed if the browser recognized the applet tag but can't currently run JAVA applet.

 >Name attribute

 Name attribute is an optional attribute used to specify a name for the applet instance. Name attribute is used in order to communicate btn applets on the same page

>Width and Height

 Width and height are the required attribute that gives the size of the applet display area.

 >Align

 Align is opt attribute that specifies the allignment of the applet.The possible value are left ,right ,top ,bottom ,middle ,baseline ,Texttop, abs Middle ,Abs Bottom

 >V space and H space 

 These are optional V space specifies the space in pixels above and below the applet .H sapce specifies the space in pixels on each side of the applet.

> Param name 

 It helps to specify applet specific arguments.
 Applet access their attribute with the getParameter()