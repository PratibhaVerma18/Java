 class Palindrome{
     public static void main(String[]args){
         int no=121;
         int temp= 121;
         int rev=0,rem;
         while(temp!=0);
         {
             rem=temp%10;
            rev=rev*10+rem;
            no=temp/10; 
         }
         if(no==rev){
             System.out.print(no+ "is palindrome number");
         }
         else{
             System.out.print(no+ "is not palindrome number");
         }
     }
 }