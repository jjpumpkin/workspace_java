package practics;

import java.util.Scanner;

public class Result03 {

	public static void main(String[] args) {
		// q.3 업다운 게임
		// 1~50 사이의 랜덤 정수 생성
		int randInt =  (int) (Math.random() *50+1); // Math . random() <-- 난수 생성 메소드 0~1 사이 실수
     System.out.println(randInt);
     int chance = 5;
     while(true) {
    	 System.out.println("기회는 :" + chance);
    	 if(chance==0) {
    		 break;
    	 }
    	 System.out.println("기회는 :"+ chance);
    	 chance--;
        /*
         *  업다운 게임 만들기   	 
         */
          Scanner sc = new Scanner(System.in);
          System.out.println("===========");
          System.out.println("업다운 게임 시작");
          System.out.println("===========");
          System.out.println("랜덤 숫자 생성");
          
          int a = (int)(Math.random()*50)+1;  //1~50까지의 숫자 중 하나
          System.out.println(a); //일치하는지 확인하기 위해
          Scanner scan = new Scanner(System.in);
          int Chance = 5;   
          while (true) {
        	  System.out.println("숫자를 입력하세요.");
        	  int userPick = Integer.parseInt(scanner.nextLine());
        	  if(userPick == randInt) {
        		  System.out.println("정답입니다.");
        	  }
        	  chance --;
        	  if(chance ==0) {
        		  System.out.println("실패하였습니다....정답은"+randInt+"입니다.");
        		  break;
        	  }
        	  if(userPick <randInt ) {
        		  System.out.println("업!!! 기회가" + chance + "남았습니다.");
        	  }else if(userPick > randInt) {
        		  System.out.println("다운!!! 기회가" + chance + "남았습니다.");	  
        	  }
          }
          scanner.close();
     }
     
     
     
     
     
     
     
     
     
     
     
     
	}

}
