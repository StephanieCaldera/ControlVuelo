package entidades;

import java.util.ArrayList;

public abstract class ObjetosVoladores {
	protected int matricula;
	protected String aerolinea;
	protected String clase;
	protected ArrayList<Avion> aviones;
	protected ArrayList<Helicoptero> helicopteros;
	protected ArrayList<ObjetoNoIdentificado> objNoId;
	

	public ObjetosVoladores(int matricula, String aerolinea, String clase) {
		super();
		this.matricula = matricula;
		this.aerolinea = aerolinea;
		this.clase = clase;
		this.aviones = new ArrayList<>();
		this.helicopteros = new ArrayList<>();
		this.objNoId = new ArrayList<>();
	}

	public ObjetosVoladores() {
		// TODO Auto-generated constructor stub		
	}

	public String getClase() {
		return clase;
	}

	public void setClase(String aerolinea) {
		this.aerolinea = aerolinea;
	}
	
	
	
	

	public abstract void inicioVuelo();
	
	public abstract void aterrizajeVuelo();
	
	public abstract void redireccionVuelo ();
	
	
	
	public void agregarObjetosVol (Avion av) {
		this.aviones.add(av);	
	}
		
		
	public void agregarObjetosVol (Helicoptero hel) {
			this.helicopteros.add(hel);
	}
			
	public void agregarObjetosVol (ObjetoNoIdentificado ob) {
				this.objNoId.add(ob);
	}

	@Override
	public String toString() {
		return "ObjetosVoladores [matricula=" + matricula + ", aerolinea=" + aerolinea + "]";
	}

	
	
	
	
	
}
