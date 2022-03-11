/*3. Write a Java program to divide two numbers and print on the screen.*/
import java.util.Scanner;
class div{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the dividend");
		int a = sc.nextInt();
		System.out.println("Enter the divisor");
		int b = sc.nextInt();
		int d = a / b;
		System.out.println("Quotient = " + d);
	}
}