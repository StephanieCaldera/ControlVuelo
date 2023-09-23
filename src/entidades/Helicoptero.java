package entidades;

import java.util.ArrayList;

public class Helicoptero extends ObjetosVoladores {

	
	public Helicoptero(int matricula, String aerolinea, String clase) {
		super(matricula, aerolinea, clase);

	}

	public Helicoptero() {
		// TODO Auto-generated constructor stub
	}
	
	public String getClase() {
		return clase;
	}

	public void setClase(String clase) {
		this.clase = clase;
	}

	@Override
	public void inicioVuelo() {
		System.out.println("Helicoptero ascendiendo...");
		
	}

	@Override
	public void aterrizajeVuelo() {
		System.out.println("Requiere autorizacion para descender en la pista 2...");
		
	}

	@Override
	public void redireccionVuelo () {
		System.out.println("Helicoptero redireccionando vuelo... ");
		
	}

	@Override
	public String toString() {
		return "Helicoptero [matricula: " + matricula + ", aerolinea: " + aerolinea + "]";
	}
	
	

	
	
	
	

}
