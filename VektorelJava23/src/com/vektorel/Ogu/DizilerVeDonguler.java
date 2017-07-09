package com.vektorel.Ogu;

public class DizilerVeDonguler {
	public static void main(String[] args) {

		fordongusu(10);
		whiledongusu(12);
	}

	static void fordongusu(int a) {
		for (int i = 0; i < a; i++) {
			int sonuc = (int) Math.pow(i, 2);
			System.out.println(sonuc);
		}
	}

	static void whiledongusu(int sayac2) {
		while (sayac2 > 0) {
			double sonuc2 = Math.sqrt(sayac2);
			System.out.println(sonuc2);
			sayac2--;

		}
	}

}
