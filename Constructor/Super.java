class P{
    int a=10;
   void display(){
        System.out.println("Parent");
    }
}
class C extends P{
    int a=20;
   void display(){
         System.out.println("child");
        //  System.out.println(a);
     System.out.println(super.a);
    super.display();
    }
}
class Test{
    public static void main(String[]args){
    C obj =new C();
   obj.display();
   
     System.out.println(obj.a);
    }
}