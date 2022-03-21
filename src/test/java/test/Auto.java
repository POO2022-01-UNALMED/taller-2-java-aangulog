	package test;

public class Auto {
	
	String modelo;
	int precio;
	Asiento[] asientos;
	String marca;
	Motor motor;
	int registro;
	static int CantidadCreados;
	
//	int cantidadAsientos(){
//		return asientos.length;
//	}
	
	int cantidadAsientos() {
		int ConteoAsientos = 0;
		for (Asiento i : this.asientos) {
			if(i != null) {
				ConteoAsientos += 1;
			}else {}
		}
		return ConteoAsientos;
	}
	
	String verificarIntegridad() {
		int verificarAutenticidad = 1;
		for (Asiento i : this.asientos) {
			
			if(i != null) {	
			if(motor.registro == i.registro && i.registro==registro) {
				
			}else{
				verificarAutenticidad = 0;
				break;
			}
			}
		}
		if(verificarAutenticidad == 0) {
			return("Las piezas no son originales");
		}else {
			return("Auto original");
		}
	}
	
	
	
	
	
}
