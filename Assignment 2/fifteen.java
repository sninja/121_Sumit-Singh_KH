//15. Write a Java program to swap two variables.

import java.util.Scanner;
class fifteen{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a:");
		int a = sc.nextInt();
		System.out.println("Enter b:");
		int b = sc.nextInt();
		int c = 0;
		c = a;
		a = b;
		b = c;
		System.out.println("Swapped numbers");
		System.out.println("a = " + a);
		System.out.println("b = " + b);
	}
}