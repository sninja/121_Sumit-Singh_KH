class p7{
	public static void main(String args[]){
		for(int i=0; i<5; i++){
			for(int j=4; j>i; j--){
				System.out.print(" ");
			}
			for(int k=1; k<=i+1; k++){
				System.out.print(k + " ");
			}
		System.out.println();
		}
	}
}