//POST DECREMENT
class Increment{
    void main(){
        int a=5;
        int b= a++;
        System.out.print(a);
        System.out.print(b);
    }
class Postdecr{
    public static void main (String[]args){
        int a=10;
        int b= a--;
        System.out.println(a);
         System.out.println(b);
         Increment obj=new Increment();
         obj.main();
    }
}
}

