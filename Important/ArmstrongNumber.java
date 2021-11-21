//Armstrong no is a no that is equal to the sum of cubes of its digit.

class ArmstrongNumber{
    public static void main (String []args){
        int no=153;
        int t1= no;
        int length=0;
        while(t1!=0){
            length=length+1;
            t1=t1/10;
        }
        int t2=no;
        int arm=0;
        int rem;
        while(t2!=0){
            rem=t2%10;
            int mul=1;
            for(int i=1;i<length;i++)
            {
                mul=mul*rem;
            }
            arm=arm+mul;
            t2=t2/10;
        }
        if(arm==no){
            System.out.print(no+"is armstrong no");
        }
        else{
            System.out.print(no+ "is not armstrong no");
        }
    }
}