package dohee;

public class 문제4 {

	public static void main(String[] args)  {
		
		for(int i = 0; i <10 ; i++) {
				for(int j=0; j<10; j++) {
					// 0 >=1
					if(j >=i) {
					  System.out.print("O");
					  } else {
						  System.out.print("x");
				}
				  
			}System.out.println("");
		}
		}
	}