package com.javaex.ex03;

public class DigitImpl implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 9; i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);

			} catch (InterruptedException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}

	}

}
