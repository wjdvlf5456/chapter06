package com.javaex.ex02;

public class LowerThread extends Thread {

	public void run() {
		for (char ch = 'A'; ch < 'Z'; ch++) {
			System.out.println(ch);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

}
