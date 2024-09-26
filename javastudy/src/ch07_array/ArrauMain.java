package ch07_array;

/**
 * class Name: ArrauMain
 * Author    : 202-1
 * Created Date: 2024. 8. 9.
 * Version : 1,0
 * Purpose :
 * Description:
 */
public class ArrauMain {

	public static void main(String[] args) {
	 String samjang = "삼장" ;
	 String ogong = "오공" ;
	 String saojeong = "사오정";
	 String palgye = "저팔계";
	 
	 //배열(array)
	 // String[] 문자열 배열
	 String [] seoyugi = new String[4]; //첨자는 배열의 크기
	 System.out.println(seoyugi.length); //배열의 길이를 리턴
	 System.out.println (seoyugi[0]); //null 값이없음을 의미함.
	 System.out.println (seoyugi);
	 
	 seoyugi[0] =samjang;
	 seoyugi[1] = ogong;
	 seoyugi[2] = saojeong;
	 seoyugi[3] = palgye;  //인덱스로 같은 타입의 데이터를 할당 및 수정가능
	 printArr(seoyugi);
	 
	 int[]numbers = new int [3];
	 System.out.println(numbers[0]);  //defalut 0을 가짐, String은 null
	 boolean [] bools = new boolean[5];
	 System.out.println(bools[0]);    //default false를 가짐
	 
	 // seoyugi 요소에 서유기 라는 이름을 앞에 붙여줘야함.
	 for(int i = 0; i<seoyugi.length; i++) {
		 // 배열의 첫 요소에서 부터 순회하며 변경
		 seoyugi[i] = "서유기" + seoyugi[i];
	 }
	 printArr(seoyugi);
	 
	 //오공이 포함되어 있는 배열의 요소를 찾아서 서유기 -> '드래곤볼' 로 변경하시오.
	 for(int i = 0; i < seoyugi.length ; i++) {
		 //string.contains("포함문자열") string 에서 '포함문자열'이 있으면 true, 없으면 false를 리턴.
		 if(seoyugi[i].contains("오공"))	 {
		  System.out.println(i+":" + seoyugi[i]);
		  // string. replace("찾는 문자열", "변경문자열") string에서 '찾는문자열'을 찾아서 '변경문자열'로 변경
		  //만약 변경하고자하는 통일 문자열이 많다면 replaceAll <-- 전체다
		  seoyugi[i] = seoyugi[i].replace("서유기", "드래곤볼");
		}
	 }
	 printArr(seoyugi);
	 
	 //값을 할당하며 배열선언
	 String[] students = ("팽수", "길동", "동길", "길수");
	 //String[] students= new String[] {"팽수, "길동", "동길", "길수"}; dnldhk ehddlfgka
	 printArr(students);
	 String subjects = "JAVA, DB, JS, HTML";
	 // ','을 구분으로 배열에 담기
	 // 대상문자열. split(구분자)
	 String[] subArr = subjects.split(",");
			 printArr(subArr);
	 // 문자열 양쪽 공백제거 string.trim();
	 for(int i = 0; i< subArr.length; i++);
	 subArr[i] = subArr[i].trim(); //각 요소에 공백을 제거 
 }
	
	//배열으 복사1.얇은 복사 shallow copy(주소값 복사)
	printArr(seoyugi);
	String[] seoyugi - seoyugi; //주소가 복사됨.
	printArr (sinseoyugi);
	sinseoyugi[0] = "강호동"; //동일 주소이기 때문에 값 변경시 두 변수이 값이 다 변경되어 보임
	printArr(seoyugi);
	printArr(sinseoyugi);
	//배열의 복사2. 깊은 복사(deep copy) 새로운 객체(주소가 다름)
	String[] newseoyugi = seoyugi.clone();
	newseoyugi[2] = "은지원";
	printArr(seoyugi);
	printArr(sinseoyugi);
	//deep copy 까먹음?
	String [] copy= new String[seoyugi.length]; //새로운 배열객체를 복사 대상 객체의 길이만큼으로 선언
	for(int i = 0; i <seoyugi.length; i++) {
		copy[i] = seoyugi[i];
	}
	
	//일차원 배열
	int[] oneD= {1,2,3};
	System.out.println(oneD[1]);  //2
	// 다차원 배열
	int [][] twoD = {{1,2,3},
					{4,5,6},
					{7,8,9}};
	System.out.println(twoD[0][1]); //2
	
	int [][][] threeD = {{{1,2,3},{4,5,6}},{{7,8,9},{10,11}}};	
	System.out.println(threeD[0][0][1]);
	
	for(int i= 0;  < twoD.length; i++) {
//		printArr(twoD[i]);
		for(int j =0; j<twoD[i].length; j++) {
			System.out.println(twoD[i][j]);
		}
     }
}
	
	
	
	
	
  public static void printArr(int[]strArr) {
	 for(int i = 0; i < strArr.length; i++) {
		 if(i== strArr.length  -1) {
			 System.out.println(strArr[i]);
			 break;
		 }
		 System.out.println(strArr[i] + ",");
	   }
    }
  }
