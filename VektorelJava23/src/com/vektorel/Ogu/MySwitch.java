package com.vektorel.Ogu;

public class MySwitch {
	public static void main(String[] args) {

		int sonuc = toplama(5, 9, '*');
		System.out.println(sonuc);
	}

	static int toplama(int a, int b, char key) {
		int sonuc = 0;
		switch (key) {
		case '+':

			sonuc = a + b;

			break;
		case '-':
			sonuc = a - b;

			break;
		case '*':
			sonuc = a * b;

			break;
		case '/':
			sonuc = a / b;

			break;

		default:
			break;
		}
		return sonuc;
	}

}
