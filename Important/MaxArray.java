class MaxArray{
    public static void main(String[]args){
        int []a={3,5,6,7,8,1};
        int max=a[0];
        for(int i=1;i<a.length;i++){
            if(max<a[i]){
                max=a[i];
            }
        }
        System.out.print(max);
    }
}