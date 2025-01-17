package ch13_thread;

public class ThreadMain {
	public static void main(String[] args) {
		
		print(20);
		print(100);
		// 1.Thread 상속받아서 사용.
		ExThread ex1 = new ExThread (20,"job1");
		ex1.start(); //rub 메소드 실행
		ExThread ex2 = new ExThread2 (100,"job2");
		ex2.start();
		
		// 2 .Runnable 인터페이스 구현 클래스 사용
		ExRunnable exRun1 = new ExRunnable(300,"JOB3");
		Thread job3 = new Thread(exRun1);
		job3.start();
		
		//3.람다식 사용
		Thread job4 = new Thread(()-> {
			int num = 600;
			for(int i = num; i <= num+5; i++) {
				System.out.println("job4" +i);
				try {
					Thread.sleep(500);
				}catch(InterruptedException e) {
					e.printStackTrace();
				}
		});
		job4.start();
			
		
		
		System.out.println("메인 스레드 종료");
}

	public static void print(int num) {
		for(int i = num; i <= num+5 ;  i++) {
			System.out.println(i);
			try {
				Thread.sleep(500);
			}catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	}
}
