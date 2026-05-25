import java.util.Scanner;

class Problems100{
    public static void main(String[] args) {
       reverseNumber();
    }
    public static void reverseNumber() {
        Scanner sc=new Scanner(System.in);
       int num=sc.nextInt();
        int rev=0;
        while(num>0){
            int digit=num%10;
            rev=rev*10+digit;
            num=num/10;
        }
        System.out.println(rev);
        sc.close();
    }
}