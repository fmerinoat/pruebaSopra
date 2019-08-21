package com.sopra.ejercicios;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.sopra.ejercicios.ejercicio1.Ejercicio1;
import com.sopra.ejercicios.ejercicio2.Ejercicio2;
import com.sopra.ejercicios.ejercicio3.Ejercicio3;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EjerciciosApplicationTests {
	
	
	Ejercicio1 primero = new Ejercicio1();
	Ejercicio2 segundo = new Ejercicio2();
	Ejercicio3 tercero = new Ejercicio3();

	@Test
	public void contextLoads() {
	}
	
	
	@Test
	public void verificarEjercicio1() {
		List<Integer> numeros = Arrays.asList(24,2,3,4,5,10,12,-5);
		
		
		List<Integer> sumFactor = numeros.stream()
							.map(number -> primero.sumaFactores(number))
							.collect(Collectors.toList());
		
		assertEquals((int)sumFactor.get(0), 60);
		assertEquals((int)sumFactor.get(1), 3);
		assertEquals((int)sumFactor.get(2), 4);
		assertEquals((int)sumFactor.get(3), 7);
		assertEquals((int)sumFactor.get(4), 6);
		assertEquals((int)sumFactor.get(5), 18);
		assertEquals((int)sumFactor.get(6), 28);
		assertEquals((int)sumFactor.get(7), 0);
	}

	@Test
	public void verificarEjercicio2() {
		List<Integer> numeros = Arrays.asList(9,529,20,15,32,1041,-5);
		
		
		List<Integer> sumCeros = numeros.stream()
							.map(number -> segundo.secuenciaCeros(number))
							.collect(Collectors.toList());
		
		assertEquals((int)sumCeros.get(0), 2);
		assertEquals((int)sumCeros.get(1), 4);
		assertEquals((int)sumCeros.get(2), 1);
		assertEquals((int)sumCeros.get(3), 0);
		assertEquals((int)sumCeros.get(4), 0);
		assertEquals((int)sumCeros.get(5), 5);
		assertEquals((int)sumCeros.get(6), 0);
	}
	
	
	@Test
	public void verificarEjercicio3() {
		
		int[] lista = {2,4,1};
		int res = tercero.esPermutacion(lista);
		
		assertEquals(res, 0);
		
		int[] lista2 = {2,4,1,3,5,2};
		 res = tercero.esPermutacion(lista2);
		 assertEquals(res, 0);
		 
		 int[] lista3 = {2,4,1,3,5,};
		 res = tercero.esPermutacion(lista3);
		 assertEquals(res, 1);
	
	}
}
