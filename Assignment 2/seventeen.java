import java.util.Scanner;
class seventeen
{
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter two binary numbers");
	String a = sc.next();
    String b = sc.next();

    // Use as radix 2 because it's binary    
    int number1 = Integer.parseInt(a, 2);
    int number2 = Integer.parseInt(b, 2);

    int sum = number1 + number2;
    System.out.println(Integer.toBinaryString(sum));
	}
}