/* 11. Write a Java program to print the area and perimeter of a circle.
Test Data:
Radius = 7.5
Expected Output
Perimeter is = 47.12388980384689
Area is = 176.71458676442586 */
import java.util.Scanner;
class eleven{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter radius");
		float r = sc.nextFloat();
		double peri = 2*Math.PI*r;
		double area = Math.PI*(r*r);
		System.out.println("Perimeter is = " + peri);
		System.out.println("Area is = " + area);
	}
}