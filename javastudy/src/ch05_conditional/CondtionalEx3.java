package ch05_conditional;

import java.util.Scanner;

public class CondtionalEx3 {

	public static void main(String[] args) {
		// 커피주문
		// 아아 or 아메리카노 : 3000
		// 카푸치노: 4500
		// 밀크티 : 5000 만약 해당 메뉴가 없으면 "메뉴 없습니다." 출력
		
		//1.주문하기
		//2.조건문
	    //3.해당조건의 값 할당
		//4.출력
		Scanner scan = new Scanner(System.in);
        System.out.println("어떤걸 드릴까요");
        String order = scan.nextLine();
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
        if ( price > 0) {
       System.out.println("선택한 음료는" + price + "원 입니다");
        }
      scan.close(); 		
	}
}
