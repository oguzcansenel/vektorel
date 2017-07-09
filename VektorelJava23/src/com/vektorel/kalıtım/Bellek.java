package com.vektorel.kalýtým;

public class Bellek extends FlipFlop {
	int kapasite = 128;
	@Override
	public void kacAdet(int deger) {
		super.kacAdet(deger);
		System.out.println("Þu kadar belleðe ihtiyaç var:"+ deger/kapasite);
		
	}

}
