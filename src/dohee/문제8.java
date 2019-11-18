package dohee;

public class 문제8 {

	public static void main(String[] args) {
		for(int i=0; i<10; i++) {
			for(int j=0;j<10;j++) {
				
				// 0 <= 9-0=9 
				// 9 <=9-9=0
				if(j<=(9-i)) {
				System.out.print("O");
				} else { 
					System.out.print("x");
				}
			}System.out.println("");
		}

	}

}