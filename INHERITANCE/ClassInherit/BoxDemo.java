class BoxDemo{

    public static void main(String[] args) {
        BoxWeight boxWeight = new BoxWeight(10,20,15,32);
        BoxWeight boxWeight1 = new BoxWeight(1000,200,105,302);
     double vol;
     vol=boxWeight.volume();
     System.out.println("Volume is "+vol);
     System.out.println("weight is "+boxWeight.weight);
     vol = boxWeight1.volume();
     System.out.println("Volume is "+vol);
     System.out.println("weight "+boxWeight1.weight);


        
    }
}