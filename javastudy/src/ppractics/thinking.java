package ppractics;
 
import java.util.Scanner;
public class thinking {
public static void main (String[] args) {


 //1.증감연산자
//int num = 10;
//num++;
//System.out.println("++이후:"+ num); // ++이후 11
//num--;
//System.out.println("--이후:"+ num);  //--이후 10

int num= 10;
int a,b;

a = num++;
System.out.println(a);
b = ++num;
System.out.println(b);
System.out.printf("a:%d,b:%d \n", a, b);

//상속 물려받아서 tostring 재정의
//상속받을땐 extend 키워드 사용
//상속받는 클래스는 자식 클래스 , 
//상속 해주는 클래스 부모클래스
// super 부모클래스부터 상속받은 필드나 메소드를 자식 클래스에 참조
// 슈퍼 가로닫기는 부모 생성자
// 메소드 오버라이딩
//자식 클래스에서 부모클래스 메소드 재정의
// 다형성 클래스 변수의 다형성은
// 객체간 형 변환
//int를 or로 바꾸거나 객체들 사이에 형변환
//부모를 상속받아서 자동으로 코드의 재사용성 올림
//child 필드는 없음 상속받아서 사용할수있음
//}this 는 나의 생성자고  두가지방법을 되게끔 super 부모님꺼 있는거 참고
//타입변환 주의점 자식만 가지고있으면 변환 불가능
//다운캐스팅 이후는 변환가능

// 추상 클래스는 무조건 구현 해야함
// 반드시 상속을 통해서
//round pi 는 퍼플릭 스태틱이다
// 확률 메서드 random값을 해
// 커넥션 객체는 이미 오픈에 요청을함


Scanner scan = new Scanner (System.in);
System.out.println("숫자를 입력하세요(정수)");
System.out.println(">>>");
// if 문을 사용하여 짝수이면 "짝수" (산술 연산자 사용) / 홀수이면 홀수

int idx = Integer.parseInt(scan.nextLine());

if( idx%2== 1) {
	System.out.printf("%d는 %s입니다.", idx, "홀수");
}else {
	System.out.printf("%d 는 %s입니다.", idx ,"짝수");
	
	
	int num1 = 298;
	String test = num1 +"";
	
	
	int st1 = num /100;
	System.out.println(st1);
	int st2 = (num/10) - (st1*10);
    System.out.println(st2);	
	
	
	
	//인터페이스를 구현하는거는 다른걸 상속받을수있다. extends 를 할수있어서
}//어레이 리스트는 인덱스로 제거   
}
}




