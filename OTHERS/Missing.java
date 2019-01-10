public class Missing{
    public static void main(String[] args) {
        int sum=0;
        int orig=55;
        int x[] =new int[]{1,2,3,4,5,6,8,9,10};
        int i;

        for(i=0;i<9;i++){
sum=sum+x[i];
        }
        System.out.println("Sum is "+sum);
        System.out.println("Missing Number is "+(orig-sum));
    }

}