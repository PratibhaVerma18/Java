class ReverseNumber{
    public static void main(String[]args){
        int no=2346,rev=0,rem;
        while(no!=0)
        { 
           
           rem=no%10;
           //result = rem;
           rev=rev*10+rem;

           no=no/10;

        }
        System.out.print("rev:"+rev);
    }
}