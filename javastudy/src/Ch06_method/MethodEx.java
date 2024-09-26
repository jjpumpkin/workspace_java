package Ch06_method;

public class MethodEx {

	public static void main(String[] args) {
		// 이름, 국어점수, 수학점수, 영어점수를 입력받아
		// 평균과 등급을 출력하는 메소드를 작성하시오
		// input :String, int ,int ,int
		// output: 없음
		// 등급은 평균90이상 A, 80이상 B, 나머지 C
		// xxx님의 평균은(소수점2째 자리까지 출력) 으로 y등급 입니다.
	   
		// 함수호출 예
		// makecard("팽수", 100, 100, 100);
		// 팽수님의 평균은 100.0 으로 A등급 입니다.
		makecard("펭수", 80, 90, 60);
		}
     public static void makecard(String nm, int kor, int math , int eng) {
    	 
    	 double avg =(kor + math + eng) / 3.0;
    	 String grade = "c";
    	 if (avg >=90) {
    		 grade = "A ";
    	 }else if (avg>= 80) {
    		 grade = "B";
    	 }else if (avg >=70) {
    		 grade ="C";
    	 }else if (avg >=60) {
    		 grade= "D";
    	 }else {
    		 grade="F";
    	 }
    	   System.out.printf("%s님의 평균은 %.2f으로 %s 등급 입니다.", nm, avg, grade);
       }
}
