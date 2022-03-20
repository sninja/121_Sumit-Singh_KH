//19. Write a Java program to convert a decimal number to binary number.

import java.util.Scanner;
class nineteen{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a decimal number");
		int n = sc.nextInt();
		int arr[] = new int[100];
		int i=0;
		while(n>0){
			int rem = n%2;
			arr[i++] = rem;
			n = n/2;
		}
		System.out.print("Binary :  ");
		for(int j = i-1; i>=0; i--){
			System.out.print(arr[i]);
		}		
	}
}