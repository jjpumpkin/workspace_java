package ch05_conditional;

public class ConditionalEx4 {

	public static void main(String[] args) {
	 /*
	  * 거꾸로 트리플 5층 만들어 주세요.
	  실행결과
	  *****
	  ****
	  ***
	  **
	  *
	  
	  **/
	  String star = "*****";
	  //반복문 사용
	  for(int i =5; i >0; i --) {
		  String substr = star. substring(0,1);
		  System.out.println(substr);
	  }
      for(int i = 5; i >0; i -- ) {
    	  for(int j = 0 ; j <i ; j ++) {
    		  System.out.print("*");
    	  }
    	  System.out.println();
      }
	}
	

}
