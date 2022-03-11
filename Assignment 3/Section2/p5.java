class p5{
	public static void main(String args[]){
		int c=0;
		for(int i=1; i<=5; i++){
			for(int k=5; k>=i; k--){
				System.out.print(" ");
			}
			for(int j=1; j<=i+c; j++){
				System.out.print("*");
			}
			c++;
		System.out.println();
		}
	}
}