package interfaz;

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
		/* A */	listaPaises.add(qatar);		listaPaises.add(ecuador);	   listaPaises.add(senegal);	 listaPaises.add(netherlands);
		/* B */	listaPaises.add(england);	listaPaises.add(ir_iran);	   listaPaises.add(usa);		 listaPaises.add(wales);
		/* C */	listaPaises.add(argentina);	listaPaises.add(saudi_arabia); listaPaises.add(mexico);	 	 listaPaises.add(poland);
		/* D */	listaPaises.add(france);	listaPaises.add(australia);	   listaPaises.add(denmark);	 listaPaises.add(tunisia);
		/* E */	listaPaises.add(spain);		listaPaises.add(costa_rica);   listaPaises.add(germany);	 listaPaises.add(japan);
		/* F */	listaPaises.add(belgium);	listaPaises.add(canada);	   listaPaises.add(morocco);	 listaPaises.add(croatia);
		/* G */	listaPaises.add(brazil);	listaPaises.add(serbia);	   listaPaises.add(switzerland); listaPaises.add(cameroon);
		/* H */	listaPaises.add(portugal);	listaPaises.add(ghana);	 	   listaPaises.add(uruguay);	 listaPaises.add(korea_republic);

		LinkedList<Partido> listaPartidos = new LinkedList<Partido>();
		
		Encargado e1 = new Encargado ("34704934", "Harry", "Mrtnz");

		
		Partido p1 = new Partido (1, qatar, ecuador);				listaPartidos.add(p1);	
		Partido p2 = new Partido (2, senegal, netherlands);			listaPartidos.add(p2);	
		Partido p3 = new Partido (3, qatar, senegal);				listaPartidos.add(p3);	
		Partido p4 = new Partido (4, netherlands, ecuador);			listaPartidos.add(p4);	
		Partido p5 = new Partido (5, netherlands, qatar);			listaPartidos.add(p5);	
		Partido p6 = new Partido (6, ecuador, senegal);				listaPartidos.add(p6);
		
		Partido p7 = new Partido (7, england, ir_iran);				listaPartidos.add(p7);
		Partido p8 = new Partido (8, usa, wales);					listaPartidos.add(p8);
		Partido p9 = new Partido (9, england, usa);					listaPartidos.add(p9);
		Partido p10 = new Partido (10, wales, ir_iran);				listaPartidos.add(p10);	
		Partido p11 = new Partido (11, wales, england);				listaPartidos.add(p11);	
		Partido p12 = new Partido (12, ir_iran, usa);				listaPartidos.add(p12);	
		
		Partido p13 = new Partido (13, argentina, saudi_arabia);	listaPartidos.add(p13); 
		Partido p14 = new Partido (14, mexico, poland);				listaPartidos.add(p14);			
		Partido p15 = new Partido (15, argentina, mexico);			listaPartidos.add(p15);	
		Partido p16 = new Partido (16, poland, saudi_arabia);		listaPartidos.add(p16); 
		Partido p17 = new Partido (17, poland, argentina);			listaPartidos.add(p17); 
		Partido p18 = new Partido (18, saudi_arabia, mexico);		listaPartidos.add(p18); 
		
		Partido p19 = new Partido (19, france, australia);			listaPartidos.add(p19); 
		Partido p20 = new Partido (20, denmark, tunisia);			listaPartidos.add(p20);
		Partido p21 = new Partido (21, france, denmark);			listaPartidos.add(p21);
		Partido p22 = new Partido (22, tunisia, australia);			listaPartidos.add(p22);
		Partido p23 = new Partido (23, tunisia, france);			listaPartidos.add(p23);
		Partido p24 = new Partido (24, australia, denmark);			listaPartidos.add(p24);
		
		Partido p25 = new Partido (25, spain, costa_rica);			listaPartidos.add(p25);
		Partido p26 = new Partido (26, germany, japan);				listaPartidos.add(p26);
		Partido p27 = new Partido (27, spain, germany);				listaPartidos.add(p27);
		Partido p28 = new Partido (28, japan, costa_rica);			listaPartidos.add(p28);
		Partido p29 = new Partido (29, japan, spain);				listaPartidos.add(p29);
		Partido p30 = new Partido (30, costa_rica, germany);		listaPartidos.add(p30);
		
		Partido p31 = new Partido (31, belgium, canada);			listaPartidos.add(p31);
		Partido p32 = new Partido (32, morocco, croatia);			listaPartidos.add(p32);
		Partido p33 = new Partido (33, belgium, morocco);			listaPartidos.add(p33);
		Partido p34 = new Partido (34, croatia, canada);			listaPartidos.add(p34);
		Partido p35 = new Partido (35, croatia, belgium);			listaPartidos.add(p35);
		Partido p36 = new Partido (36, canada, morocco);			listaPartidos.add(p36);
		
		Partido p37 = new Partido (37, brazil, serbia);				listaPartidos.add(p37);
		Partido p38 = new Partido (38, switzerland, cameroon);		listaPartidos.add(p38);
		Partido p39 = new Partido (39, brazil, switzerland);		listaPartidos.add(p39);
		Partido p40 = new Partido (40, cameroon, serbia);			listaPartidos.add(p40);
		Partido p41 = new Partido (41, cameroon, brazil);			listaPartidos.add(p41);
		Partido p42 = new Partido (42, serbia, switzerland);		listaPartidos.add(p42);
		
		Partido p43 = new Partido (25, portugal, ghana);			listaPartidos.add(p43);
		Partido p44 = new Partido (26, uruguay, korea_republic);	listaPartidos.add(p44);
		Partido p45 = new Partido (27, portugal, uruguay);			listaPartidos.add(p45);
		Partido p46 = new Partido (28, korea_republic, ghana);		listaPartidos.add(p46);
		Partido p47 = new Partido (29, korea_republic, portugal);	listaPartidos.add(p47);
		Partido p48 = new Partido (30, ghana, uruguay);				listaPartidos.add(p48);
		

//		JUGAR FACE GRUPOS
		p1.jugar1(qatar, ecuador);			 p2.jugar1(senegal, netherlands);	p3.jugar1(qatar, senegal);
		p4.jugar1(netherlands, ecuador);	 p5.jugar1(netherlands, qatar); 	p6.jugar1(ecuador, senegal);
		calcularPuestoGrupos(qatar, ecuador, senegal, netherlands);
		
		p7.jugar1(england, ir_iran);		 p8.jugar1(usa, wales);				p9.jugar1(england, usa);	
		p10.jugar1(wales, ir_iran);			 p11.jugar1(wales, england);		p12.jugar1(ir_iran, usa);
		calcularPuestoGrupos(england, ir_iran, usa, wales);
		
		p13.jugar1(argentina, saudi_arabia); p14.jugar1(mexico, poland);		p15.jugar1(argentina, mexico);
		p16.jugar1(poland, saudi_arabia);	 p17.jugar1(poland, argentina); 	p18.jugar1(saudi_arabia, mexico);
		calcularPuestoGrupos(argentina, saudi_arabia, mexico, poland);
		
		p19.jugar1(france, australia);		 p20.jugar1(denmark, tunisia);		p21.jugar1(france, denmark);
		p22.jugar1(tunisia, australia);		 p23.jugar1(tunisia, france); 		p24.jugar1(australia, denmark);
		calcularPuestoGrupos(france, australia, denmark, tunisia);
		
		p25.jugar1(spain, costa_rica);		 p26.jugar1(germany, japan);		p27.jugar1(spain, germany);
		p28.jugar1(japan, costa_rica);		 p29.jugar1(japan, spain); 			p30.jugar1(costa_rica, germany);
		calcularPuestoGrupos(spain, costa_rica, germany, japan);
		
		p31.jugar1(belgium, canada);		 p32.jugar1(morocco, croatia);		p33.jugar1(belgium, morocco);
		p34.jugar1(croatia, canada);	  	 p35.jugar1(croatia, belgium); 		p36.jugar1(canada, morocco);
		calcularPuestoGrupos(belgium, canada, morocco, croatia);
		
		p37.jugar1(brazil, serbia);			 p38.jugar1(switzerland, cameroon);	p39.jugar1(brazil, switzerland);
		p40.jugar1(cameroon, serbia);		 p41.jugar1(cameroon, brazil); 		p42.jugar1(serbia, switzerland);
		calcularPuestoGrupos(brazil, serbia, switzerland, cameroon);
		
		p43.jugar1(portugal, ghana);		 p44.jugar1(uruguay, korea_republic);	p45.jugar1(portugal, uruguay);
		p46.jugar1(korea_republic, ghana);	 p47.jugar1(korea_republic, portugal);   p48.jugar1(ghana, uruguay);
		calcularPuestoGrupos(portugal, ghana, uruguay, korea_republic);
		
		LinkedList<Pais> listaOctavos = new LinkedList<Pais>();
		
		for (Pais pais : listaPaises) {
			if (pais.isCalificado()) {
				listaOctavos.add(pais);
			}
		}
		
		
		
		imprimirMenu(listaPaises, listaPartidos, listaOctavos);
		
	}
	
	public static void imprimirMenu(LinkedList<Pais> listaPaises, LinkedList<Partido> listaPartidos, LinkedList<Pais> listaOctavos){
		System.out.println("##########################################");
		System.out.println("# -  Menu - Mundial Qatar 2022\n#");
		System.out.println("# Escoja la opcion deseada: ");
		System.out.println("# 1 - Mostrar todos los equipos ");
		System.out.println("# 2 - Buscar equipos por nombre");
		System.out.println("# 3 - Buscar equipos por grupo ");
		System.out.println("# 4 - Ver clasificados por grupo");
		System.out.println("# 5 - Buscar partidos por grupo");
		System.out.println("# 6 - Ver clasificados a Octavos");
		System.out.println("# 7 -  ... ");
		System.out.println("# 8 -  ... ");
		
		Scanner entrada = new Scanner(System.in);
		int opcion = entrada.nextInt();
		
		switch (opcion) {
		case 1:
			mostrarEquipos(listaPaises);
			imprimirMenu(listaPaises, listaPartidos, listaOctavos);
			break;
			
		case 2:
			buscarEquipo(listaPaises);
			imprimirMenu(listaPaises, listaPartidos, listaOctavos);
			break;

		case 3:
			buscarGrupo(listaPaises);
			imprimirMenu(listaPaises, listaPartidos, listaOctavos);
			break;
			
		case 4:
			clasificadosGrupo(listaPaises, listaPartidos, listaOctavos);
			break;
		
		case 5:
			buscarPartidoGrupo(listaPartidos, listaPaises);
			imprimirMenu(listaPaises, listaPartidos, listaOctavos);
			break;
			
		case 6:
			listaOctavos(listaOctavos);
			imprimirMenu(listaPaises, listaPartidos, listaOctavos);
			break;
			
		default:
			imprimirMenu(listaPaises, listaPartidos, listaOctavos);
			break;
		}
	}
	

	public static void calcularPuestoGrupos(Pais pais1, Pais pais2, Pais pais3, Pais pais4) {
		/* 01 */if (pais1.getPuntos() >= pais2.getPuntos() && pais2.getPuntos() >= pais3.getPuntos() && pais3.getPuntos() >= pais4.getPuntos()) {
			pais1.setPuestoGrupo(1); pais2.setPuestoGrupo(2); pais3.setPuestoGrupo(3); pais4.setPuestoGrupo(4);
		/* 02 */} else if (pais1.getPuntos() >= pais2.getPuntos() && pais2.getPuntos() >= pais4.getPuntos() && pais4.getPuntos() >= pais3.getPuntos()){
			pais1.setPuestoGrupo(1); pais2.setPuestoGrupo(2); pais4.setPuestoGrupo(3); pais3.setPuestoGrupo(4);
		/* 03 */} else if (pais1.getPuntos() >= pais3.getPuntos() && pais3.getPuntos() >= pais2.getPuntos() && pais2.getPuntos() >= pais4.getPuntos()){
			pais1.setPuestoGrupo(1); pais3.setPuestoGrupo(2); pais2.setPuestoGrupo(3); pais4.setPuestoGrupo(4);
		/* 04 */} else if (pais1.getPuntos() >= pais3.getPuntos() && pais3.getPuntos() >= pais4.getPuntos() && pais4.getPuntos() >= pais2.getPuntos()){
			pais1.setPuestoGrupo(1); pais3.setPuestoGrupo(2); pais4.setPuestoGrupo(3); pais2.setPuestoGrupo(4);
		/* 05 */} else if (pais1.getPuntos() >= pais4.getPuntos() && pais4.getPuntos() >= pais2.getPuntos() && pais2.getPuntos() >= pais3.getPuntos()){
			pais1.setPuestoGrupo(1); pais4.setPuestoGrupo(2); pais2.setPuestoGrupo(3); pais3.setPuestoGrupo(4);
		/* 06 */} else if (pais1.getPuntos() >= pais4.getPuntos() && pais4.getPuntos() >= pais3.getPuntos() && pais3.getPuntos() >= pais2.getPuntos()){
			pais1.setPuestoGrupo(1); pais4.setPuestoGrupo(2); pais3.setPuestoGrupo(3); pais2.setPuestoGrupo(4);
			
		/* 07 */} else if (pais2.getPuntos() >= pais1.getPuntos() && pais1.getPuntos() >= pais3.getPuntos() && pais3.getPuntos() >= pais4.getPuntos()){
			pais2.setPuestoGrupo(1); pais1.setPuestoGrupo(2); pais3.setPuestoGrupo(3); pais4.setPuestoGrupo(4);
		/* 08 */} else if (pais2.getPuntos() >= pais1.getPuntos() && pais1.getPuntos() >= pais4.getPuntos() && pais4.getPuntos() >= pais3.getPuntos()){
			pais2.setPuestoGrupo(1); pais1.setPuestoGrupo(2); pais4.setPuestoGrupo(3); pais3.setPuestoGrupo(4);
		/* 09 */} else if (pais2.getPuntos() >= pais3.getPuntos() && pais3.getPuntos() >= pais1.getPuntos() && pais1.getPuntos() >= pais4.getPuntos()){
			pais2.setPuestoGrupo(1); pais3.setPuestoGrupo(2); pais1.setPuestoGrupo(3); pais4.setPuestoGrupo(4);
		/* 10 */} else if (pais2.getPuntos() >= pais3.getPuntos() && pais3.getPuntos() >= pais4.getPuntos() && pais4.getPuntos() >= pais1.getPuntos()){
			pais2.setPuestoGrupo(1); pais3.setPuestoGrupo(2); pais4.setPuestoGrupo(3); pais1.setPuestoGrupo(4);
		/* 11 */} else if (pais2.getPuntos() >= pais4.getPuntos() && pais4.getPuntos() >= pais1.getPuntos() && pais1.getPuntos() >= pais3.getPuntos()){
			pais2.setPuestoGrupo(1); pais4.setPuestoGrupo(2); pais1.setPuestoGrupo(3); pais3.setPuestoGrupo(4);
		/* 12 */} else if (pais2.getPuntos() >= pais4.getPuntos() && pais4.getPuntos() >= pais3.getPuntos() && pais3.getPuntos() >= pais1.getPuntos()){
			pais2.setPuestoGrupo(1); pais4.setPuestoGrupo(2); pais3.setPuestoGrupo(3); pais1.setPuestoGrupo(4);
		
		/* 13 */} else if (pais3.getPuntos() >= pais1.getPuntos() && pais1.getPuntos() >= pais2.getPuntos() && pais2.getPuntos() >= pais4.getPuntos()){
			pais3.setPuestoGrupo(1); pais1.setPuestoGrupo(2); pais2.setPuestoGrupo(3); pais4.setPuestoGrupo(4);
		/* 14 */} else if (pais3.getPuntos() >= pais1.getPuntos() && pais1.getPuntos() >= pais4.getPuntos() && pais4.getPuntos() >= pais2.getPuntos()){
			pais3.setPuestoGrupo(1); pais1.setPuestoGrupo(2); pais4.setPuestoGrupo(3); pais2.setPuestoGrupo(4);
		/* 15 */} else if (pais3.getPuntos() >= pais2.getPuntos() && pais2.getPuntos() >= pais1.getPuntos() && pais1.getPuntos() >= pais4.getPuntos()){
			pais3.setPuestoGrupo(1); pais2.setPuestoGrupo(2); pais1.setPuestoGrupo(3); pais4.setPuestoGrupo(4);
		/* 16 */} else if (pais3.getPuntos() >= pais2.getPuntos() && pais2.getPuntos() >= pais4.getPuntos() && pais4.getPuntos() >= pais1.getPuntos()){
			pais3.setPuestoGrupo(1); pais2.setPuestoGrupo(2); pais4.setPuestoGrupo(3); pais1.setPuestoGrupo(4);
		/* 17 */} else if (pais3.getPuntos() >= pais4.getPuntos() && pais4.getPuntos() >= pais1.getPuntos() && pais1.getPuntos() >= pais2.getPuntos()){
			pais3.setPuestoGrupo(1); pais4.setPuestoGrupo(2); pais1.setPuestoGrupo(3); pais2.setPuestoGrupo(4);
		/* 18 */} else if (pais3.getPuntos() >= pais4.getPuntos() && pais4.getPuntos() >= pais2.getPuntos() && pais2.getPuntos() >= pais1.getPuntos()){
			pais3.setPuestoGrupo(1); pais4.setPuestoGrupo(2); pais2.setPuestoGrupo(3); pais1.setPuestoGrupo(4);
		
		/* 19 */} else if (pais4.getPuntos() >= pais1.getPuntos() && pais1.getPuntos() >= pais2.getPuntos() && pais2.getPuntos() >= pais3.getPuntos()){
			pais4.setPuestoGrupo(1); pais1.setPuestoGrupo(2); pais2.setPuestoGrupo(3); pais3.setPuestoGrupo(4);
		/* 20 */} else if (pais4.getPuntos() >= pais1.getPuntos() && pais1.getPuntos() >= pais3.getPuntos() && pais3.getPuntos() >= pais2.getPuntos()){
			pais4.setPuestoGrupo(1); pais1.setPuestoGrupo(2); pais3.setPuestoGrupo(3); pais2.setPuestoGrupo(4);
		/* 21 */} else if (pais4.getPuntos() >= pais2.getPuntos() && pais2.getPuntos() >= pais1.getPuntos() && pais1.getPuntos() >= pais3.getPuntos()){
			pais4.setPuestoGrupo(1); pais2.setPuestoGrupo(2); pais1.setPuestoGrupo(3); pais3.setPuestoGrupo(4);
		/* 22 */} else if (pais4.getPuntos() >= pais2.getPuntos() && pais2.getPuntos() >= pais3.getPuntos() && pais3.getPuntos() >= pais1.getPuntos()){
			pais4.setPuestoGrupo(1); pais2.setPuestoGrupo(2); pais3.setPuestoGrupo(3); pais1.setPuestoGrupo(4);
		/* 23 */} else if (pais4.getPuntos() >= pais3.getPuntos() && pais3.getPuntos() >= pais1.getPuntos() && pais1.getPuntos() >= pais2.getPuntos()){
			pais4.setPuestoGrupo(1); pais3.setPuestoGrupo(2); pais1.setPuestoGrupo(3); pais2.setPuestoGrupo(4);
		/* 24 */} else {
			pais4.setPuestoGrupo(1); pais3.setPuestoGrupo(2); pais2.setPuestoGrupo(3); pais1.setPuestoGrupo(4);
				}
		
		if (pais1.getPuestoGrupo() == 3 || pais1.getPuestoGrupo()== 4){
			pais1.setCalificado(false);
		}
		if (pais2.getPuestoGrupo() == 3 || pais2.getPuestoGrupo()== 4){
			pais2.setCalificado(false);
		}
		if (pais3.getPuestoGrupo() == 3 || pais3.getPuestoGrupo()== 4){
			pais3.setCalificado(false);
		}
		if (pais4.getPuestoGrupo() == 3 || pais4.getPuestoGrupo()== 4){
			pais4.setCalificado(false);
		}
	}
	
	public static void mostrarEquipos(LinkedList<Pais> lista){
		if(lista.isEmpty()) {
			System.out.println("Lista vacia pá");
		
		}else {
			System.out.println("Estos son los "+ lista.size()+" paises que participarán del Mundial Qatar 2022");
			for (Pais pais : lista) {	
				System.out.println("Equipo "+pais.getId()+ " = "+ pais.getNombre() + " | Grupo: " + pais.getGrupo());
			}
		}
		System.out.println(); //Espacio separador
	}
	
	public static void buscarGrupo(LinkedList<Pais> paises) {
		System.out.print("ingrese la letra de grupo a buscar: ");
		
		Scanner entrada = new Scanner(System.in);
		String grupo = entrada.next();
		
		if(paises.isEmpty()) {
			System.out.println("Lista vacia pá");
		}else {
			for (Pais pais : paises) {
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
	
	public static void buscarPartidoGrupo(LinkedList<Partido> partidos, LinkedList <Pais> paises) {
		System.out.print("ingrese el grupo para ver los partidos: ");
		
		Scanner entrada = new Scanner(System.in);
		String grupo = entrada.next();

		if(partidos.isEmpty()) {
			System.out.println( "Lista vacia pá");
		}else {
			for (Partido partido : partidos) { // GRUPO A
				if (grupo.equalsIgnoreCase("A")) {
					if (partido.getId()==1 || partido.getId()==2 || partido.getId()==3 || partido.getId()==4|| partido.getId()==5|| partido.getId()==6  ) {
						System.out.println("_________________________________");
						System.out.println(partido.getNombre()+ partido.getDetalle());
					}
				}
			}
			for (Pais pais: paises) {
				if (grupo.equalsIgnoreCase("A") && pais.getGrupo()=="A") {
					System.out.println(" → "+pais.getNombre()+ " consiguio el puesto " +pais.getPuestoGrupo());
				}
			}
			
			for (Partido partido : partidos) {// GRUPO B
				if (grupo.equalsIgnoreCase("B")) {
					if (partido.getId()==7 || partido.getId()==8 || partido.getId()==9 || partido.getId()==10|| partido.getId()==11|| partido.getId()==12  ) {
						System.out.println("_________________________________");
						System.out.println(partido.getNombre()+ partido.getDetalle());
					}
				}
			}
			for (Pais pais: paises) {
				if (grupo.equalsIgnoreCase("B") && pais.getGrupo()=="B") {
					System.out.println(" → "+pais.getNombre()+ " consiguio el puesto " +pais.getPuestoGrupo());
				}
			}
			
			for (Partido partido : partidos) {// GRUPO C
				if (grupo.equalsIgnoreCase("C")) {
					if (partido.getId()==13 || partido.getId()==14 || partido.getId()==15 || partido.getId()==16|| partido.getId()==17|| partido.getId()==18  ) {
						System.out.println("_________________________________");
						System.out.println(partido.getNombre()+ partido.getDetalle());
					}
				}
			}
			for (Pais pais: paises) {
				if (grupo.equalsIgnoreCase("C") && pais.getGrupo()=="C") {
					System.out.println(" → "+pais.getNombre()+ " consiguio el puesto " +pais.getPuestoGrupo());
				}
			}
			
			for (Partido partido : partidos) {// GRUPO D
				if (grupo.equalsIgnoreCase("D")) {
					if (partido.getId()==19 || partido.getId()==20 || partido.getId()==21 || partido.getId()==22|| partido.getId()==23|| partido.getId()==24  ) {
						System.out.println("_________________________________");
						System.out.println(partido.getNombre()+ partido.getDetalle());
					}
				}
			}
			for (Pais pais: paises) {
				if (grupo.equalsIgnoreCase("D") && pais.getGrupo()=="D") {
					System.out.println(" → "+pais.getNombre()+ " consiguio el puesto " +pais.getPuestoGrupo());
				}
			}
			
			for (Partido partido : partidos) {// GRUPO E
				if (grupo.equalsIgnoreCase("E")) {
					if (partido.getId()==25 || partido.getId()==26 || partido.getId()==27 || partido.getId()==28|| partido.getId()==29|| partido.getId()==30  ) {
						System.out.println("_________________________________");
						System.out.println(partido.getNombre()+ partido.getDetalle());
					}
				}
			}
			for (Pais pais: paises) {
				if (grupo.equalsIgnoreCase("E") && pais.getGrupo()=="E") {
					System.out.println(" → "+pais.getNombre()+ " consiguio el puesto " +pais.getPuestoGrupo());
				}
			}
			
			for (Partido partido : partidos) {// GRUPO F
				if (grupo.equalsIgnoreCase("F")) {
					if (partido.getId()==31 || partido.getId()==32 || partido.getId()==33 || partido.getId()==34|| partido.getId()==35|| partido.getId()==36  ) {
						System.out.println("_________________________________");
						System.out.println(partido.getNombre()+ partido.getDetalle());
					}
				}
			}
			for (Pais pais: paises) {
				if (grupo.equalsIgnoreCase("F") && pais.getGrupo()=="F") {
					System.out.println(" → "+pais.getNombre()+ " consiguio el puesto " +pais.getPuestoGrupo());
				}
			}
			
			for (Partido partido : partidos) {// GRUPO G
				if (grupo.equalsIgnoreCase("G")) {
					if (partido.getId()==37 || partido.getId()==38 || partido.getId()==39 || partido.getId()==40|| partido.getId()==41|| partido.getId()==42  ) {
						System.out.println("_________________________________");
						System.out.println(partido.getNombre()+ partido.getDetalle());
					}
				}
			}
			for (Pais pais: paises) {
				if (grupo.equalsIgnoreCase("G") && pais.getGrupo()=="G") {
					System.out.println(" → "+pais.getNombre()+ " consiguio el puesto " +pais.getPuestoGrupo());
				}
			}
			
			for (Partido partido : partidos) {// GRUPO H
				if (grupo.equalsIgnoreCase("H")) {
					if (partido.getId()==43 || partido.getId()==44 || partido.getId()==45 || partido.getId()==46|| partido.getId()==47|| partido.getId()==48  ) {
						System.out.println("_________________________________");
						System.out.println(partido.getNombre()+ partido.getDetalle());
					}
				}
			}
			for (Pais pais: paises) {
				if (grupo.equalsIgnoreCase("H") && pais.getGrupo()=="H") {
					System.out.println(" → "+pais.getNombre()+ " consiguio el puesto " +pais.getPuestoGrupo());
				}
			}
		}
		System.out.println(""); //espacio separador
	}
	
	public static void clasificadosGrupo(LinkedList<Pais> paises, LinkedList<Partido> partidos, LinkedList<Pais> octavos) {
		System.out.println("##########################################");
		System.out.println("# - Clasificados por grupos");
		System.out.println("# Escoja el Grupo que desea ver: ");
		System.out.println("#       A-B-C-D-E-F-G-H");
		System.out.println("# X ← Atras ");
		Scanner entrada = new Scanner(System.in);
		String grupo = entrada.next();
		
		if(paises.isEmpty()) {
			System.out.println("Lista vacia pá");
		
		}else {
			for (Pais pais : paises) {
				if(pais.getGrupo().equalsIgnoreCase(grupo) && pais.isCalificado()) {
					System.out.println(pais.getNombre()+" clasifico en puesto N°: "+pais.getPuestoGrupo());
					System.out.println("En el grupo "+pais.getGrupo());
					System.out.println("Puntos totales: "+pais.getPuntos()+" puntos.\n");			
				}
			}
		}
		if (grupo.equalsIgnoreCase("x")) {
			imprimirMenu(paises, partidos, octavos);
		} else {
			clasificadosGrupo(paises, partidos, octavos);
		}
	}

	public static void listaOctavos(LinkedList<Pais> octavos) {
		if(octavos.isEmpty()) {
			System.out.println("Lista de Octavos vacia pá");
		
		}else {
			System.out.println("Estos son los "+octavos.size()+" equipos que\n"
					+ "participarán de la face de Octavos:\n");
			for (Pais pais : octavos) {	
				System.out.println("Equipo "+pais.getId()+ " = "+ pais.getNombre() + " | Grupo: " + pais.getGrupo());
			}
		}
		System.out.println(); //Espacio separador
	}

	
}