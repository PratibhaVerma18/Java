class FibonacciSeries{
    public static void main (String args[]){
    int a=0; int b= 1;
    System.out.print(a+ "\n" +b+ "\n");

int c;
for(int i=2;i<=10;i++){
    c=a+b;
    System.out.println("" +c);
    a=b;
    b=c;
}
}
}