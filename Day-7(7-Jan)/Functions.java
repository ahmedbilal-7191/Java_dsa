import java.util.*;

public class Functions {
    // using int
    // public static int isPrime(int n) {
    // if (n == 2) {
    // return 2;
    // } else {
    // boolean isprime = true;
    // for (int i = 2; i <= Math.sqrt(n); i++) {
    // if (n % i == 0) {
    // isprime = false;
    // }
    // }
    // if (isprime == true) {
    // return n;
    // } else
    // return 0;
    // }
    // }

    // using void
    // public static void isPrime(int n) {
    // if (n == 2) {
    // System.out.println("2");
    // } else {
    // boolean isprime = true;
    // for (int i = 2; i <= Math.sqrt(n); i++) {
    // if (n % i == 0) {
    // isprime = false;
    // }
    // }
    // if (isprime == true) {
    // System.out.println(n);
    // } else {
    // System.out.print("");
    // }
    // }
    // }
    // optimized code for prime
    // public static boolean isPrime(int n) {
    // if (n == 2) {
    // return true;
    // } else {
    // for (int i = 2; i <= Math.sqrt(n); i++) {//<=n-1
    // if (n % i == 0) {
    // return false;

    // }
    // }
    // return true;
    // }
    // }

    // public static void rangePrime(int n){
    // for (int i = 2; i <=n; i++) {
    // boolean result=isPrime(i);
    // if (result) {
    // System.out.println(i);
    // } else {
    // System.out.print("");
    // }
    // }
    // }
    // public static int revv(int n){
    // int reverse=0;
    // while (n>0) {
    // int Ld=n%10;
    // reverse=reverse*10+Ld;
    // n=n/10;
    // }
    // return reverse;

    // }
    // public static void decTobin(int n) {
    // int mynum = n;
    // int pow = 0;
    // int bin = 0;
    // while (n > 0) {
    // int rem = n % 2;
    // bin = bin + rem * (int) Math.pow(10, pow);
    // n=n/2;
    // pow++;
    // }
    // System.out.println("The dec tobin of "+mynum+" = "+bin);
    // }

    public static float Average(int a, int b, int c) {
        int sum = a + b + c;
        float avg = sum / 3;
        return avg;
    }

    public static boolean isEven(int n) {
        if (n % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isPalindrome(int n) {
        int temp = n;
        int rev = 0;
        while (n > 0) {
            int Ld = n % 10;
            rev = rev * 10 + Ld;
            n = n / 10;
        }
        if (temp == rev) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {

        // for int
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Please enter the range for prime numbers");
        // int range = sc.nextInt();
        // for (int i = 2; i <= range; i++) {
        // int result = isPrime(i);
        // if (result == 0) {
        // System.out.print("");
        // } else
        // System.out.println(result);
        // }

        // for void
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Please enter the range for prime numbers");
        // int range = sc.nextInt();
        // for (int i = 2; i <= range; i++) {
        // isPrime(i);
        // }

        // optimized
        // System.out.println("is a "+isPrime(2));

        // using helper functions
        // Scanner sc=new Scanner(System.in);
        // System.out.println("Please enter a number till you want to print prime
        // numbers");
        // int input=sc.nextInt();
        // rangePrime(input);
        // String num="123";
        // for (int i = 1; i <=num.length(); i++) {
        // System.out.println("heelo");
        // }

        // Bin to Dec
        // int n=1000;
        // int dec=0;
        // int i=0;
        // while (n>0) {
        // int Ld=n%10;
        // dec=dec+(int) (Ld*Math.pow(2, i));
        // n=n/10;
        // i++;
        // }
        // System.out.println(dec);

        // Dec to Bin
        // int n = 11;
        // // int bin=0;
        // int rev = 0;
        // while (n > 0) {
        // int q = n / 2;
        // int r = n % 2;
        // rev = rev * 10 + r;
        // n = q;
        // }
        // System.out.println(revv(rev));

        // Dec to Bin
        // int n=11 ;
        // int bin =0;
        // int pow=0;
        // while (n>0) {
        // int r=n%2;
        // bin=bin+r*(int)Math.pow(10, pow);
        // pow++;
        // n=n/2;
        // }
        // System.out.println(bin);
        // decTobin(11);

        // Assignments
        // 1Q.
        // float res=Average(20, 20, 30);
        // System.out.println(res);
        // 2Q.
        // System.out.println(isEven(10));
        // System.out.println(isEven(11));
        // 3Q.
        // int n=123;
        // int temp=n;
        // int rev=0;
        // while (n>0) {
        // int Ld=n%10;
        // rev=rev*10+Ld;
        // n=n/10;
        // }
        // // System.out.println(n);
        // if (temp==rev) {
        // System.out.println("Palindrome");
        // }
        // else System.out.println("Not Palindrome");
        // System.out.println(isPalindrome(121));
        // System.out.println(isPalindrome(120));int sum=0;
        // int sum=0;
        // int n=12345;
        // int evensum=0;
        // int oddsum=0;
        // while (n>0) {
        // int Ld=n%10;
        // if (Ld%2==0) {
        // evensum+=Ld;
        // }
        // else oddsum+=Ld;

        // n=n/10;
        // }
        // System.out.println(evensum);
        // System.out.println(oddsum);
        // int n = 1234;
        // int rev = 0;
        // int normal = 0;
        // int i = 0;
        // while (n > 0) {
        //     int Ld = n % 10;
        //     rev = rev * 10 + Ld;
        //     normal=normal*10+Ld;
        //     n = n /10;
        // }
        // System.out.println(rev);
        // System.out.println(normal);
        int n=6;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i+j>=n+1) {
                    System.out.print("*");
                }
                else System.out.print(" ");
            }
            System.out.println("");
        }

    }
}