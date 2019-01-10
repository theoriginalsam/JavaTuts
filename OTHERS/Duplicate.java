import java.util.Arrays;

class Duplicate
{
public static void main(String []args)
{
    int i;

int[] arr={1,2,3,2,1,3,5,5,6,8};
Arrays.sort(arr);
for( i=1;i<arr.length;i++)
{
if(arr[i]==arr[i-1])
{
    
System.out.println("Duplicate = " + arr[i]
);
}
}

}}


