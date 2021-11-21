//WAP second largest number.

class LargestNumber{
    public static void main(String args[]){
        int[] a={8,6,7,4,2};
         int temp;
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
           if(a[i]< a[j])
           {
               temp=a[i];
           a[i]=a[j];
           a[j]=temp;
            }
            }
        }
        System.out.println("second largest no is:"+a[1]);
    }
}