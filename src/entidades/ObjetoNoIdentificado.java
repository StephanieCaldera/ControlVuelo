package entidades;

import java.util.ArrayList;

public class ObjetoNoIdentificado extends ObjetosVoladores {
	

	public ObjetoNoIdentificado(int matricula, String aerolinea, String clase) {
		super(matricula, aerolinea, clase);
		
	}
	
	public ObjetoNoIdentificado() {
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
		System.out.println("despegando...");
;
	}

	@Override
	public void aterrizajeVuelo() {
		System.out.println("Objeto no autorizado para aterrizar en pista 1 o 2....");
	}

	@Override
	public void redireccionVuelo () {
		System.out.println("Objeto redireccionando vuelo... ");
		
	}

	@Override
	public String toString() {
		return "ObjetoNoIdentificado [matricula: " + matricula + ", aerolinea: " + aerolinea + "]";
	}
	
	

}
