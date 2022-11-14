package interfaz;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

import logica.Encargado;
import logica.Pais;
import logica.Partido;

public class Main {

	public static void main(String[] args) {
		//Grupo A
		Pais qatar  = new Pais ("1", "Qatar", 0,"A", true );
		Pais ecuador = new Pais ("2", "Ecuador", 0, "A", true );
		Pais senegal = new Pais ("3", "Senegal", 0, "A", true );
		Pais netherlands = new Pais ("4", "Netherlands", 0, "A", true );
		//Grupo B
		Pais england = new Pais ("5", "England", 0, "B", true );
		Pais ir_iran = new Pais ("6", "Ir Iran", 0, "B", true );
		Pais usa = new Pais ("7", "USA", 0, "B", true );
		Pais wales = new Pais ("8", "Wales", 0, "B", true );
		//Grupo C
		Pais argentina = new Pais ("9", "Argentina", 0, "C", true );
		Pais saudi_arabia = new Pais ("10", "Saudi Arabia", 0, "C", true );
		Pais mexico = new Pais ("11", "Mexico", 0, "C", true );
		Pais poland = new Pais ("12", "Poland", 0, "C", true );
		//Grupo D
		Pais france = new Pais ("13", "France", 0, "D", true );
		Pais australia = new Pais ("14", "Australia", 0, "D", true );
		Pais denmark = new Pais ("15", "Denmark", 0, "D", true );
		Pais tunisia = new Pais ("16", "Tunisia", 0, "D", true );
		//Grupo E
		Pais spain = new Pais ("17", "Spain", 0, "E", true );
		Pais costa_rica = new Pais ("18", "Costa Rica", 0, "E", true );
		Pais germany = new Pais ("19", "Germany", 0, "E", true );
		Pais japan = new Pais ("20", "Japan", 0, "E", true );
		//Grupo F
		Pais belgium = new Pais ("21", "Belgium", 0, "F", true );
		Pais canada = new Pais ("22", "Canada", 0, "F", true );
		Pais morocco = new Pais ("23", "Morocco", 0, "F", true );
		Pais croatia = new Pais ("24", "Croatia", 0, "F", true );
		//Grupo G
		Pais brazil = new Pais ("25", "Brazil", 0, "G", true );
		Pais serbia = new Pais ("26", "Serbia", 0, "G", true );
		Pais switzerland = new Pais ("27", "Switzerland", 0, "G", true );
		Pais cameroon = new Pais ("28", "Cameroon", 0, "G", true );
		//Grupo H
		Pais portugal = new Pais ("29", "Portugal", 0, "H", true );
		Pais ghana = new Pais ("30", "Ghana", 0, "H", true );
		Pais uruguay = new Pais ("31", "Uruguay", 0, "H", true );
		Pais korea_republic = new Pais ("32", "Korea Republic", 0, "H", true );
		
		
		LinkedList<Pais> listaPaises = new LinkedList<Pais>();
//			Grupo A								Grupo E
			listaPaises.add(qatar);				listaPaises.add(spain);
			listaPaises.add(ecuador);			listaPaises.add(costa_rica);
			listaPaises.add(senegal);			listaPaises.add(germany);
			listaPaises.add(netherlands);		listaPaises.add(japan);
//			Grupo B								Grupo F
			listaPaises.add(england);			listaPaises.add(belgium);
			listaPaises.add(ir_iran);			listaPaises.add(canada);
			listaPaises.add(usa);				listaPaises.add(morocco);
			listaPaises.add(wales);				listaPaises.add(croatia);	
//			Grupo C								Grupo G
			listaPaises.add(argentina);			listaPaises.add(brazil);	
			listaPaises.add(saudi_arabia);		listaPaises.add(serbia);
			listaPaises.add(mexico);			listaPaises.add(switzerland);
			listaPaises.add(poland);			listaPaises.add(cameroon);
//			Grupo D								Grupo H
			listaPaises.add(france);			listaPaises.add(portugal);
			listaPaises.add(australia);			listaPaises.add(ghana);
			listaPaises.add(denmark);			listaPaises.add(uruguay);
			listaPaises.add(tunisia);			listaPaises.add(korea_republic);

		Encargado e1 = new Encargado ("34704934", "Harry", "Mrtnz");
//		e1.cargarResultado(p1);
		
//		mostrarEquipos(listaPaises);
//		buscarGrupo(listaPaises);
//		buscarEquipo(listaPaises);

		//jugarFaceGrupos(qatar, ecuador, senegal, netherlands);
		
//		mostrarCalificados(listaPaises);
//		jugarOctavos(listaPaises);
//		mostrarCalificados(listaPaises);
		
		LinkedList<Pais> listaOctavos = new LinkedList<Pais>();
		
//		for (Partido partido : Partidos) {
//		
//			listaOctavos.add(partido.getPais1());
//		}
		
		Partido partido = new Partido();
		
		
		for (int i = 0; i < listaPaises.size(); i+=4) {
			
			partido.jugarFaceGrupos(listaPaises.get(i), listaPaises.get(i+1), listaPaises.get(i+2), listaPaises.get(i+3));
		}
	}
	
	public static void mostrarEquipos(LinkedList<Pais> lista){
		if(lista.isEmpty()) {
			System.out.println("Lista vacia pá");
		
		}else {
			for (Pais pais : lista) {	
				System.out.println("Equipo "+pais.getId()+ " = "+ pais.getNombre() + " | Grupo: " + pais.getGrupo());
			}
		}
		System.out.println(); //Espacio separador
	}
	
	public static void buscarGrupo(LinkedList<Pais> lista) {
		System.out.print("ingrese la letra de grupo a buscar: ");
		
		Scanner entrada = new Scanner(System.in);
		String grupo = entrada.next();
		
		if(lista.isEmpty()) {
			System.out.println("Lista vacia pá");
		}else {
			for (Pais pais : lista) {
				if(pais.getGrupo().equalsIgnoreCase(grupo)) {
					System.out.println(pais.getNombre());
//				}else {
//					System.out.println("No se ha encontrado ningun resultado"
//							+ "\nVuelve a intentar");
//					buscarGrupo(listaPais);
				}
	        }
		}
		System.out.println(); //Espacio separador
	}
	
	public static void buscarEquipo(LinkedList<Pais> lista){
		
		System.out.print("ingrese el pais a buscar: ");
		
		Scanner entrada = new Scanner(System.in);
		String equipo = entrada.next();
		
		if(lista.isEmpty()) {
			System.out.println( "Lista vacia pá");
		}else {
			for (Pais pais : lista) {
				if(pais.getNombre().equalsIgnoreCase(equipo)) {
					System.out.println("RESULTADO ENCONTRADO: \n"
					+pais.getNombre()+ " - Grupo: " +pais.getGrupo() + " - Goles totales: "+pais.getGoles());
				}
	        }
		}
		System.out.println(); //Espacio separador
	}
}