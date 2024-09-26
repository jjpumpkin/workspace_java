package ch07_array;

public class ArrayEx2 {

	public static void main(String[] args) {
		// 	Q. 월리를 찾아라!!
		//  findwally에는 월리가 몇개 들어있는지 출력해주세요
	 String findwally = "윌리울리일리울리울리일리월리일리윌리월리울리일리일리월리일리윌리일리윌리일리월리월리윌리울리윌리울리일리울리울리윌리일리";								
	 int count = 0;
	 int count2 = 0;
	 int all = findwally.length();
	 int after= findwally.replaceAll("월리", "").length();
	 count = (all - after)/2;
	 System.out.println("월리는 총:" + count);
	 
	 for(int i=0; i< findwally.length ()-1; i++) {
		String subwally = findwally.substring(i, i+2);
		if(subwally.equals("월리")) {
			count2 +=1;
		}
	 }
	 System.out.println("월리는 총:"+count);
	 
	 
	 
	 
	 

	
	
	}

}
