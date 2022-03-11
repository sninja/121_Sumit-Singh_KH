class p7{
	public static void main(String args[]){
		int c=0;
		for(int i=1; i<=4; i++){
			for(int k=5; k>i; k--){
				System.out.print(" ");
			}
			for(int j=1; j<=i+c; j++){
				System.out.print("*");
			}
			c++;
		System.out.println();
		}
		for(int i=1; i<=5; i++){
			for(int k=1; k<i; k++){
				System.out.print(" ");
			}
			for(int j=1; j<=6-i; j++){
				System.out.print("*");
			}
			for(int j=5; j>i; j--){
				System.out.print("*");
			}
		System.out.println();
		}
	}
}
/* 
    *
   ***
  *****
 *******
*********
 *******
  *****
   ***
    * 
*/