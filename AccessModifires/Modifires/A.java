package pack;
class A{
    private int a=10;
    private void m1(){
        System.out.println("private access modifier...");
    }
    public static void main(String[] args){
        A objA=new A();
        System.out.println(objA.a);
        objA.m1();
    }
}