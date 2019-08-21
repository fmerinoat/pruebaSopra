package com.sopra.ejercicios.ejercicio2;

public class Ejercicio2 {
	
	public int secuenciaCeros(int N) {

		int res = 0;
		if(N > 0) {
			 // Paso a binario
		    String binario = Integer.toBinaryString(N);
		    //System.out.println(binario);
		    
		    res = calculoSecuencia(binario);
		}
		return res;
	}
	
	private int calculoSecuencia (String binario) {
			
		boolean unoInicial = false;
		int contador = 0;
		int maximo = 0;
		
		for (int i = 0; i < binario.length(); i++) {
			
			if (binario.charAt(i) == '1') {
				if(!unoInicial) {
					unoInicial = true;
				}
				if(contador>0 && contador>maximo) {
					maximo = contador;
					contador = 0;
				}
			}
			if(binario.charAt(i) == '0' && unoInicial) {
				contador++;
			}
		}
		
		return maximo;
	}

}
