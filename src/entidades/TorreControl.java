package entidades;

import java.util.ArrayList;


public class TorreControl implements AutorizacionAterrizaje {
	protected String operario;
	protected ArrayList<ObjetosVoladores> objVol;
	

	public TorreControl(String operario) {
		super();
		this.operario = operario;
		this.objVol = new ArrayList<ObjetosVoladores>();
	}
	

	public TorreControl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void aterrizajePermitido() {
		System.out.println("Se encuentra autorizado para aterrizar");
	}

	@Override
	public void aterrizajeProhibido() {
		System.out.println("Se encuentra prohibido para aterrizar en el aeropuerto");
		
	}
	
	
	@Override
	public void aterrizajeAutorizado() {
		System.out.println("Se encuentra autorizado para aterrizar en la pista 2, previa autorización");
		
	}
		
	public void mostrarObjVol ( ) {
		if(objVol.isEmpty()){
			System.out.println("No hay objetos voladores");
		}else {
			for (ObjetosVoladores vol: objVol) {
				System.out.println(vol);
				
			}
			
		}
	}
	
	
	public void mostrarPermiso () {
		for (ObjetosVoladores objVol : objVol) {
			System.out.println(objVol.getClase());
			objVol.aterrizajeVuelo();
		}

	}
	
	
	public void agregarObjetosVol (ObjetosVoladores volador) {
		this.objVol.add(volador);
		
	}

}





