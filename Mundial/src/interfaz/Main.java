package interfaz;

import java.util.LinkedList;

import logica.Encargado;
import logica.Pais;
import logica.Partido;

public class Main {

	public static void main(String[] args) {
		
		LinkedList<Pais> listaPais = new LinkedList<Pais>();
			
		listaPais.add(new Pais("1", "Qatar", 0,"A", true ));
		listaPais.add(new Pais("2", "Ecuador", 0, "A", true ));
		listaPais.add(new Pais("3", "Senegal", 0, "A", true ));
		listaPais.add(new Pais("4", "Netherlands", 0, "A", true ));
		
		listaPais.add(new Pais("5", "England", 0, "B", true ));
		listaPais.add(new Pais("6", "Ir Iran", 0, "B", true ));
		listaPais.add(new Pais("7", "USA", 0, "B", true ));
		listaPais.add(new Pais("8", "Wales", 0, "B", true ));
		
		listaPais.add(new Pais("9", "Argentina", 0, "C", true ));
		listaPais.add(new Pais("10", "Saudi Arabia", 0, "C", true ));
		listaPais.add(new Pais("11", "Mexico", 0, "C", true ));
		listaPais.add(new Pais("12", "Poland", 0, "C", true ));
		
		listaPais.add(new Pais("13", "France", 0, "D", true ));
		listaPais.add(new Pais("14", "Australia", 0, "D", true ));
		listaPais.add(new Pais("15", "Denmark", 0, "D", true ));
		listaPais.add(new Pais("16", "Tunisia", 0, "D", true ));
		
		listaPais.add(new Pais("17", "España", 0, "E", true ));
		listaPais.add(new Pais("18", "Costa Rica", 0, "E", true ));
		listaPais.add(new Pais("19", "Germany", 0, "E", true ));
		listaPais.add(new Pais("20", "Japan", 0, "E", true ));
		
		listaPais.add(new Pais("21", "Belgium", 0, "F", true ));
		listaPais.add(new Pais("22", "Canada", 0, "F", true ));
		listaPais.add(new Pais("23", "Morocco", 0, "F", true ));
		listaPais.add(new Pais("24", "Croatia", 0, "F", true ));
		
		listaPais.add(new Pais("25", "Brazil", 0, "G", true ));
		listaPais.add(new Pais("26", "Serbia", 0, "G", true ));
		listaPais.add(new Pais("27", "Switzerland", 0, "G", true ));
		listaPais.add(new Pais("28", "Cameroon", 0, "G", true ));
		
		listaPais.add(new Pais("29", "Portugal", 0, "H", true ));
		listaPais.add(new Pais("30", "Ghana", 0, "H", true ));
		listaPais.add(new Pais("31", "Uruguay", 0, "H", true ));
		listaPais.add(new Pais("32", "Korea Republic", 0, "H", true ));
		
//		String dni, String nombre, String apellido	
		Encargado e1 = new Encargado ("34704934", "Harry", "Mrtnz");
		
//		String id, String nombre, int goles, String grupo, boolean calificado
		Pais qatar  = new Pais ("1", "Qatar", 0,"A", true );
		Pais ecuador = new Pais ("2", "Ecuador", 0, "A", true );
		Pais senegal = new Pais ("3", "Senegal", 0, "A", true );
		Pais netherlands = new Pais ("4", "Netherlands", 0, "A", true );
		
		Pais england = new Pais ("5", "England", 0, "B", true );
		Pais ir_iran = new Pais ("6", "Ir Iran", 0, "B", true );
		Pais usa = new Pais ("7", "USA", 0, "B", true );
		Pais wales = new Pais ("8", "Wales", 0, "B", true );
		
		Pais argentina = new Pais ("9", "Argentina", 0, "C", true );
		Pais saudi_arabia = new Pais ("10", "Saudi Arabia", 0, "C", true );
		Pais mexico = new Pais ("11", "Mexico", 0, "C", true );
		Pais poland = new Pais ("12", "Poland", 0, "C", true );
		
		Pais france = new Pais ("13", "France", 0, "D", true );
		Pais australia = new Pais ("14", "Australia", 0, "D", true );
		Pais denmark = new Pais ("15", "Denmark", 0, "D", true );
		Pais tunisia = new Pais ("16", "Tunisia", 0, "D", true );
		
		Pais españa = new Pais ("17", "España", 0, "E", true );
		Pais costa_rica = new Pais ("18", "Costa Rica", 0, "E", true );
		Pais germany = new Pais ("19", "Germany", 0, "E", true );
		Pais japan = new Pais ("20", "Japan", 0, "E", true );
		
		Pais belgium = new Pais ("21", "Belgium", 0, "F", true );
		Pais canada = new Pais ("22", "Canada", 0, "F", true );
		Pais moroco = new Pais ("23", "Morocco", 0, "F", true );
		Pais croatia = new Pais ("24", "Croatia", 0, "F", true );
		
		Pais brazil = new Pais ("25", "Brazil", 0, "G", true );
		Pais serbia = new Pais ("26", "Serbia", 0, "G", true );
		Pais switzerland = new Pais ("27", "Switzerland", 0, "G", true );
		Pais cameroon = new Pais ("28", "Cameroon", 0, "G", true );
		
		Pais portugal = new Pais ("29", "Portugal", 0, "H", true );
		Pais ghana = new Pais ("30", "Ghana", 0, "H", true );
		Pais uruguay = new Pais ("31", "Uruguay", 0, "H", true );
		Pais korea_republic = new Pais ("32", "Korea Republic", 0, "H", true );
		
		mostrarEquipos(listaPais);

		//Partidos Grupo A
		Partido p1 = new Partido(qatar, ecuador);
		p1.jugar(qatar, ecuador);
	}
	
	
		
//		Partido p2 = new Partido(senegal, netherlands);
//		Partido p3 = new Partido(qatar, senegal);
//		Partido p4 = new Partido(netherlands, ecuador);
//		Partido p5 = new Partido (netherlands, qatar);
//		Partido p6 = new Partido (ecuador, senegal);
//		
//		Partido[] partido = new Partido[8];
//		
//		e1.cargarResultado(p1);
//	
//		for (Partido i : partido) {
//			System.out.println(uno);
//	}


	
	public static void mostrarEquipos(LinkedList<Pais> listaPais){
		if(listaPais.isEmpty()) {
			System.out.println("Lista vacia pá");
		
		}else {
		
			for (Pais pais : listaPais) {
			if (pais.getNombre().equalsIgnoreCase("qatar")) {
				
			} else {

			}
				System.out.println("Equipo "+pais.getId()+ " = "+ pais.getNombre() + " Grupo = " + pais.getGrupo());
			}
			
		}
	}
}
