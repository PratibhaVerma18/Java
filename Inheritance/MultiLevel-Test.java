 //Multi-Level-inherit
 
 class Parent{
    public void display(){
        System.out.println("Parent Class - Display method");
    }
}
class Child extends Parent{
  public  void show(){
    System.out.println("child");
}
}
class GrandChild extends Child{
 public void screen(){
    System.out.println("grand child");
}
}
class Test{

    public static void main(String[] args){
      Child c=new Child();
      c.display();
      c.show();
      GrandChild p = new GrandChild();
      p.display();
      p.screen();
    }
    
}