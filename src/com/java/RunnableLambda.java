package com.java;

public class RunnableLambda {

	public static void main(String[] args) {
		//------------- Anonymous inner class way
		Thread thread1 = new Thread( new Runnable() {
			
			@Override
			public void run() {
				System.out.println("inner class way running inside thread");
				System.out.println("inner class way  running inside thread");
				
			}
		});
		
		thread1.start();
		
		//-------------- Lambda way
		Thread thread = new Thread( () -> { 
			System.out.println("lambda way running inside thread");
			System.out.println("lambda way  running inside thread");
		});
		
		thread.start();

	}

}
