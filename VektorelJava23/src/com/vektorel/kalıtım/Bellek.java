package com.vektorel.kal�t�m;

public class Bellek extends FlipFlop {
	int kapasite = 128;
	@Override
	public void kacAdet(int deger) {
		super.kacAdet(deger);
		System.out.println("�u kadar belle�e ihtiya� var:"+ deger/kapasite);
		
	}

}
