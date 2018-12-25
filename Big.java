
class Big{
    int a[]=new int[]{1,2,3,4,5};
    public void doAlgorithm(int a[]){
int big = 0, temp = 0;
for (int i = 0; i < a.length; i++) {
for (int j = i+1; j < a.length; j++) {
big = (a[i] > a[j]) ? a[i] : a[j];
if(temp < big)
temp = big;
}
}
System.out.println(temp);
}
}


