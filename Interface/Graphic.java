interface Graphic {

    void draw();
    default void init(){
        System.out.println("Graphics");
    }

    
}