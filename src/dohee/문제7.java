package dohee;

public class 문제7 {

	public static void main(String[] args) {
		for(int i=0; i<10; i++) {
			for(int j=0;j<10;j++) {
				if(j<=(9-i)) {
				System.out.print("O");
				} else { 
					System.out.print("x");
				}
			}System.out.println("");
		}

	}

}