//no is divisible by 4 and 400 but not divisible by 100.

class LeapYear{
    public static void main(String[]args){
        int year=2021;
        if((year%400==0)||(year%4==0 && year%100!=0)){
            System.out.print("leap year");
        }
        else{
            System.out.print("not a leap year");
        }
    }
}