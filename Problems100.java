import java.util.Scanner;

/**
 * Practice 
 */
class Problems100{
    /**
     * Main method
     */
    public static void main(String[] args) {
    // reverseNumber();
    // palindrome();
    // ArmstrongNumber();
    // PrimeNumberCheck();
    FactorialNumber();



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



public static void ArmstrongNumber(){
    Scanner sc=new Scanner(System.in);
    int num=sc.nextInt();
    int org=num;
    int sum=0;
    while(num>0){
        int digit=num%10;
        sum=sum+(digit*digit*digit);
        num/=10;
    }
    if(org==sum){
        System.out.println("Armstrong Number");
    }
    else{
        System.out.println("Not Armstrong Number");
    }
}

public static void PrimeNumberCheck() {
    Scanner sc = new Scanner(System.in);
    int num=sc.nextInt();
    int count=0;
    for(int i=1;i<=num;i++){
        if(num%i==0){
            count++;
        }
    }
    if(count==2){
        System.out.println("prime number");
    }
    else{
        System.out.println("not prime number");
    }
}


public static void FactorialNumber() {
    Scanner sc=new Scanner(System.in);
    int num = sc.nextInt();
    int fact=1;
    for(int i=1;i<=num;i++){
        fact=fact*i;
    }
    System.out.println(fact);
}


}