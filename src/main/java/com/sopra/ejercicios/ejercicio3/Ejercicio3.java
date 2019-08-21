package com.sopra.ejercicios.ejercicio3;

import java.util.Arrays;

public class Ejercicio3 {

	public int esPermutacion(int[] A) {
		
		Arrays.sort(A);
		
		for(int i=0; i<A.length; i++) {
			if(A[i] != i+1) {
				return 0;
			}
		}
		return 1;
	}
}
