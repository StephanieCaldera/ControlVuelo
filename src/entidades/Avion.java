package entidades;

import java.util.ArrayList;

public class Avion extends ObjetosVoladores {
	
	public Avion(int matricula, String aerolinea, String clase) {
		super(matricula, aerolinea, clase);
	}
	
	public Avion() {
		// TODO Auto-generated constructor stub
	}

	
	public String getClase() {
		return clase;
	}

	public void setClase(String clase) {
		this.clase = clase;
	}

   // sobreescritura de metodos
	@Override
	public void inicioVuelo() {
		System.out.println("Avion despegando...");
		
	}

	@Override
	public void aterrizajeVuelo() {
		System.out.println("Autorizado para aterrizar en la pista 1");
	}

	@Override
	public void redireccionVuelo() {
		System.out.println("Avion redireccionando vuelo... ");
		
	}

	@Override
	public String toString() {
		return "Avion [matricula: " + matricula + ", aerolinea: " + aerolinea + "]";
	}
	
	
	

	
}
