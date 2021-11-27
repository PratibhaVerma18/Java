class P{
    P(){
        System.out.println("Default constructor");
    }
       P(int a) //Parameterised constructor
{
    System.out.println("a=" +a);
}
}

class Parent{
    public static void main (String args[]){
    P obj1=new P();
    P obj2=new P(10);
}
}