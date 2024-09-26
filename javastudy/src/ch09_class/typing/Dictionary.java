package ch09_class.typing;

import java.util.ArrayList;

public class Dictionary {
     // 전역적으로 사용하는 상수
	public static final int option_student_name =0; //보통 상수는 대문자로
	public static final int option_coding_word  = 1;
	public static final int option_randim_alphabet = 2;
	//클래스 점명으로 사용가능 스태틱
	
	//타자연습 게임을 위한 단서 생성기
	public static ArrayList<String> makewordList (int option) {
		ArrayList<String> result = new ArrayList<String>();
		// option 0 학생이름, 1 코딩용어 , 2랜덤 알파벳
		if(option == option_student_name) {
		    result.add("kim pangsu");
		    result.add("kang minho");
		    result.add("kwon cheolgyu");
		    result.add("kim yoona");
		    result.add("kim jungin");
		    result.add("kim hyewon");
		    result.add("park jungho");
		    result.add("seo wonbin");
		    result.add("ahn seoryeong");
		    result.add("lee sohee");
		    result.add("lee seungwook");
		    result.add("lee wonho");
		    result.add("jeon youngbeom");
		    result.add("jeon jonghwa");
		    result.add("jung dohyun");
		    result.add("choi daejun");
		    result.add("choi jieun");
		    result.add("han junhee");
		    
		    
		    public static ArrayList<String> makewordList (int option) {
				ArrayList<String> result = new ArrayList<String>();
				if(option ==option_coding_word) {
					result.add("asfjasf");
				
					
					
		     
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		}else if (option == option_coding_word) {
			   result.add("class");
			   result.add("static");
		
		 }else if (option == OPTION_RANDOM_ALPHABET) {
			 // 랜덤 알파벳 6자리
			 // 10개 생성
			 String [] alphabet = "qwertyuiopasdfghjklzxcvbnm".split("");
		 }
		return result;
		 }
	}
		
		
		
		return result;
	}
}
