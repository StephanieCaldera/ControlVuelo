package principal;

import java.util.ArrayList;
import java.util.Scanner;
import entidades.Avion;
import entidades.Helicoptero;
import entidades.ObjetoNoIdentificado;
import entidades.ObjetosVoladores;
import entidades.TorreControl;

public class Main {

	static Scanner scanner = new Scanner (System.in);
	
	public Main() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		
		TorreControl oper = new TorreControl("Juan");
		
		//creando objetos
		Avion avion1 = new Avion(22222, "Vuela Siempre", "AVION");
		Helicoptero helicop = new Helicoptero(2222, "Paseando", "HELICOPTERO");
		ObjetoNoIdentificado objNoId = new ObjetoNoIdentificado(33333, "Desconocido", "OBJETO NO IDENTIFICADO");
		
		//agregando objetos en un arreglo, usando las propiedades de herencia	
		oper.agregarObjetosVol(objNoId);
		oper.agregarObjetosVol(helicop);
		oper.agregarObjetosVol(avion1);
 	
		//programa de autorizacion de aterrizaje por el operador
		boolean salir = false;
		int seleccion = 0;	
		while (!salir) {
			System.out.println("Se detectó un Objeto Volador que desea aterrizar en la pista del Aeropuerto HTM");
			System.out.println("Seleccione el tipo de objeto volador para el procedimiento de aterrizaje");
			System.out.println("1. AVION");
			System.out.println("2. HELICOPTERO");
			System.out.println("3. OBJETO NO IDENTIFICADO");
			System.out.println("4. SALIR DEL PROGRAMA");
			seleccion = scanner.nextInt();
		switch (seleccion) {
		  case 1: 
			System.out.println(avion1.toString());
			avion1.aterrizajeVuelo();	
			break;
			
		  case 2:
			System.out.println(helicop.toString());
			    int codigo;
				int ingreso; 
				System.out.println("Operador debe autorizar el ingreso: Seleccionoe 1. SI o 2. NO");
				ingreso = scanner.nextInt();
				switch (ingreso) {
				case 1: 
					
					oper.aterrizajeAutorizado();
					
					break;
				case 2: 
					oper.aterrizajeProhibido();
					break;
				}
			break;
		  case 3: 
			System.out.println(objNoId.toString());
			oper.aterrizajeProhibido();
			objNoId.redireccionVuelo();
			break;

		  case 4: 
			salir = true;
			break;
			
		default:
				System.out.println("Opcion invalida");
		 }
		 
	  }
		
		System.out.println("Se muestra lista de objetos y su autorizacion de aterrizaje");
		oper.mostrarPermiso();
}
		 
		
}
		
		 
		 
				
			


