package dohee;

public class 문제5 {

	public static void main(String[] args)  {
		
		for(int i = 0; i <10 ; i++) {
				for(int j=10; j>0; j--) {
					if(j >i) {
					  System.out.print("O");
					  } else {
						  System.out.print("X");
				}
				  
			}System.out.println("");
		}
		}
	}