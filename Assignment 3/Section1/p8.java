class p8{
	public static void main(String args[]){
		for(int i=1; i<=5; i++){
			for(int j=5; j>i; j--){
				System.out.print(" ");
			}
			int m = 6-i;
			for(int k=1; k<=i; k++){
				System.out.print(m + " ");
				m++;
			}
		System.out.println();
		}
	}
}

/*     
	5
   4 5
  3 4 5
 2 3 4 5
1 2 3 4 5 
*/