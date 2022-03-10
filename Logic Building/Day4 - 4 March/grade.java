import java.util.Scanner;
class grade{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter marks");
		int marks = sc.nextInt();
		String s = null;
		if(marks < 50)
			s = "fail";
		else if(marks >=50 && marks < 60)
			s = "D grade";
		else if(marks >=60 && marks < 70)
			s = "C grade";
		else if(marks >=70 && marks < 80)
			s = "B grade";
		else if(marks >=80 && marks < 90)
			s = "A grade";
		else if(marks >=90 && marks < 100)
			s = "A+ grade";
		else 
			s = "invalid input";
	System.out.println(s);	
	}
}