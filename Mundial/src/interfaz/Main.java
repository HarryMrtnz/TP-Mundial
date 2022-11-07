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
			listaPaises.add(qatar);
			listaPaises.add(ecuador);
			listaPaises.add(senegal);
			listaPaises.add(netherlands);
			listaPaises.add(england);
			listaPaises.add(ir_iran);
			listaPaises.add(usa);
			listaPaises.add(wales);
			listaPaises.add(argentina);
			listaPaises.add(saudi_arabia);
			listaPaises.add(mexico);
			listaPaises.add(poland);
			listaPaises.add(france);
			listaPaises.add(australia);
			listaPaises.add(denmark);
			listaPaises.add(tunisia);
			listaPaises.add(spain);
			listaPaises.add(costa_rica);
			listaPaises.add(germany);
			listaPaises.add(japan);
			listaPaises.add(belgium);
			listaPaises.add(canada);
			listaPaises.add(morocco);
			listaPaises.add(croatia);
			listaPaises.add(brazil);
			listaPaises.add(serbia);
			listaPaises.add(switzerland);
			listaPaises.add(cameroon);
			listaPaises.add(portugal);
			listaPaises.add(ghana);
			listaPaises.add(uruguay);
			listaPaises.add(korea_republic);
			
		Encargado e1 = new Encargado ("34704934", "Harry", "Mrtnz");
		
//			mostrarEquipos(listaPaises);
//			buscarGrupo(listaPaises);
//			buscarEquipo(listaPaises);
			
//		Partido pGA = new Partido ("90 minutos");
//		Partido pGB = new Partido ("90 minutos");
//		Partido pGC = new Partido ("90 minutos");
//		Partido pGD = new Partido ("90 minutos");
//		Partido pGE = new Partido ("90 minutos");
//		Partido pGF = new Partido ("90 minutos");
//		Partido pGG = new Partido ("90 minutos");
//		Partido pGH = new Partido ("90 minutos");
		
//		e1.cargarResultado(p1);

//		PARTIDOS DE GRUPO
//		pGA.jugarFaceGrupos(qatar, ecuador, senegal, netherlands);
//		pGB.jugarFaceGrupos(england, ir_iran, usa, wales);
//		pGC.jugarFaceGrupos(argentina, saudi_arabia, mexico, poland);
//		pGD.jugarFaceGrupos(france, australia, denmark, tunisia);
//		pGE.jugarFaceGrupos(spain, costa_rica, germany, japan);
//		pGF.jugarFaceGrupos(belgium, canada, morocco, croatia);
//		pGG.jugarFaceGrupos(brazil, serbia, switzerland, cameroon);
//		pGH.jugarFaceGrupos(portugal, ghana, uruguay, korea_republic);

		mostrarCalificados(listaPaises);
//		jugarOctavos(listaPaises);
		mostrarCalificados(listaPaises);
		
		LinkedList<Pais> listaOctavos = new LinkedList<Pais>();
		
//		for (Partido partido : Partidos) {
//		
//			listaOctavos.add(partido.getPais1());
//		}
		
	}
	
	public static void jugarOctavos(LinkedList<Pais> lista) {
		int aux1, aux2, aux3, aux4, aux5, aux6, aux7, aux8,
			aux9, aux10, aux11, aux12,aux13, aux14, aux15, aux16;
		
		aux1 =(int) (Math.random()*6 ); aux9 =(int) (Math.random()*6 );
		aux2 =(int) (Math.random()*6 );	aux10 =(int) (Math.random()*6 );
		aux3 =(int) (Math.random()*6 );	aux11 =(int) (Math.random()*6 );
		aux4 =(int) (Math.random()*6 );	aux12 =(int) (Math.random()*6 );
		aux5 =(int) (Math.random()*6 );	aux13 =(int) (Math.random()*6 );
		aux6 =(int) (Math.random()*6 );	aux14 =(int) (Math.random()*6 );
		aux7 =(int) (Math.random()*6 );	aux15 =(int) (Math.random()*6 );
		aux8 =(int) (Math.random()*6 );	aux16 =(int) (Math.random()*6 );

		if(lista.isEmpty()) {
			System.out.println("Lista vacia pá");
			
		} else {
			
			for (Pais pais : lista) {
				
				if (pais.getGrupo() == "A"  && pais.getPuestoGrupo() == 1 && aux1 < aux2) {
					pais.setCalificado(false); //Pierde queda eliminado
				}
				
				if (pais.getGrupo() == "B"  && pais.getPuestoGrupo() == 2 && aux1 >= aux2) {
					pais.setCalificado(false);
				}
				
				if (pais.getGrupo() == "C"  && pais.getPuestoGrupo() == 1 && aux3 < aux4) {
					pais.setCalificado(false);
				}
				
				if (pais.getGrupo() == "D"  && pais.getPuestoGrupo() == 2 && aux3 >= aux4) {
					pais.setCalificado(false);					
				}
				
				if (pais.getGrupo() == "E"  && pais.getPuestoGrupo() == 1 && aux5 < aux6) {
					pais.setCalificado(false);
				}
				
				if (pais.getGrupo() == "F"  && pais.getPuestoGrupo() == 2 && aux5 >= aux6) {
					pais.setCalificado(false);
				}
				
				if (pais.getGrupo() == "G"  && pais.getPuestoGrupo() == 1 && aux7 < aux8) {
					pais.setCalificado(false);
				}
				
				if (pais.getGrupo() == "H"  && pais.getPuestoGrupo() == 2 && aux7 >= aux8) {
					pais.setCalificado(false);
				}
				
				if (pais.getGrupo() == "B"  && pais.getPuestoGrupo() == 1 && aux9 < aux10) {
					pais.setCalificado(false);
				}
		
				if (pais.getGrupo() == "A"  && pais.getPuestoGrupo() == 2 && aux9 >= aux10) {
					pais.setCalificado(false);
				}
				
				if (pais.getGrupo() == "D"  && pais.getPuestoGrupo() == 1 && aux11 < aux12) {
					pais.setCalificado(false);
				}
				
				if (pais.getGrupo() == "C"  && pais.getPuestoGrupo() == 2 && aux11 >= aux12) {
					pais.setCalificado(false);
				}
				
				if (pais.getGrupo() == "F"  && pais.getPuestoGrupo() == 1 && aux13 < aux14) {
					pais.setCalificado(false);
				}
				
				if (pais.getGrupo() == "E"  && pais.getPuestoGrupo() == 2 && aux13 >= aux14) {
					pais.setCalificado(false);
				}
				
				if (pais.getGrupo() == "H"  && pais.getPuestoGrupo() == 1 && aux15 < aux16) {
					pais.setCalificado(false);			
				}
				
				if (pais.getGrupo() == "G"  && pais.getPuestoGrupo() == 2 && aux15 >= aux16) {
					pais.setCalificado(false);
				}
			}
		}
	}

	public static void jugarCuartos(LinkedList<Pais> lista) {
		int aux1, aux2, aux3, aux4, aux5, aux6, aux7, aux8;
		
		aux1 =(int) (Math.random()*6 ); aux2 =(int) (Math.random()*6 );
		aux3 =(int) (Math.random()*6 ); aux4 =(int) (Math.random()*6 );
		aux5 =(int) (Math.random()*6 ); aux6 =(int) (Math.random()*6 );
		aux7 =(int) (Math.random()*6 ); aux8 =(int) (Math.random()*6 );
		
		if(lista.isEmpty()) {
			System.out.println("Lista vacia pá");
			
		} else {
			
			for (Pais pais : lista) {
				if (pais.isCalificado()) {

				} else {

				}
			}
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
	
	public static void mostrarCalificados(LinkedList<Pais> lista){
		if(lista.isEmpty()) {
			System.out.println("Lista vacia pá");
		
		}else {
			System.out.println("Paises clasificados a la siguiente fase:");
			for (Pais pais : lista) {	
				if (pais.isCalificado()) {
					System.out.println(pais.getId()+" - "+pais.getNombre());
				}
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
			System.out.println("Lista vacia pá");
		}else {
			for (Pais pais : lista) {
				if(pais.getNombre().equalsIgnoreCase(equipo)) {
					System.out.println("RESULTADO ENCONTRADO: \n"
						+pais.getNombre()+ " - Grupo: " +pais.getGrupo() + " - Goles totales: "+pais.getGoles());
//				}else {
//					System.out.println("No se ha encontrado ningun resultado"
//							+ "\nVuelve a intentar");
//					buscarEquipo(listaPais);
				}
	        }
		}
		System.out.println(); //Espacio separador
	}
}