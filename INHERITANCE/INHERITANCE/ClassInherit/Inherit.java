class Inherit{

    double width;
    double height ;
    double depth;
    Inherit(Inherit obj){
        width=obj.width;
        height=obj.height;
        depth=obj.depth;

    }

    Inherit(double w,double h,double d){
        width=w;
        height=h;
        depth=d;

    }
    Inherit(){
        width=1;
        height=1;
        depth=1;
        
    }

    Inherit(double len){
        width=height=depth=len;

    }

    double volume(){
        return width*height*depth;

    }
}