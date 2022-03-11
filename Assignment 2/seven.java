/* Test Data:
Input a number: 8
Expected Output :
8 x 1 = 8
8 x 2 = 16
8 x 3 = 24
...
8 x 10 = 80 */
import java.util.Scanner;
class seven{
	public static void main(String args[]){
		System.out.println("Enter a number");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i = 1;
		while(i <= 10){
			System.out.println(n + "x" + i + " = " + (n*i));
			i++;
		}
	}
}