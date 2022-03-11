class p2{
	public static void main(String args[]){
		int n = 65;
		for(int i=1; i<=5; i++){
			n = 65;
			for(int j=1; j<=i; j++){
				System.out.print((char)n + " ");
				n++;
			}
		System.out.println();
		}
	}
}
/* 
A
A B
A B C
A B C D
A B C D E */