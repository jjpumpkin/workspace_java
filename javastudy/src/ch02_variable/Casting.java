package ch02_variable;

public class casting {

	public static void main(String[] args) {
		//문제1 a 를 정수로 선언해서 10을 할당해라
		int a= 10;
		//문제2 b를 실수로 선언해서 a를 할당해라
		double b = a; //자동 형변환 작은단위 -> 큰단위
		System.out.println(b);
		double c = 10.5;
//		int d = c; 자동 형 변환이 불가능
		int d = (int) c; // 명시적 형변환
		
		
		//타입변환
		//정수 to 문자열
		int num = 123;
		String str = String.valueOf(num);
		System.out.println(str);
		
		//문자열 to 정수
		String str2 = "123"; 
		int num2 = Integer.parseInt(str2);
		System.out.println(num);

		
		
		
		
	}

}
