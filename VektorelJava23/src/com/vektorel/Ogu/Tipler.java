package com.vektorel.Ogu;

public class Tipler {
	public static void main(String[] args) {
		byte bb = 3;
		byte cc = 4;
		byte gg = (byte) (bb+cc);
		System.out.println(gg);
		short ss;
		int ii;
		long ll = 51;
		
		float ff = 1.5f;
		double dd;
		char ccc = 'c';
		
		String sss = "balgat";
		
		toplama(2,5);
		carpma(3,8);
		bölme(6,3);
		kokAlma(9);
		usAlma(4,5);
		delta(2,3,4);
		kokBulma(2,1);
	}
	static void toplama(int a, int b) {
		int sonuc = a + b;
		System.out.println(sonuc);
	}
	
	static void carpma(int a, int b) {
		int sonuc = a * b;
		System.out.println(sonuc);
	}
	
	static void bölme(int a, int b) {
		int sonuc = a / b;
		System.out.println(sonuc);
	}
	
	static void kokAlma(int a){
		int sonuc = (int) Math.sqrt(a);
		System.out.println(sonuc);
	}
	
	static void usAlma(int a, int b){
		int sonuc = (int) Math.pow(a, b);
		System.out.println(sonuc);
	}
	
	static int delta(int a,int b,int d){
		double ust = Math.pow(b, 2);
		double c = (ust - (4 * a * d));
		int sonuc = (int) Math.sqrt(c);
		return sonuc;
	}
	
	static void kokBulma(int a,int b){
		int sonuc2 = (-b + delta(6, 9, 2)) / (2 * a);
		System.out.println(sonuc2);
	}
	
}
