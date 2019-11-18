package dohee;

public class 문제3다시 {

	public static void main(String[] args) {
		for(int i = 0;i <10; i++) {
			for(int j=0; j<10;j++ ) {
				 // i = 0 일때 j가 1 일때  x가 출력이 되려면 거짓이러야 함. i0>=1j
				//  i j
				if(i>= j) {
					System.out.print("O");
				}else {
					System.out.print("X");
				}
				
			}System.out.println("");
			
		}
	}

}
