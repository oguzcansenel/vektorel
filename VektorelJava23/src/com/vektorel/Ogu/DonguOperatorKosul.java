package com.vektorel.Ogu;

public class DonguOperatorKosul {
	
	public static void main(String[] args) {
		
		int vize = 80;
		int finall = 50;
		int ortalama = (int) (vize * 0.4 + finall * 0.6);
		
		if (ortalama <= 100 && ortalama >= 90) {
			System.out.println("AA");
		}else if (ortalama < 90 && ortalama >= 80){
			System.out.println("BB");
		}else if (ortalama < 80 && ortalama >= 70){
			System.out.println("CC");
		}else if (ortalama < 70 && ortalama >= 60){
			System.out.println("DD");
		}else{
			System.out.println("FF");
		}
	}


}
