abstract class Abstract2{
   abstract void m1();
}
abstract class  P extends Abstract2{
     void m1(){
         System.out.println("Abstract2");
     }
     abstract void show();
}
class C extends P{
    void show(){
        System.out.println("p");
    }
}
class Abstract{
    public static void main(String args[]){
        C obj=new C();
        obj.m1();
        obj.show();

    }
}