import java.util.Scanner;

/**
 * Practice 
 */
class Problems100{
    /**
     * Main method
     */
    public static void main(String[] args) {
       reverseNumber();
    palindrome();
    }
    public static void reverseNumber() {
        Scanner sc=new Scanner(System.in); // 
       int num=sc.nextInt(); //
        int rev=0; //
        while(num>0){
            int digit=num%10; //
            rev=rev*10+digit; //
            num=num/10;
        }
        System.out.println(rev);
        sc.close();
    }




public static void palindrome(){
    Scanner sc=new Scanner(System.in);
    int num=sc.nextInt();
    int org=num;
    int rev=0;
    while(num>0){
        int digit=num%10;
        rev=rev*10+digit;
        num=num/10;
    }
    if(org==rev){
        System.out.println("palindrome");
    }
    else{
        System.out.println("not palindrome");
    }
}



}