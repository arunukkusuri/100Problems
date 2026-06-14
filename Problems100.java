import java.util.*;

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
    // FactorialNumber();
    // FibonacciNumber();
    //  StrongNumber();
    // PerfectNumber();
    // NeonNumber();
    // AutomorphicNumber();
    // HarshadNumber();
    // SumOfDigits();
    // ProductOfDigits();
    // CountOfDigit();
    // PowerOfDigit();
    // trianglePattern();
    // invertedTriangle();
    // rightAngleTriangle();
    // dimanodTriangle();
    // numberPyrimad();
    // asscendingOrderSorting();


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


public static void FibonacciNumber(){
    Scanner sc=new Scanner (System.in);
    int num=sc.nextInt();
    int a=0;
    int b=1;
    for(int i=1;i<=num;i++){
        int c=a+b;
        a=b;
        b=c;
        System.err.println(c);
    }
}
 

public static void StrongNumber() {
    Scanner sc=new Scanner(System.in);
    int num=sc.nextInt();
    int orig=num;
    int temp=0;
    while(num>0){
        int digit=num%10;
        int fact=1;
        for(int i=1;i<=digit;i++){
            fact=fact*i;
        }
        temp=fact+temp;
        num=num/10;
    }
    if(orig==temp){
        System.err.println("Strog Number");
    }
    else{
        System.err.println("Not Strong Number");
    }
}


public static void PerfectNumber(){
    Scanner sc=new Scanner(System.in);
    int num=sc.nextInt();
    int temp=0;
    for(int i=1;i<num;i++){
        if(num%i==0){
            temp=temp+i;
    }
        }
        if(num==temp){
            System.out.println("perfect Number");
        }
        else{
            System.out.println("Not Perfect Number");
        }
}


public static void NeonNumber(){
    Scanner sc=new Scanner (System.in);
    int num=sc.nextInt();
    int orig=num;
    int temp=0;
    num=num*num;
    while(num>0){
        int digit=num%10;
        temp=temp+digit;
        num/=10;
    }
if(orig==temp){
    System.out.println("Neon number");
}
else{
    System.out.println("not");
}
}


public static void AutomorphicNumber(){
    Scanner sc=new Scanner(System.in);
    int num=sc.nextInt();
     int temp=num*num;
     if(temp%10==num||temp%100==num||temp%1000==num){
        System.out.println("Automorphic");
     }
     else{
        System.out.println("Not Automorphoic");
     }
   
}


public static void HarshadNumber(){
    Scanner sc=new Scanner(System.in);
    int num=sc.nextInt();
    int temp=0;
    int org=num;
    while(num>0){
        int digit=num%10;
        temp=temp+digit;
        num/=10;
    }
     if(org % temp == 0) {
            System.out.println("Harshad Number");
        }
        else {
            System.out.println("Not Harshad Number");
}
}


public static void  SumOfDigits(){
     Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        int sum = 0;

        while(num > 0) {

            int digit = num % 10;

            sum = sum + digit;

            num = num / 10;
        }
    System.out.println(sum);
}


public static void ProductOfDigits(){
     Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        int product = 1;

        while(num > 0) {

            int digit = num % 10;

            product = product * digit;

            num = num / 10;
        }

        System.out.println(product);
}


public static void CountOfDigit(){
    Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        int count = 0;

        while(num > 0) {

            count++;

            num = num / 10;
        }

        System.out.println(count);
}


public static void PowerOfDigit(){
    Scanner sc = new Scanner(System.in);

        int base = sc.nextInt();

        int power = sc.nextInt();

        int result = 1;

        for(int i = 1; i <= power; i++) {

            result = result * base;
        }

        System.out.println(result);
}


public static void HcfNumber(){

    Scanner sc=new Scanner (System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    int hcf=1;
    for(int i=1;i<a && i<b;i++){
        if(a%i==0 && b%i==0){
             hcf=i;
        }
       
    }
    System.out.println(hcf);
}


public static void LcmofNumbers(){
    Scanner sc=new Scanner (System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    int lcm=1;
    while (true) { 
        if(lcm%a==0 && lcm%b==0){
        System.out.println(lcm);
        break;
        }
        lcm++;
    }
}


public static void SwaptwoNumbers(){
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    int c=0;

    c=a;
    a=b;
    b=c;
    System.out.print(a+" ");
    System.out.print(b);
}


public static void decimaltoBinary(){
    Scanner sc =new Scanner(System.in);
    int num=sc.nextInt();
    int binary=0;
    int place=1;
    while(num>0){
        int digit=num%2;
        binary=binary+(place*digit);
        place=place*10;
        num/=2;
    }
    System.out.println(binary);
}


public static void binarytoDecimal(){
    Scanner sc=new Scanner(System.in);
    int binary=sc.nextInt();
    int decimal=0;
    int power=1;
    while(binary>0){
        int digit=binary%10;
        decimal=decimal+(digit*power);
        power=power*2;
        binary/=10;
    }
    System.out.println(decimal);
}


public  static void asciiNumber(){
    Scanner sc=new Scanner(System.in);
    char ch=sc.next().charAt(0);
    int as=ch;
    System.out.println(as);
}


public static void evenOrOdd(){
    Scanner sc=new Scanner(System.in);
    int num=sc.nextInt();
    if(num%2==0){
        System.out.println("Even Number");
    }
    else{
        System.out.println("Odd Number");
    }
}


public static void leapYear(){
    Scanner sc=new Scanner(System.in);
    int year=sc.nextInt();
   if((year%400==0)||(year%4==0 && year%100!=0)){
    System.out.println("leap year");
   }
   else{
    System.out.println("not leap year");
   }
}


public static void nFibonnaci(){
    Scanner sc=new Scanner (System.in);
    int num=sc.nextInt();
    int a=0;
    int b=1;
    int c;
    if(num==0){
        System.out.println(a);
    }
    else if(num==1){
        System.out.println(b);
    }
    else{
        for(int i=2;i<=num;i++){
            c=a+b;
            a=b;
            b=c;
        }
        System.out.println(b);
    }
}


public static void tralingZeroes(){
Scanner sc = new Scanner(System.in);
int num=sc.nextInt();
int count=0;
for(int i=5;num/i>=1;i=i*5){
    count=count+(num/i);
}
System.out.println(count);
}


public static void highestElementArray(){
    Scanner sc=new Scanner (System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];
    
    for(int i=0;i<arr.length;i++){
        arr[i]=sc.nextInt();
    }
    int max=arr[0];
    for(int i=1;i<arr.length;i++){
        if(arr[i]>max){
            max=arr[i];
        }
       
    }
     System.out.println(max);
}


public static void smallestElement(){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<arr.length;i++){
        arr[i]=sc.nextInt();
    }
    int min=arr[0];
    for(int i=1;i<arr.length;i++){
        if(arr[i]<min){
            min=arr[i];
        }
    }
    System.out.println(min);
}


public static void secondLargest(){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n];
    for(int i = 0; i < arr.length; i++){
        arr[i] = sc.nextInt();
    }
    int largest = arr[0];
    int secondlargest = arr[0];
    for(int i = 1; i < arr.length; i++){
        if(arr[i] > largest){
            secondlargest = largest;
            largest = arr[i];
        }
        else if(arr[i] > secondlargest && arr[i] != largest){

            secondlargest = arr[i];
        }
    }

    System.out.println(secondlargest);
}


public static void secondSmallest(){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<arr.length;i++){
        arr[i]=sc.nextInt();
    }
    int smallest=arr[0];
    int secondSmallest=arr[1];
    for(int i=1;i<arr.length;i++){
        if(arr[i]<smallest){
            secondSmallest=smallest;
            smallest=arr[i];
        }
        else if(arr[i]<secondSmallest && arr[i]!=smallest){
            secondSmallest=arr[i];
        }
    }
    System.out.println(secondSmallest);
}


public static void reverseArray(){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<arr.length;i++){
        arr[i]=sc.nextInt();
    }
    for(int i=n-1;i>=0;i--){
        System.out.println(arr[i]+" ");
    }
}


public static void asscendingOrderSorting(){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<arr.length;i++){
        arr[i]=sc.nextInt();
    }
    for(int i=0;i<arr.length;i++){
        for(int j=i+1;j<arr.length;j++){
            if(arr[i]>arr[j]){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
    }
    for(int k=0;k<arr.length;k++){
        System.out.print(arr[k]+" ");
    }
}


public static void decendingOrderSorting(){
    Scanner sc=new Scanner (System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<arr.length;i++){
        arr[i]=sc.nextInt();
    }
    for(int i=0;i<arr.length;i++){
        for(int j=i+1;j<arr.length;j++){
            if(arr[i]<arr[j]){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
    }
    for(int k=0;k<arr.length;k++){
        System.out.println(arr[k]);
    }
}


public static void sumOfArrayElements(){
    Scanner sc=new Scanner (System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<arr.length;i++){
        arr[i]=sc.nextInt();
    }
    int sum=0;
    for(int i=0;i<arr.length;i++){
        sum=sum+arr[i];
    }
    System.out.println(sum);
}


public static void averageElementsOfArray(){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<arr.length;i++){
        arr[i]=sc.nextInt();
    }
    int sum=0;
    for(int i=0;i<arr.length;i++){
        sum=sum+arr[i];
    }
    int average=sum/n;
    System.out.println(average);
}


public static void duplicateElementFinding(){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<arr.length;i++){
        arr[i]=sc.nextInt();
    }
    for(int i=0;i<arr.length;i++){
        for(int j=i+1;j<arr.length;j++){
            if(arr[i]==arr[j]){
                System.out.println(arr[i]);
            }
        }
    }
}


public static void removeDuplicates(){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<arr.length;i++){
        arr[i]=sc.nextInt();
    }
    for(int i=0;i<arr.length;i++){
        boolean isDuplicate=false;
        for(int j=0;j<i;j++){
            if(arr[i]==arr[j]){
                isDuplicate=true;
                break;
            }
        }
        if(!isDuplicate){
            System.out.println(arr[i]);
        }
    }
}


public static void frequencyOfElement() {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<arr.length;i++){
        arr[i]=sc.nextInt();
    }
    for(int i=0;i<arr.length;i++){
        int count=1;
        boolean alreadycount=false;

        for(int k=0;k<i;k++){
        if(arr[i]==arr[k]){
            alreadycount=true;
            break;
        }
    }
    if(alreadycount){
        continue;
    }

    for(int j=i+1;j<arr.length;j++){
        if(arr[i]==arr[j]){
            count++;
        }
        
    }
    System.out.println(arr[i]+"="+count);

    }
    
}


public static void  missingNumberInArray(){
    Scanner sc=new Scanner (System.in);
    int n=sc.nextInt();
    int arr[]=new int[n-1];
    int sum=1;
    for(int i=0;i<arr.length;i++){
        arr[i]=sc.nextInt();
        sum=sum*arr[i];
    }
   int actual=n*(n+1)/2;
   int missed=actual-sum;
   System.out.println(missed);
}


public static void mergeTwoArray(){
    Scanner sc=new Scanner(System.in);
    int n1=sc.nextInt();
    int arr1[]=new int[n1];

    int n2=sc.nextInt();
    int arr2[]=new int[n2];

    for(int i=0;i<arr1.length;i++){
        arr1[i]=sc.nextInt();
    }

    for(int j=0;j<arr2.length;j++){
        arr2[j]=sc.nextInt();
    }

    int merged[]=new int[n1+n2];

     for(int i=0;i<arr1.length;i++){
        merged[i]=arr1[i];
     }
        for(int j=0;j<arr2.length;j++){
            merged[n1+j]=arr2[j];
        }
        for(int k=0;k<merged.length;k++){
        System.out.print(merged[k]+" ");    
        }
     }


public static void rotateArray(){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int temp= arr[n-1];
        for(int j=n-1;j>0;j--){
            arr[j]=arr[j-1];
        }
        arr[0]=temp;
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }    
     }


public static void leftRotateArray(){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int first=arr[0];
        for(int j=0;j<arr.length-1;j++){
            arr[j]=arr[j+1];
        }
        arr[n-1]=first;
        for(int k=0;k<arr.length;k++){
            System.out.print(arr[k]+" ");
        }
     }


public static void rightRotateArray(){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0; i<arr.length;i++){
        arr[i]=sc.nextInt();
    }
    int last=arr[n-1];
    for(int j=n-1;j>0;j--){
        arr[j]=arr[j-1];

    }
    arr[0]=last;
    for(int k=0;k<arr.length;k++){
        System.out.print(arr[k]+" ");
    }
}


public static void commonElements(){
    Scanner sc=new Scanner(System.in);
    int n1=sc.nextInt();
    int arr1[]=new int[n1];
    int n2=sc.nextInt();
    int arr2[]=new int[n2];
    for(int i=0;i<arr1.length;i++){
        arr1[i]=sc.nextInt();
    }
    for(int j=0;j<arr2.length;j++){
        arr2[j]=sc.nextInt();
    }
    for(int i=0;i<arr1.length;i++){
        for(int k=0;k<arr2.length;k++){
            if(arr1[i]==arr2[k]){
                System.out.println(arr1[i]);
            }
        }
    }
}


public static void ZerosToEnd(){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];
    for(int j=0;j<arr.length;j++){
        arr[j]=sc.nextInt();
    }
    int j=0;
    for(int i=0;i<arr.length;i++){
        if(arr[i]!=0){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            j++;
        }
    }
    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
    }
}


public static void maxDifference(){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<arr.length;i++){
        arr[i]=sc.nextInt();
    }
    int maxdiff=arr[1]-arr[0];
    for(int i=0;i<arr.length;i++){
        for(int j=i+1;j<arr.length;j++){
            int diff=arr[j]-arr[i];
            if(diff>maxdiff){
                maxdiff=diff;
            }
        }
    }
    System.out.print(maxdiff+" ");
}


public static void  twoSumTarget(){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<arr.length;i++){
        arr[i]=sc.nextInt();
    }
    int target=sc.nextInt();
    for(int i=0;i<arr.length;i++){
        for(int j=i+1;j<arr.length;j++){
            if(arr[i]+arr[j]==target){
                System.out.println(arr[i]+arr[j]);
                return;
            }
        }
    }
    System.out.println("Target not found");
}


public static void binarySearch() {

    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int arr[] = new int[n];

    for(int i = 0; i < n; i++) {
        arr[i] = sc.nextInt();
    }

    int target = sc.nextInt();

    int low = 0;
    int high = n - 1;

    while(low <= high) {

        int mid = (low + high) / 2;

        if(arr[mid] == target) {
            System.out.println("Target Found at index " + mid);
            return;
        }

        if(target > arr[mid]) {
            low = mid + 1;
        }
        else {
            high = mid - 1;
        }
    }

    System.out.println("Target Not Found");

}


public static void linearSearch() {

    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int arr[] = new int[n];

    for(int i = 0; i < n; i++) {
        arr[i] = sc.nextInt();
    }

    int target = sc.nextInt();

    for(int i = 0; i < n; i++) {

        if(arr[i] == target) {
            System.out.println("Target Found at index " + i);
            return;
        }
    }

    System.out.println("Target Not Found");
}


public static void checkSorted() {

    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int arr[] = new int[n];

    for(int i = 0; i < n; i++) {
        arr[i] = sc.nextInt();
    }

    for(int i = 0; i < n - 1; i++) {

        if(arr[i] > arr[i + 1]) {
            System.out.println("Not Sorted");
            return;
        }
    }

    System.out.println("Sorted");
}


public static void reverseString(){
    Scanner sc=new Scanner(System.in);
    String str=sc.nextLine();
    for(int i=str.length()-1;i>=0;i--){
        System.out.print(str.charAt(i));
    }
}


public static void reversePalindrome(){
    Scanner sc=new Scanner(System.in);
    String str=sc.nextLine();
    String rev="";
    for(int i=str.length()-1;i>=0;i--){
        rev=rev+str.charAt(i);
    }
    if(str.equals(rev)){
        System.out.print("palindrome");
    }else{
        System.out.println("not a palindrome");
    }
}


public static void vowelsAndConsonants(){
    Scanner sc=new Scanner(System.in);
    String str=sc.nextLine();
    int vowels=0;
    int consonants=0;
    for(int i=0;i<str.length();i++){
        char ch=Character.toLowerCase(str.charAt(i));
        if(ch>='a'&&ch<='z'){
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                vowels++;
            }
            else{
                consonants++;
            }
        }
    }
    System.out.println("vowles is :"+vowels);
    System.out.println("consonants is :"+consonants);
} 


public static void spaceBetweenString(){
    Scanner sc=new Scanner(System.in);
    String str=sc.nextLine();
    String space="";
    for(int i=0;i<str.length();i++){
        if(str.charAt(i)!=' '){
            space =space+str.charAt(i);
        }
    }
    System.out.println(space);
}


public static void toggleCharacters(){
    Scanner sc=new Scanner(System.in);
    String str=sc.nextLine();
    String result="";
    for(int i=0;i<str.length();i++){
        char ch=str.charAt(i);
        if(Character.isUpperCase(ch)){
            result=result+Character.toLowerCase(ch);
        }
        else if(Character.isLowerCase(ch)){
            result=result+Character.toUpperCase(ch);
        }
        else{
            result=result+ch;
        }
    }
    System.out.println(result);
}


public static void dupilcatesInString(){
    Scanner sc=new Scanner(System.in);
    String str=sc.nextLine();
    for(int i=0;i<str.length();i++){
        int count=1;
        for(int j=i+1;j<str.length();j++){
        if(str.charAt(i)==str.charAt(j)){
           count++;
    }
    
        }
        if(count>1){
        System.out.print(str.charAt(i));
    }
    }
    
}


public static void characterFrequency() {

    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();

    for(int i = 0; i < str.length(); i++) {

        boolean alreadyCounted = false;

        for(int k = 0; k < i; k++) {
            if(str.charAt(i) == str.charAt(k)) {
                alreadyCounted = true;
                break;
            }
        }

        if(alreadyCounted) {
            continue;
        }

        int count = 1;

        for(int j = i + 1; j < str.length(); j++) {
            if(str.charAt(i) == str.charAt(j)) {
                count++;
            }
        }

        System.out.println(str.charAt(i) + " = " + count);
    }
}


public static void checkAnagram() {

    Scanner sc = new Scanner(System.in);

    String str1 = sc.nextLine();
    String str2 = sc.nextLine();

    if(str1.length() != str2.length()) {
        System.out.println("Not Anagram");
        return;
    }

    char arr1[] = str1.toCharArray();
    char arr2[] = str2.toCharArray();

    Arrays.sort(arr1);
    Arrays.sort(arr2);

    if(Arrays.equals(arr1, arr2)) {
        System.out.println("Anagram");
    } else {
        System.out.println("Not Anagram");
    }
}


public static void removeDuplicateCharacters() {

    Scanner sc = new Scanner(System.in);

    String str = sc.nextLine();

    String result = "";

    for(int i = 0; i < str.length(); i++) {

        boolean duplicate = false;

        for(int j = 0; j < result.length(); j++) {

            if(str.charAt(i) == result.charAt(j)) {
                duplicate = true;
                break;
            }
        }

        if(!duplicate) {
            result = result + str.charAt(i);
        }
    }

    System.out.println(result);
}


public static void firstNonRepeatingCharacter(){
    Scanner sc=new Scanner(System.in);
    String str=sc.nextLine();
    for(int i=0;i<str.length();i++){
        char ch1=Character.toLowerCase(str.charAt(i));
        int count=0;
        for(int j=0;j<str.length();j++){
            char ch2=Character.toLowerCase(str.charAt(j));
            if(ch1==ch2){
                count++;
            }
        }
        if(count==1){
            System.out.print(str.charAt(i));
            return;
        }
    }
    System.out.println("no non-repeating characters");
}


public static void LongestWordInSentence(){
    Scanner sc=new Scanner(System.in);
    String str=sc.nextLine();
    String words[]=str.split(" ");
    String longest="";
    for(int i=0;i<words.length;i++){
        if(words[i].length()>longest.length()){
            longest=words[i];
        }
      
    }
      System.out.println(longest);
}


public static void wordsInASentence(){
    Scanner sc=new Scanner(System.in);
    String str=sc.nextLine().trim();
    if(str.length()==0){
        System.out.println(0);
        return;
    }
    int count=1;
    for(int i=0;i<str.length();i++){
        if(str.charAt(i)==' '){
            count++;
        }
    }
    System.out.print(count);
}


public static void reverseWords(){
    Scanner sc=new Scanner(System.in);
    String str=sc.nextLine();
    String words[]=str.split(" ");
    for(int i=words.length-1;i>=0;i--){
        System.out.print(words[i]+" ");
    }
}


public static void stringComparison(){
    Scanner sc=new Scanner(System.in);
    String str1=sc.nextLine();
    String str2=sc.nextLine();
    if(str1.equals(str2)){
        System.out.print("Same String");
    }
    else{
        System.out.println("not same");
    }

}


public static void subString(){
    Scanner sc=new Scanner(System.in);
    String str=sc.nextLine();
    String sub=sc.nextLine();
    if(str.contains(sub)){
        System.out.println("Sub String founded");
    }
    else{
        System.out.println("Sub String not founded");
    }
}


public static void lexicalLargest(){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    sc.nextLine();
    String largest=sc.nextLine();
    for(int i=0;i<n;i++){
        String str=sc.nextLine();
        if(str.compareTo(largest) > 0) {
            largest = str;
        }
    }
    System.out.println(largest);
}


public static void ascii(){
    Scanner sc=new Scanner(System.in);
    char ch=sc.next().charAt(0);
    System.out.println((int)ch);
}


public static void countSpecialCharacters() {

    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();

    int count = 0;

    for(int i = 0; i < str.length(); i++) {

        char ch = str.charAt(i);

        if(!((ch >= 'a' && ch <= 'z') ||
             (ch >= 'A' && ch <= 'Z') ||
             (ch >= '0' && ch <= '9') ||
             (ch == ' '))) {

            count++;
        }
    }

    System.out.println(count);
}


public static void removeVowels(){
    Scanner sc=new Scanner(System.in);
    String str=sc.nextLine();
    String result="";
    for(int i=0;i<str.length();i++){
        char ch=Character.toLowerCase(str.charAt(i));
        if(ch !='a' && ch !='e' && ch!='i' && ch!='o' && ch!='u'){
            result=result+str.charAt(i);
        }
    }
    System.out.println(result);
}


public static void trianglePattern(){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    for(int i=0;i<n;i++){
        for(int j=0;j<n-i;j++){
            System.out.print(" ");
        }
        for(int k=0;k<(2*i-1);k++){
            System.out.print("*");
        }
        System.out.println();
    }
}


public static void invertedTriangle(){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    for(int i=n;i>0;i--){
        for(int j=0;j<n-i;j++){
            System.out.print(" ");
        }
        for(int k=0;k<(2*i-1);k++){
            System.out.print("*");
        }
        System.out.println();
    }
}


public static void rightAngleTriangle(){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    for(int i=0;i<n;i++){
        for(int j=0;j<n-i;j++){
            System.out.print("*");
        }
        System.out.println("");
    }
}


public static void dimanodTriangle(){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    for(int i=0;i<n;i++){
        for(int j=0;j<n-i;j++){
            System.out.print(" ");
        }
        for(int k=0;k<(2*i-1);k++){
            System.out.print("*");
        }
        System.out.println();
    }
    for(int i=n-1;i>0;i--){
        for(int j=0;j<n-i;j++){
            System.out.print(" ");
        }
        for(int k=0;k<(2*i-1);k++){
            System.out.print("*");
        }
        System.out.println();
    }
}


public static void numberPyrimad(){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    for(int i=1;i<=n;i++){
        for(int j=1;j<=n-i;j++){
            System.out.print(" ");
        }
        for(int k=1;k<=i;k++){
            System.out.print(k+" ");
        }
        System.out.println();
    }
}


}
