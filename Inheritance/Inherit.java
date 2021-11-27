//Single Inheritance

 abstract class Inherit{
    int a=20;
       /* void display(){
   
        System.out.println("inherit");
    }*/
}
class child extends Inherit{
  void display(){
      System.out.println("hello...");
  }

    int b=10;
    void show(){
        System.out.println("child");

    }
}
class C{
    public static void main(String args[]){
        child obj=new child();
        System.out.print(obj.b);
        obj.show();
        System.out.print(obj.a);
        obj.display();
    }
}
    