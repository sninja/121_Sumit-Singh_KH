/* 13. Write a Java program to print the area and perimeter of a rectangle.
Test Data:
Width = 5.5 Height = 8.5
Expected OutputArea is 5.6 * 8.5 = 47.60
Perimeter is 2 * (5.6 + 8.5) = 28.20 */
import java.util.Scanner;
class thirteen{
	public static void main(String args[]){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter length");
		float l = sc.nextFloat();
		System.out.println("Enter breadth");
		float b = sc.nextFloat();
		System.out.println("Area is = " + (l*b));
		System.out.println("Perimeter is = " + (2*(l+b)));
		
	}
}