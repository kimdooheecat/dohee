package dohee;

public class 문제3 {

	public static void main(String[] args) {
		
		for(int i = 0; i <10 ; i++) {
				for(int j=0; j<10; j++) {  // i도 고정이 되어야 함. 빈 것을 채우기 위해서  
					// i=0 일때 j=0 이여서 "O"가 출력
					// i=0 일때 j=1 이여서 "X"가 출력 이 되어야 해서 j <=i 이 와야 한다. 
					if(j <=i) {
					  System.out.print("O");
					  } else {
						  System.out.print("X");
				}
				  
			}System.out.println("");
		}
		}
	}
	 
	
/* 비어 있는 것 때문에 if문이 필요 하다. 
 * */
	

	