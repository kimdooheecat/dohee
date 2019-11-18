package dohee;

public class 과제 {

	public static void main(String[] args) {
		
		int[] 배열= {8,3,4,6,2,7,5,1,9};
		//{1,2,3,4,5,6,7,8,9}
		//{1,3,4,6,2,7,5,8,9}
		for (int i= 0; (i<배열.length-1); i++) {
	//		System.out.println(배열[i]);
			int m = i;
			//비교 후 결과 가져오기 반복문 
			for(int j=i+1;j<배열.length ;j++) {
				if(배열[m] > 배열[j]) {
					m = j;
				}
				
			}
			
			//배열의 값 교체
	//		System.out.println(배열[m]);
			int 임시 = 배열[i];
			배열[i]  = 배열[m];
			배열[m]  = 임시;
		}
		for (int index = 0; index < 배열.length; index++) {
			System.out.println(배열[index]);
		}
	}

}
