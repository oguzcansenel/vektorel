package com.vektorel.Ogu;

public class IkıBoyutluArray {
	public static void main(String[] args) {
		int[][] array = new int[3][3];

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] = i * j);
			}
			System.out.println(" ");
		}
	}
}
