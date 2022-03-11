/*2. Write a Java program to print the sum of two numbers.*/
import java.util.Scanner;
class add{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number");
		int a = sc.nextInt();
		System.out.println("Enter second number");
		int b = sc.nextInt();
		int sum = a + b;
		System.out.println("Sum = " + sum);
	}
}