/* 6. Write a Java program to print the sum (addition), multiply, subtract, divide and
remainder of two numbers.
Test Data:
Input first number: 125
Input second number: 24
Expected Output :
125 + 24 = 149
125 - 24 = 101
125 x 24 = 3000125 / 24 = 5
125 mod 24 = 5 */
import java.util.Scanner;
class operations{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Input first number");
		int a = sc.nextInt();
		System.out.println("Input second number");
		int b = sc.nextInt();
		System.out.println(a + " + " + b +" = " + (a+b));
		System.out.println(a + " - " + b +" = " + (a-b));
		System.out.println(a + " x " + b +" = " + (a*b));
		System.out.println(a + " / " + b +" = " + (a/b));
		System.out.println(a + " mod " + b +" = " + (a%b));
	}
}