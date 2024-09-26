package ch07_array;

public class ArrayEx {

	public static void main(String[] args) {
	 	// 문자편집 단축키 : shift + alt + a
		// 우리반 학생들의 이름이 담긴 string [] 선언
	  // 우리반 학생들의 이름을 출력하시오.
	


           String[] students = {"강민호", "권철규", "김윤아", "김정인", "김혜원",   
        		                "박정호", "서원빈", "안서령", "이소희", "이승욱",	 
                                "전영범",	 "전종화", "정도현","최대준", "최지은", "한준희"};
           
         //우리반 학생들의 이름을 출력하시오.
          for(int i =0 ; i < students.length; i ++) {
        	  System.out.println(students[i]);
          
          
          // 학생들의 이름에 출석부 순번을 붙여주세요 1.강민호 2.권철규 ....
//          for(int i = 0; i < students.length; i ++) {
//        	  System.out.println(i+1)+"." + students[i];
          
          


          // Q. 같은 성 찾기 메소드를 작성해주세요 !
          // input : String, String []
          // output: x
          // 전달받은 배열에서 전달받은 성씨의 인원수를 출력하시오
          // 호출: searchNM:("이",students)
          // 출력: '이'씨 성을 가진 동기분은 총 3명 있습니다.
          //      이소희씨, 이승욱씨, 이원호씨

          searchNAME("김",students);
          searchNAME("이",students);
          searchNAME("박",students);
          
          String[] students ={"김","이","박"} 
          searchNAME("이",students);
}
}
}

          
           
                  	