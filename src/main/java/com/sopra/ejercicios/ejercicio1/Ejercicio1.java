package com.sopra.ejercicios.ejercicio1;

import org.springframework.stereotype.Service;

@Service
public class Ejercicio1 {
	
	public Ejercicio1() {}

	public int sumaFactores(Integer N) {
		int sumaFactor = 0;
		
		if(N > 0) {
			for (int i = 1; i <= N; i++) {
				if(N%i == 0) {
					sumaFactor += i;
				}
			}
		}
		return sumaFactor;
	}
}
