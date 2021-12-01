package com.nttdata.bootcamp;

public class Retry {
	private int contador=0;

	public int getContador() {
		return contador;
	}

	public void retry(){
		contador++;
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
