class p18{
	public static void main(String args[]){
		for(int i=1; i<=5; i++){
			for(int j=65; j<=70-i; j++){
				System.out.print((char)j + " ");
			}
		System.out.println();
		}
	}
}
/* 
A B C D E
A B C D
A B C
A B
A */