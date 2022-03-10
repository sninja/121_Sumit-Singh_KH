import java.util.Scanner;
class prime{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		int flag = 0;
		for(int i=2; i<n; i++){
			if(n%i == 0){
				flag = 1;
				break;
			}
		}
		if(flag == 1)
			System.out.println("Input is not a prime number");
		else
			System.out.println("Input is a prime number");
	}
}