class p16{
	public static void main(String args[]){
		for(int i=0; i<5; i++){
			for(int k=4; k>=i; k--){
				if(i==0 && k ==4)
					System.out.print("  ");
				else 
					System.out.print(" ");
			}
			System.out.print("*");
			for(int j=1; j<=i; j++){
				if(i == 4)
					continue;
				System.out.print(" ");
			}
			if(i>0)
				System.out.print("*");
			if(i==4)
				System.out.print("****");
		System.out.println();
		}
	}
}
/* 
      *
    * *
   *  *
  *   *
 ****** */