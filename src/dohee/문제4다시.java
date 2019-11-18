package dohee;

public class 문제4다시 {

	public static void main(String[] args) {
		for (int i=0; i<10 ; i++) {
			for(int j=0;j<10;j++) { 
				// i가 1일때 j가 0일때 거짓이어야함. 그래야 X가 출력 
				// i1= <  j0
				if(i<=j){
					System.out.print("O");
				}else {
					System.out.print("x");
				}
				
			}System.out.println("");
		}

	}

}
