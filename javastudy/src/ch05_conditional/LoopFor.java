package ch05_conditional;

public class LoopFor {
     public static void main(String[] args) {
	 // for문 (1.초기화 식; 2.조건식; 4.증감식)
    	 //        3.실행문 순서로 반복됨
    	for(int i=1; i<=10; i ++) {
    		System.out.println(i);
    		}
    	 //1~10까지의 합은?
    	 int sum = 0;
    	 for(int i =1; i <=10; i ++) {
             sum +=i;
    		 
    	 }
    	 System.out.println("1~10을 더하면:" + sum);
    	 
    	 //21~45를 더하면?
    	 int sum2 = 0;
    	 for(int i =21; i<=45; i ++) {
    		 sum2 +=i;
    	 }
    	 System.out.println("21~45을 더하면:" + sum2);
    	 // 1~40 까지 중에 짝수만 더한 값은?
    	 // 1.반복문 만들기
    	 int sum3 =0;
    	 for(int i =1; i <=40; i ++) {
    		 // 2.특정 짝수일 경우 더하기 
    	     if (i % 2 == 0) {
    	    	 System.out.print(i);
    	    	  sum3 +=i;
    	     }
    	 }
    	 // 3.출력
    	 System.out.println();
    	 System.out.println("1~40까지 중 짝수의 합은:" + sum3);
    	 
    	 // 초기값을 0부터 시작해서 10번 * <-- 프린트하시오.
    		 for (int a =0; a<10; a ++) {
    			 System.out.println("*");
    		 }  		  
    		  //구구단 출력
    		  int dan =9;
    		  for(int i=1; i <=9; i ++)  {
        System.out.printf("%d x %d = %d \n", dan, i, dan* i);
    		  }
        // 10부터 1까지
        for(int i =10; i >=1; i-- ) {
        	System.out.println(i);
        	}
        // 5씩 증가
        for(int i = 1; i <=100; i+=5) {
        	System.out.print(i);
        	System.out.print(" ");
        }	
        // 2~9단 출력
        for(int i =2; i <=9; i ++)  {
        	System.out.println(i+"단");
        for(int j=1; j<=9; j ++)   {
        	System.out.printf("%d x %d = %d \n", i , j,i*j);
        
        	}
        }
   // break문 -> 반복문 내에서 break 문이 실행되면 반복문이 즉시 종료됨;
        
   // 1~n 까지 더한 값이 100 이상이 되는 지점의 n을 구하시오.
        int sum5= 0;
        for(int i=1; i<9999; i++)  {
        	sum5 +=i;
        	if(sum5 >=100) {
        		System.out.println("100 이상이 되는 n:" + i);
        		break;
         }	
        }
       
      outer:
    	  for(int i = 0; i <5 ; i++) {
    		  System.out.println("메인 for" + i);
    	   for(int j = 0; j <5 ; j ++) {
    		   System.out.println("서브 for" + j);
    		   if(j==2) {
    		   
    			   break ;
    		   }
    	   }
    	  }
     }
}
    	  
    	  
     
     
    	  
      
     
     
     
     
     


