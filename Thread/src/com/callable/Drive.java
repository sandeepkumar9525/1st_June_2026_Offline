package com.callable;

class MyThread extends Thread {
	int x = 10;
	int y = 4;

	public MyThread(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	public int sum(int x, int y) {
		return x + y;

	}

	@Override
	public void run() {
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(sum(x, y));
	}
}

class Drive {
	public static void main(String[] args) {
		
		System.out.println("Drive.main()...START");
		
		MyThread st = new MyThread(4, 9);
		st.start();

		MyThread rt = new MyThread(7, 10);
		rt.start();
		
		System.out.println("Drive.main()...END");
	}
}
