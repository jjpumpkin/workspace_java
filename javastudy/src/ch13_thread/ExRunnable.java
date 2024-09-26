package ch13_thread;

public class ExRunnable implements Runnable {
	int num;
	String name;
	

	public ExRunnable(int num, String name) {
		super();
		this.num = num;
		this.name = name;
	}

	@Override
	public void run() {
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
