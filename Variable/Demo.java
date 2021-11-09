class Demo{
    int x= 8;    //instance variable
    static int y=10;  //static variable
    public static void main(String args[]){
        int z=11;   //local variable
        Demo d= new Demo();
          System.out.println(d.x);
        System.out.println(y);
          System.out.println(z);
    }
}