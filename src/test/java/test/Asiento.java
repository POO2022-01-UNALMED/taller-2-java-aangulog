package test;

import java.util.Arrays;

public class Asiento {
	
	String color;
	int precio;
	int registro;
	static final String[] COLORES_VALIDOS = {"rojo", "verde", "amarillo", "negro", "blanco"};
	
	void cambiarColor(String color) {
		if (Arrays.asList(COLORES_VALIDOS).contains(color)){
			this.color=color;	
		}else {
			//System.err.println("Este no es un color valido");
		}
		
	}
	
	
	

}
