/* Write a Java program that takes two numbers as input and display the product of
two numbers.
Test Data:
Input first number: 25
Input second number: 5
Expected Output :
25 x 5 = 125 */
import java.util.Scanner;
class prod{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number");
		int a = sc.nextInt();
		System.out.println("Enter second number");
		int b = sc.nextInt();
		int c = a * b;
		System.out.println("Product of numbers is = " + c);
	}
}