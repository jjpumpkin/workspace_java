package ch05_conditional;

import java.util.Scanner;

public class LoopWhile {

	public static void main(String[] args) {
	 // while(조건식) 조건이 true이면 반복 (무한투표 조심해야함,
		int i = 1;
		
		while(i<=10) {
			System.out.println(i);
			i++;
		}
      Scanner scan = new Scanner(System.in);
      boolean flag = true;
      while(flag) {
    	  System.out.println("========");
    	  System.out.println("이름을 입력하시오.(종료q)");
    	  String nm = scan.nextLine();
    	  if(nm.equals("q")) {
    		   flag=false;
    	  }else {
    		    System.out.println(nm+"님 황영합니다.");
    	  }
    	  System.out.println("========");
    	
      }
      // while문으로 2~9단을 출력하시오
      int dan =2;
      while (dan <=9 ) {
    	  System.out.println(dan+"단");
           int su =1;
    	   while(su <=9) {
     System.out.printf("%d x %d = %d \n" , dan,su,(dan*su));
          su++; 
          }
    	 dan++; 
      }
      }
}
      
// 변수의 사용 scope 잘 생각하세요.