package ch01_start;

public class Hello {
		// 라인주석 "ctrl+ /"
		// ctrl+ or ctrl - 글자 크기 조정

	public static void main(String[] args) {
		// main 은 코드 실행문 (필수로 존재 해야함)
		// 단축키 F11(실행)
		String str ="Say hello";
		System.out.println("Hello world");
		System.out.println(str);
		
		int i =90;
		int j = 80;
		int k = 70;
		int avg = (i+j+k)/3;
		System.out.println(avg);
		System.out.println((i+j+k)/3);
		
		// System.out = 터미널에 출력
		// 자동완성 기능 = ex)main +ctrl + space
		// ctrl + alt + 아래키 (해당라인 복사)
		// ctrl + d 해당라인 지우기
		// ctrl + shift + f (자동 정렬)		
	}
}