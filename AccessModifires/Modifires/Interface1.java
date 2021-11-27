interface A{
    void display();
    void display2();
}
interface B{
    void show();
    void show2();
}
class AB implements A,B{
 public void display(){
        System.out.println("A");
}
   public void show(){
        System.out.println("B");
    }
    public void display2(){
        System.out.println("AA");
    }
    public void show2(){
        System.out.println("BB");
    }
}
class main{
    public static void main(String[]args){
        AB obj=new AB();
        obj.display();
        obj.show();
        obj.display2();
        obj.show2();
    }
}