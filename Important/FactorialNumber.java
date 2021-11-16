//WAP to print Factorial of the no

class FactorialNumber{
    public static void main(String[]args){
        int no=5, fact=1;
        //for(int i=no;i>=1;i--)
        for(int i=1;i<=5;i++){
          fact=fact*i;
        }
        System.out.print( "factorial of no is:"  +fact);
    }
}