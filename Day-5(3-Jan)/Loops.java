import java.util.*;

public class Loops {
    public static void main(String[] args) {
        // int i=1;
        // while (i<=100) {
        // System.out.println("helloworld");
        // i++;
        // }
        // System.out.println("Done");
        // int i=1;
        // while (i<=10) {
        // System.out.println(i);
        // i++;
        // }
        // Scanner sc=new Scanner(System.in);
        // System.out.println("Enter the number N");
        // int num=sc.nextInt();
        // int i=1;
        // while (i<=num) {
        // System.out.print(i+" ");
        // i++;
        // }
        // int i=1;
        // int sum=0;
        // while (i<=num) {
        // sum+=i;
        // i++;
        // }
        // System.out.println("The sum of first"+num+"natural number is "+sum);
        // for(int line=1;line<=4;line++){
        // System.out.println("* * * *");
        // }
        // int i=1;
        // while (i<=4) {
        // System.out.println("* * * *");
        // i++;
        // }
        // System.out.println(10%1);
        // int n=10899;
        // while (n>0) {
        // int lasttdigit=n%10;
        // System.out.print(lasttdigit);
        // n=n/10;
        // }
        // System.out.println(n);
        // int n = 1234;
        // int rev = 0;
        // while (n > 0) {
        // int LD = n % 10;
        // rev = (rev * 10) + LD;
        // n = n / 10;
        // }
        // System.out.println(rev);
        // int i=1;
        // while (i<5) {
        // if (i==5) {
        // break;
        // }
        // System.out.println(i);
        // i++;

        // }
        // System.out.println("You are out");
        // for(int i=1;i<=5;i++){
        // if (i==5) {
        // break;
        // }
        // System.out.println(i);
        // }
        // int num;
        // num = sc.nextInt();
        // do {
        // System.out.println("Enter the number please");
        // Scanner sc = new Scanner(System.in);
        // int num = sc.nextInt();
        // if (num % 10 == 0) {
        // break;
        // }
        // System.out.println("You Entered " + num);
        // } while (true);

        // int i=1;
        // while (i <= 5) {
        // if (i == 4) {
        // i++;
        // continue;
        // }
        // System.out.println(i);
        // i++;
        // }
        // for(int i=1;i<=5;i++){
        // if (i==3) {
        // continue;
        // }
        // System.out.println(i);

        // }
        // do {
        // System.out.println("Please enter the Numbers ");
        // int num=sc.nextInt();
        // if (num%10==0) {
        // continue;
        // }
        // System.out.println("The number entered is : "+num);
        // } while (true);

        // My Method
        // Scanner sc = new Scanner(System.in);
        // int i = 0;
        // int num = sc.nextInt();
        // int count = 2;
        // while (count < num) {
        // if (num % count == 0 ) {
        // System.out.println("Divisible");
        // count++;
        // i++;
        // if (num % 1 == 0) {
        // i++;
        // }
        // continue;
        // }
        // count++;
        // // System.out.println("No");
        // // System.out.println(12%3);

        // }
        // if (i >= 2) {
        // System.out.println("Non-Prime");
        // } else
        // System.out.println("Prime");
        // Apna college method
        // Scanner sc = new Scanner(System.in);
        // int Numbers = sc.nextInt();
        // boolean isprime = true;
        // if (Numbers == 2) {
        // System.out.println("Prime");
        // } else {
        // //for optimization instead of numbers-1 we use square toot of number bcoz
        // after half values number gets repeated
        // for (int i = 2; i <= Math.sqrt(Numbers); i++) {
        // if (Numbers % i == 0) {
        // isprime = false;
        // }
        // }
        // if (isprime == true) {
        // System.out.println("Prime");
        // } else
        // System.out.println("Not Prime");
        // }
        // String name="Bilal";
        // System.out.println(name.charAt(0));
        // for (int i = 0; i < 5; i++) {
        // System.out.println("Helllo");
        // i+=2;
        // }
        // Scanner sc = new Scanner(System.in);
        // int i = 1;
        // int evensum = 0;
        // int oddsum = 0;
        // do {
        // System.out.println("Please enter a number");
        // int input = sc.nextInt();
        // if (input % 2 == 0) {
        // evensum += input;

        // // continue;
        // } else {
        // oddsum += input;
        // // System.out.println("the Oddsum is : " + oddsum);
        // // System.out.println("the EvenSum is : " + evensum);
        // }
        // System.out.println("Do you want to continue ? if yes press 1 if no press 0");
        // i = sc.nextInt();

        // } while (i == 1);
        // System.out.println("the EvenSum is : " + evensum);
        // System.out.println("the Oddsum is : " + oddsum);
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the Number to find Factorial");
        // int input = sc.nextInt();
        // if ( input == 0) {
        // System.out.println("The factorial is " + 1);
        // } else {
        // int fact = 1;
        // while (input > 0) {
        // fact *= input;
        // input--;
        // }
        // System.out.println("The factorial is "+fact);
        // }
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the number to print a table of");
        // int input = sc.nextInt();
        // for (int i = 1; i <= 10; i++) {
        //     System.out.println(input + " x " + i + " = " + input * i);
        // }
        // int i=0;
        // for ( i = 0; i <=5; i++) {
        //     System.out.println("i= "+i);
        // }
        // System.out.println("i after the loop = "+ i );

    }
}