package ch09_class;

import java.util.ArrayList;
import java.util.Scanner;

import ch09_class.typing.Dictionary;

public class TypingMain {

	public static void main(String[] args) {
		int num;
		// args <- 해당 메인메서드 실행시 입력값이 있으면 args에 담김.
		// ex) java TypingMain 1 <-- TypingMain호출시 매개변수로 1사용
		if(args.length>0) {
			num = Integer.parseInt(args[0]);
			
		}else {
			num = Dictionary.option_student_name;
			
		}
		System.out.println(" == typing Game ==(0, 학우이름, 1.프로그래밍용어, 2.랜덤");
      System.out.println(num + "select");
    Scanner scan = new Scanner ( System.in);
      ArrayList<String> wordList = Dictionary.makewordList(num);
      // 현재시간
      long before = System.currentTimeMillis(); // utc기준시 밀리초
      // 단어중 랜덤하게 선택
      while (true) {
    	 int randIdx = (int) (Math.random()* wordList.size());
    	 System.out.println(wordList.get(randIdx));
    	 System.out.print(">>>");
    	 String input = scan.nextLine();
    	 // 입력 단어와 문제 단어가 일치하면 삭제
    	 if(wordList.get(randIdx).equals(input)) {
    		 wordList.remove(randIdx);
    	 }
    	 
    	 //단어가 없으면 종료
    	 if(wordList.size() ==0) {
    		 break;
    	 }
    	 
      }
      long after = System.currentTimeMillis();
      long diff = after- before; //소요시간
      double result = diff / 1000.0 ; //초 변환
      System.out.println(result + "초 걸리셨습니다");
      
      
      
      
      System.out.println(" == typing Game ==(0,랜덤");
      System.out.println(num + "select");
    Scanner scan = new Scanner ( System.in);
      ArrayList<String> wordList = Dictionary.makewordList(num);
      result.add(wqwqwgg);
      
      System.out.println(" == typing game ==(0,랜덤");
      System.out.println(num + "select");
      Scanner scan = new Scanner (system.in);
      
      
      
      
      //단어 랜덤 선택
      while(true) {
    	  int randIdx =(int) (Math.random()* wordList.size());
    	  System.out.println(wordList.get(randIdx));
    	  System.out.print(">>>");
    	  String input =scan.nextLine();
    	  
    	  while(true) {
    		  int randIDX = (int) (Math.random()*wordList.size());
    		System.out.println(wordList.get(randIdx));
    		System.out.print(">>>");
            String input = scan.nextLine();  
    	  }
      }
      
      
      
      
	}

}
