package ch08_collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * class Name: CollectionList
 * Author    : 202-1
 * Created Date: 2024. 8. 12.
 * Version : 1,0
 * Purpose :Java Collections
 * Description:ArrayList
 */
public class CollectionList {

	
	public static void main(String[] args) {
		/*
		 * 컬렉션 프레임워크는 데이터를 보다 쉽게 다룰 수 있도록 재사용 가능한 컬렉션 클래스를 제공함.
		 * Lust, Set, Map
		 * 1.List : 순서대로 객체를 저장하는 구조, 중복된 원소를 허용
		 *          원소에 접근하기 위해 인덱스를 사용,
		 *          ArrayList , LinkedList
		 * 2.Map  : key 와 value 쌍으로 이루어진 객체를 저장하는 구조
		 *          key는 중복될 수 없으며 각 키는 하나의 값을 가리킴,
		 *          HashMap , TreeMap
		 * 3.Set  : 중복을 허용하지 않는 객체의 모음 원소의 순서는 보장하지 않음,
		 *          HashSet, TreeSet
		 **/
		 // ArrayList (동적 배열 형태)
			ArrayList<String> students = new ArrayList<>();
			//<> <-- 이 부분은 재네틱(Generic) 이라하며 코드에서 타입의 안정성을 보장할 수 있으며
			// 불필요한 캐스팅을 줄이기위해 만들어짐, 재네릭은 객체(참조타입)만 담을 수 있음
			// 기본타입 (int, boolean ...)은 	Wrapper class를 사용 Integer, Boolean
			students. add ("팽수"); //add 요소추가
			students. add ("동길");
			students. add ("길수");
			System.out.println(students);
			System.out.println(students.get(1));  //get(인덱스) 인덱스로 접근
			students. add (1, "팽순");  //set(인덱스, 변경값) 요소 수정
			System.out.println(students.contains("길동"));   // 리스트 안에 해당 값이 존재하면 true , 아닐경우 false 
			System.out.println(students.indexOf("동길"));    // 리스트 안에 해당 값이 존재하면 index 없으면 -1
			System.out.println(students.size());            // 리스트의 요소 수 
			System.out.println(students.isEmpty());         // 리스트가 비어있는지 true/false 
		    students.remove("동길");                         // 해당값이 있으면 삭제 없으면 아무일도 안일어남.
		    students.clear();                               // 리스트 비율(size 0)
		    System.out.println(students);
		    
		    students.add("강민호");
		    students.add("권철규");
		    students.add("김윤아");
		    students.add("김정인");
		    students.add("김혜원");
		    students.add("박정호");
		    students.add("서원빈");
		    students.add("안서령");
		    students.add("이소희");
		    students.add("이승욱");
		    students.add("이원호");
		    students.add("전영범");
		    students.add("전종화");
		    students.add("정도현");
		    students.add("최대준");
		    students.add("최지은");
		    students.add("한준희");
		    
		    //기본 for
		    for(int i = 0 ; i <students.size(); i ++) {
		    	System.out.println(students.get(i));
		    }
		    // 향상된 for문(value만 필요할때)
		    for(String str: students) {
		    	System.out.println(str);
		    }
		    // 1.리스트 복사(얕은 복사)
		    ArrayList<String> stu = students;
		    stu.set(0, "민호");
		    System.out.println(students);
		    System.out.println(stu);   //얕은 복사는 주소를 복사하는(공유하는) 때문 둘다 같음
		    //2.깊은 복사1
		    ArrayList<String> stu2 = new ArrayList<>(students);
		    //2. 깊은 복사2
		    ArrayList<String> stu3 = new ArrayList<>();
		    stu3.addAll(students);
		    stu2.set(0, "Kang min ho");
		    stu3.set(0, "min ho");
		    System.out.println(students);
		    System.out.println(stu2);
		    System.out.println(stu3);
		    
		    //정렬
		    // dafalut 오름차순 숫자 >ABC >abc > 가나다 순으로 정렬
		    Collections.sort(stu3);
		    System.out.println(stu3);
		    // 내림차순 정렬 (오름차순 반대로 정렬됨)
		    Collections.sort(stu3,Comparator,reverseOrder());
		    System.out.println(stu3);
		    // 선언 & 값 할당.
		    ArrayList<Integer> numbers = new ArrayList <>(Arrays.asList(10,20,11,190,99,1));
		    System.out.println(numbers);
		    Collections.sort(numbers);
		    System.out.println(numbers);
		    //향상된 for문 앞에 각 요소의 타입
		    for(int num: numbers) {
		    System.out.println(num);
		    }

	}

}
