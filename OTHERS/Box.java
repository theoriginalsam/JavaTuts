class Box{
  double height ,width,length;
  
 Box()
 {
    height=1;
    width=2;
    length=3;

}
// void initiateVar(){
//     height=0;
//     width=0;
//     length=0;

// }

void volume(){
    System.out.println(height*length*width);
}


}