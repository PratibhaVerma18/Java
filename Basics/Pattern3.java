 class Pattern3{

    public static void main(String[]args){
        int n=8;
        int k=1;
        for(int i=1;i<=n;i++){
            for(int j=1; j<=n;j++){
                System.out.printf("%3d",k);
                k++;
            }
            System.out.println();
        }
    }

}