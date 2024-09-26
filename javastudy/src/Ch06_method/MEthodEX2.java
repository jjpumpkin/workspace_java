package Ch06_method;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.Scanner;

public class MEthodEX2 {

	public static void main(String[] args) {
		
	}
     // input: 고객수
	 // output: 없음
	 // 고객수만큼 커피 주문을 받아 금액을 출력하는 메소드 생성.
	
	public static void shop (int num) {
		Scanner scan = new Scanner(System.in);
		int i = 0;
		while(num > i) {
			//주문 받기
			System.out.println(i+1); ("번째 고객님 어떤걸 드릴까요");
			String order = scan.nextLine();
		}
		scan.close();
		System.out.println(num+"고객 주문완료.");
		int price = 0;
        // 2. 조건문
        switch (order) {
        case "아아":
        case "아메리카노":
        	price=3000;
        	break;
        case "카푸치노":
        	price=4500;
        	break;
        case "밀크티":
        	price=5000;
        	break;
        default:
        	System.out.println("메뉴가 없습니다.....");
        	break;	
        }		
	}
}
