package test;

import java.util.Arrays;

public class Motor {
	
	int numeroCilindros;
	String tipo;
	int registro;
	static final String[] TIPOS_VALIDOS = {"electrico","gasolina"};

	
	void cambiarRegistro(int registro) {
		this.registro=registro;
	}
	
	void asignarTipo(String tipo) {
		if (Arrays.asList(TIPOS_VALIDOS).contains(tipo)) {
			this.tipo=tipo;
		}else {
			//System.err.println("Este no es un tipo válido");
		}
		
		
		
	}

}
