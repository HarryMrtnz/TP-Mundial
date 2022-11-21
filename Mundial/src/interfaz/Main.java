package interfaz;

import java.util.LinkedList;
import java.util.Scanner;

import logica.Encargado;
import logica.Pais;
import logica.Partido;

public class Main {

	public static void main(String[] args) {
		
		System.out.println(" - PROGRAMACION ORIENTADA A OBJETOS - TP2"
				+ "\n	  - MUNDIAL QATAR 2022 -"
				+ "\n__________________________________________\n");
		
		Encargado e1 = new Encargado ("34704934", "Harry", "Mrtnz");
		
		System.out.println("...Añadiendo paises que participaran del Mundial.");
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

		System.out.println("...Generando partidos de grupo.");
		LinkedList<Partido> listaPartidos = new LinkedList<Partido>();
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
		
		Partido p43 = new Partido (43, portugal, ghana);			listaPartidos.add(p43);
		Partido p44 = new Partido (44, uruguay, korea_republic);	listaPartidos.add(p44);
		Partido p45 = new Partido (45, portugal, uruguay);			listaPartidos.add(p45);
		Partido p46 = new Partido (46, korea_republic, ghana);		listaPartidos.add(p46);
		Partido p47 = new Partido (47, korea_republic, portugal);	listaPartidos.add(p47);
		Partido p48 = new Partido (48, ghana, uruguay);				listaPartidos.add(p48);
		System.out.println("...Calculando puestos de face de grupos.");
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
		
		System.out.println("...Lista de face Octavos terminada.");
		LinkedList<Pais> listaOctavos = new LinkedList<Pais>();
		for (Pais pais : listaPaises) {
			if (pais.isCalificado()) {
				listaOctavos.add(pais);
			}
		}
		faceOctavos(listaOctavos, listaPartidos);
		System.out.println("...Lista de face Cuartos terminada.");
		LinkedList<Pais> listaCuartos = new LinkedList<Pais>();
		for (Pais pais : listaOctavos) {
			if (pais.isCalificado()) {
				listaCuartos.add(pais);
			}
		}
		System.out.println("...Lista de face Cuartos terminada.");
		faceCuartos(listaCuartos, listaPartidos);
		System.out.println("...Lista de face Semifinal terminada.");
		LinkedList<Pais> listaSemifinal = new LinkedList<Pais>();
		for (Pais pais : listaCuartos) {
			if (pais.isCalificado()) {
				listaSemifinal.add(pais);
			}
		}
		faceSemifinal(listaSemifinal, listaPartidos);
		System.out.println("...Lista de partido por Tercer Puesto terminada.");
		System.out.println("...Lista de partido final terminada.");
		LinkedList<Pais> listaTercerPuesto = new LinkedList<Pais>();
		LinkedList<Pais> listaFinal = new LinkedList<Pais>();
		System.out.println("...Calculando quienes pasan a la final.");
		for (Pais pais : listaSemifinal) {
			if (pais.isCalificado()) {
				listaFinal.add(pais);
			}else {
				listaTercerPuesto.add(pais);
			}
		}
		faceTercerPuesto(listaTercerPuesto, listaPartidos);
		
		LinkedList<Pais> tercero = new LinkedList<Pais>();
		
		for (Pais pais : listaTercerPuesto) {
			if (pais.getPorPartidoTercerPuesto()=="Gano") {
				tercero.add(pais);
			}
		}
		faceFinal(listaFinal, listaPartidos);
		
		LinkedList<Pais> segundo = new LinkedList<Pais>();
		LinkedList<Pais> ganador = new LinkedList<Pais>();
		System.out.println("...Guardando informacion.");
		for (Pais pais : listaFinal) {
			if (pais.isCalificado()) {
				ganador.add(pais);
			}else {
				segundo.add(pais);
			}
		}
		System.out.println("MUNDIAL GENERADO EXITOSAMENTE.");
		
		//Total de 64 partidos:
		// Face de grupos: 1 al 48 | Face octavos: 49 a 56 | Face cuartos 57 a 60 |
		// Semifinales 61 y 62     | Tercer puesto: 63	   | FINAL: 64

			
		///////////////////////////////////////////////////////////////////////////////////
		///////////////////////////////////////////////////////////////////////////////////
		
		imprimirMenu(listaPaises, listaPartidos, listaOctavos, listaCuartos, listaSemifinal, listaTercerPuesto, listaFinal, tercero, segundo, ganador);
		
	}
	
	public static void imprimirMenu(LinkedList<Pais> listaPaises, LinkedList<Partido> listaPartidos, 
									LinkedList<Pais> listaOctavos,  LinkedList<Pais> listaCuartos,
									LinkedList<Pais> listaSemifinal,  LinkedList<Pais> listaTercerPuesto,
									LinkedList<Pais> listaFinal, LinkedList<Pais> tercero,
									LinkedList<Pais> segundo, LinkedList<Pais> ganador){
		System.out.println("__________________________________________");
		System.out.println("| -  Menu - Mundial Qatar 2022\n|");
		System.out.println("| - Escoja la opcion deseada:");
		System.out.println("|   1- Mostrar todos los equipos.");
		System.out.println("|   2- Buscar equipos por nombre.");
		System.out.println("|   3- Buscar equipos por grupo.\n|");
		System.out.println("| - Face de Grupos, ver: ");
		System.out.println("|   4- Partidos por grupo.");
		System.out.println("|   5- Equipos clasificados.\n|");
		System.out.println("| - Face de Octavos, ver: ");
		System.out.println("|   6- Equipos clasificados a Octavos.");
		System.out.println("|   7- Partidos de Octavos.\n|");
		System.out.println("| - Face de Cuartos, ver: ");
		System.out.println("|   8- Equipos clasificados a Cuartos.");
		System.out.println("|   9- Partidos de Cuartos.\n|");
		System.out.println("| - Face Semifinal, ver: ");
		System.out.println("|  10- Equipos clasificados a Semifinales.");
		System.out.println("|  11- Partidos de Semifinal\n|");
		System.out.println("| - Face Final, ver: ");
		System.out.println("|  12- Clasificados a Tercer Puesto.");
		System.out.println("|  13- Partido por Tercer Puesto");
		System.out.println("|  14- Clasificados a la Final.");
		System.out.println("|  15- Partido final.");
		System.out.println("|  16- Podio Mundial Qatar 2022\n|");
		System.out.println("|  17- Buscar partidos por pais");
		Scanner entrada = new Scanner(System.in);
		int opcion = entrada.nextInt();
		
		switch (opcion) {
		case 1:
			mostrarEquipos(listaPaises);
			imprimirMenu(listaPaises, listaPartidos, listaOctavos, listaCuartos, listaSemifinal, listaTercerPuesto, listaFinal, tercero, segundo, ganador);
			break;
			
		case 2:
			buscarEquipo(listaPaises);
			imprimirMenu(listaPaises, listaPartidos, listaOctavos, listaCuartos, listaSemifinal, listaTercerPuesto, listaFinal, tercero, segundo, ganador);
			break;

		case 3:
			buscarGrupo(listaPaises);
			imprimirMenu(listaPaises, listaPartidos, listaOctavos, listaCuartos, listaSemifinal, listaTercerPuesto, listaFinal, tercero, segundo, ganador);
			break;
			
		case 4:
			buscarPartidoGrupo(listaPartidos, listaPaises);
			imprimirMenu(listaPaises, listaPartidos, listaOctavos, listaCuartos, listaSemifinal, listaTercerPuesto, listaFinal, tercero, segundo, ganador);
			break;
		
		case 5:
			clasificadosGrupo(listaPaises, listaPartidos, listaOctavos, listaCuartos, listaSemifinal, listaTercerPuesto, listaFinal, tercero, segundo, ganador);
			break;
			
		case 6:
			listaOctavos(listaOctavos);
			imprimirMenu(listaPaises, listaPartidos, listaOctavos, listaCuartos, listaSemifinal, listaTercerPuesto, listaFinal, tercero, segundo, ganador);
			break;
			
		case 7:
			verPartidosOctavos(listaPartidos);
			imprimirMenu(listaPaises, listaPartidos, listaOctavos, listaCuartos, listaSemifinal, listaTercerPuesto, listaFinal, tercero, segundo, ganador);
			break;
			
		case 8:
			listaCuartos(listaCuartos);
			imprimirMenu(listaPaises, listaPartidos, listaOctavos, listaCuartos, listaSemifinal, listaTercerPuesto, listaFinal, tercero, segundo, ganador);
			break;
			
		case 9:
			verPartidosCuartos(listaPartidos);
			imprimirMenu(listaPaises, listaPartidos, listaOctavos, listaCuartos, listaSemifinal, listaTercerPuesto, listaFinal, tercero, segundo, ganador);
			break;
			
		case 10:
			listaSemifinal(listaSemifinal); 
			imprimirMenu(listaPaises, listaPartidos, listaOctavos, listaCuartos, listaSemifinal, listaTercerPuesto, listaFinal, tercero, segundo, ganador);
			break;
			
		case 11:
			verPartidosSemifinales(listaPartidos); 
			imprimirMenu(listaPaises, listaPartidos, listaOctavos, listaCuartos, listaSemifinal, listaTercerPuesto, listaFinal, tercero, segundo, ganador);
			break;
			
		case 12:
			listaTercerPuesto(listaTercerPuesto);
			imprimirMenu(listaPaises, listaPartidos, listaOctavos, listaCuartos, listaSemifinal, listaTercerPuesto, listaFinal, tercero, segundo, ganador);
			break;
			
		case 13:
			verPartidoTercerPuesto(listaPartidos);
			imprimirMenu(listaPaises, listaPartidos, listaOctavos, listaCuartos, listaSemifinal, listaTercerPuesto, listaFinal, tercero, segundo, ganador);
			break;
			
		case 14:
			listaFinal(listaFinal);
			imprimirMenu(listaPaises, listaPartidos, listaOctavos, listaCuartos, listaSemifinal, listaTercerPuesto, listaFinal, tercero, segundo, ganador);
			break;
			
		case 15:
			verFinal(listaPartidos);
			imprimirMenu(listaPaises, listaPartidos, listaOctavos, listaCuartos, listaSemifinal, listaTercerPuesto, listaFinal, tercero, segundo, ganador);
			break;
			
		case 16:
			verPodio(tercero, segundo, ganador);	
			imprimirMenu(listaPaises, listaPartidos, listaOctavos, listaCuartos, listaSemifinal, listaTercerPuesto, listaFinal, tercero, segundo, ganador);
			break;
			
		case 17:
			BuscarPartidoEquipos(listaPartidos);
			imprimirMenu(listaPaises, listaPartidos, listaOctavos, listaCuartos, listaSemifinal, listaTercerPuesto, listaFinal, tercero, segundo, ganador);
			break;
			
		default:
			imprimirMenu(listaPaises, listaPartidos, listaOctavos, listaCuartos, listaSemifinal, listaTercerPuesto, listaFinal, tercero, segundo, ganador);
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
	
	public static void mostrarEquipos(LinkedList<Pais> paises){
		if(paises.isEmpty()) {
			System.out.println("Lista vacia pá");
		
		}else {
			System.out.println("Estos son los "+ paises.size()+" paises que participarán del Mundial Qatar 2022");
			for (Pais pais : paises) {	
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
			System.out.println("\nPaises del grupo elegido:");
			for (Pais pais : paises) {
				if(pais.getGrupo().equalsIgnoreCase(grupo)) {
					System.out.println(" → "+pais.getNombre());
//				}else {
//					System.out.println("No se ha encontrado ningun resultado"
//							+ "\nVuelve a intentar");
//					buscarGrupo(listaPais);
				}
	        }
		}
		System.out.println(); //Espacio separador
	}
	
	public static void buscarEquipo(LinkedList<Pais> paises){
		
		System.out.print("ingrese el pais a buscar: ");
		
		Scanner entrada = new Scanner(System.in);
		String equipo = entrada.next();
		
		if(paises.isEmpty()) {
			System.out.println( "Lista vacia pá");
		}else {
			for (Pais pais : paises) {
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
			
		for	(Partido partido : partidos) {
			if (partido.getPais1().getGrupo().equalsIgnoreCase(grupo) && partido.getId() <=48){
				System.out.println("_________________________________");
				System.out.println(partido.getNombre()+ partido.getDetalle());
			}
		}
	}
	
	public static void clasificadosGrupo(LinkedList<Pais> paises, LinkedList<Partido> partidos, LinkedList<Pais> octavos, 
	LinkedList<Pais> cuartos, LinkedList<Pais> semifinal, LinkedList<Pais> tercerPuesto, LinkedList<Pais> listaFinal,
	LinkedList<Pais> tercero, LinkedList<Pais> segundo, LinkedList<Pais> ganador) {
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
				if(pais.getGrupo().equalsIgnoreCase(grupo)) {
					System.out.println(pais.getNombre()+" clasifico en puesto N°: "+pais.getPuestoGrupo());
					System.out.println("En el grupo "+pais.getGrupo());
					System.out.println("Puntos totales: "+pais.getPuntos()+" puntos.\n");			
				}
			}
		}
		if (grupo.equalsIgnoreCase("x")) {
			imprimirMenu(paises, partidos, octavos, cuartos, semifinal, tercerPuesto, listaFinal, tercero, segundo, ganador);
		} else {
			clasificadosGrupo(paises, partidos, octavos, cuartos, semifinal, tercerPuesto, listaFinal, tercero, segundo, ganador);
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
	
	public static void faceOctavos(LinkedList<Pais> octavos, LinkedList<Partido> listaPartidos) {
		if(octavos.isEmpty()) {
			System.out.println("Lista vacia pá");
		
		}else {
			for (Pais pais1 : octavos) {
				for (Pais pais2 : octavos) {
					if (pais1.getPuestoGrupo()==1 && pais1.getGrupo()=="A") {
						if (pais2.getPuestoGrupo()==2 && pais2.getGrupo()=="B") {

							Partido p49 = new Partido(49, pais1, pais2);
							p49.jugar2(pais1, pais2);	listaPartidos.add(p49);
							if (pais1.isCalificado()) {
								pais1.setPartidoOctavos("Gano1");
							} else {
								pais2.setPartidoOctavos("Gano1");
							}
						}
					}
					if (pais1.getPuestoGrupo()==1 && pais1.getGrupo()=="C") {
						if (pais2.getPuestoGrupo()==2 && pais2.getGrupo()=="D") {

							Partido p50 = new Partido(50, pais1, pais2);
							p50.jugar2(pais1, pais2);	listaPartidos.add(p50);
							if (pais1.isCalificado()) {
								pais1.setPartidoOctavos("Gano2");
							} else {
								pais2.setPartidoOctavos("Gano2");
							}
						}
					}
					if (pais1.getPuestoGrupo()==1 && pais1.getGrupo()=="E") {
						if (pais2.getPuestoGrupo()==2 && pais2.getGrupo()=="F") {

							Partido p51 = new Partido(51, pais1, pais2);
							p51.jugar2(pais1, pais2);	listaPartidos.add(p51);
							if (pais1.isCalificado()) {
								pais1.setPartidoOctavos("Gano3");
							} else {
								pais2.setPartidoOctavos("Gano3");
							}
						}
					}
					if (pais1.getPuestoGrupo()==1 && pais1.getGrupo()=="G") {
						if (pais2.getPuestoGrupo()==2 && pais2.getGrupo()=="H") {

							Partido p52 = new Partido(52, pais1, pais2);
							p52.jugar2(pais1, pais2);	listaPartidos.add(p52);
							if (pais1.isCalificado()) {
								pais1.setPartidoOctavos("Gano4");
							} else {
								pais2.setPartidoOctavos("Gano4");
							}
						}
					}
					if (pais1.getPuestoGrupo()==1 && pais1.getGrupo()=="B") {
						if (pais2.getPuestoGrupo()==2 && pais2.getGrupo()=="A") {

							Partido p53 = new Partido(53, pais1, pais2);
							p53.jugar2(pais1, pais2);	listaPartidos.add(p53);
							if (pais1.isCalificado()) {
								pais1.setPartidoOctavos("Gano5");
							} else {
								pais2.setPartidoOctavos("Gano5");
							}
 						}
					}
					if (pais1.getPuestoGrupo()==1 && pais1.getGrupo()=="D") {
						if (pais2.getPuestoGrupo()==2 && pais2.getGrupo()=="C") {

							Partido p54 = new Partido(54, pais1, pais2);
							p54.jugar2(pais1, pais2);	listaPartidos.add(p54);
							if (pais1.isCalificado()) {
								pais1.setPartidoOctavos("Gano6");
							} else {
								pais2.setPartidoOctavos("Gano6");
							}
						}
					}
					if (pais1.getPuestoGrupo()==1 && pais1.getGrupo()=="F") {
						if (pais2.getPuestoGrupo()==2 && pais2.getGrupo()=="E") {

							Partido p55 = new Partido(55, pais1, pais2);
							p55.jugar2(pais1, pais2);	listaPartidos.add(p55);
							if (pais1.isCalificado()) {
								pais1.setPartidoOctavos("Gano7");
							} else {
								pais2.setPartidoOctavos("Gano7");
							}
						}
					}
					if (pais1.getPuestoGrupo()==1 && pais1.getGrupo()=="H") {
						if (pais2.getPuestoGrupo()==2 && pais2.getGrupo()=="G") {

							Partido p56 = new Partido(56, pais1, pais2);
							p56.jugar2(pais1, pais2);	listaPartidos.add(p56);
							if (pais1.isCalificado()) {
								pais1.setPartidoOctavos("Gano8");
							} else {
								pais2.setPartidoOctavos("Gano8");
							}
						}
					}
				}
			}
		}
	}
	
	public static void listaCuartos(LinkedList<Pais> cuartos) {
		if(cuartos.isEmpty()) {
			System.out.println("Lista de cuartos vacia pá");
		
		}else {
			System.out.println("Estos son los "+cuartos.size()+" equipos que\n"
					+ "participarán de la face de Cuartos:\n");
			for (Pais pais : cuartos) {	
				System.out.println("Equipo "+pais.getId()+ " = "+ pais.getNombre() + " | Grupo: " + pais.getGrupo());
			}
		}
		System.out.println(); //Espacio separador
	}
	
	public static void faceCuartos(LinkedList<Pais> cuartos, LinkedList<Partido> listaPartidos) {
		if(cuartos.isEmpty()) {
			System.out.println("Lista vacia pá");
		
		}else {
			for (Pais pais1 : cuartos) {
				for (Pais pais2 : cuartos) {
					if (pais1.getPartidoOctavos()=="Gano1")
						if(pais2.getPartidoOctavos()=="Gano2") {
						Partido p57 = new Partido(57, pais1, pais2);
						p57.jugar2(pais1, pais2);	listaPartidos.add(p57);
						if (pais1.isCalificado()) {
							pais1.setPartidoCuartos("Gano1");

						} else {
							pais2.setPartidoCuartos("Gano1");
						}
					}
					if (pais1.getPartidoOctavos()=="Gano3")
						if(pais2.getPartidoOctavos()=="Gano4") {
						Partido p58 = new Partido(58, pais1, pais2);
						p58.jugar2(pais1, pais2);	listaPartidos.add(p58);
						if (pais1.isCalificado()) {
							pais1.setPartidoCuartos("Gano2");
						} else {
							pais2.setPartidoCuartos("Gano2");

						}
					}
					if (pais1.getPartidoOctavos()=="Gano5")
						if(pais2.getPartidoOctavos()=="Gano6") {
						Partido p59 = new Partido(59, pais1, pais2);
						p59.jugar2(pais1, pais2);	listaPartidos.add(p59);
						if (pais1.isCalificado()) {
							pais1.setPartidoCuartos("Gano3");
						} else {
							pais2.setPartidoCuartos("Gano3");
						}
					}
					if (pais1.getPartidoOctavos()=="Gano7")
						if(pais2.getPartidoOctavos()=="Gano8") {
						Partido p60 = new Partido(60, pais1, pais2);
						p60.jugar2(pais1, pais2);	listaPartidos.add(p60);
						if (pais1.isCalificado()) {
							pais1.setPartidoCuartos("Gano4");
						} else {
							pais2.setPartidoCuartos("Gano4");
						}
					}
				}
			}
		}
	}
	
	public static void listaSemifinal(LinkedList<Pais> semifinal) {
		if(semifinal.isEmpty()) {
			System.out.println("Lista de cuartos vacia pá");
		
		}else {
			System.out.println("Estos son los "+semifinal.size()+" equipos que\n"
					+ "participarán de la face de Cuartos:\n");
			for (Pais pais : semifinal) {	
				System.out.println("Equipo "+pais.getId()+ " = "+ pais.getNombre() + " | Grupo: " + pais.getGrupo());
			}
		}
		System.out.println(); //Espacio separador
	}
	
	public static void faceSemifinal(LinkedList<Pais> semifinal, LinkedList<Partido> listaPartidos) {
		if(semifinal.isEmpty()) {
			System.out.println("Lista vacia pá");
		
		}else {
			for (Pais pais1 : semifinal) {
				for (Pais pais2 : semifinal) {
					if (pais1.getPartidoCuartos()=="Gano1")
						if(pais2.getPartidoCuartos()=="Gano2") {
						Partido p61 = new Partido(61, pais1, pais2);
						p61.jugar2(pais1, pais2);	listaPartidos.add(p61);
						if (pais1.isCalificado()) {
							pais1.setPartidoSemifinal("Gano1");
							pais2.setPorPartidoTercerPuesto("1");
						} else {
							pais2.setPartidoSemifinal("Gano1");
							pais1.setPorPartidoTercerPuesto("1");
						}
					}
					if (pais1.getPartidoCuartos()=="Gano3")
						if(pais2.getPartidoCuartos()=="Gano4") {
						Partido p62 = new Partido(62, pais1, pais2);
						p62.jugar2(pais1, pais2);	listaPartidos.add(p62);
						if (pais1.isCalificado()) {
							pais1.setPartidoSemifinal("Gano2");
							pais2.setPorPartidoTercerPuesto("2");
						} else {
							pais2.setPartidoSemifinal("Gano2");
							pais1.setPorPartidoTercerPuesto("2");

						}
					}
				}
			}
		}
	}
	
	public static void listaTercerPuesto(LinkedList<Pais> tercerPuesto) {
		if(tercerPuesto.isEmpty()) {
			System.out.println("Lista de Tercer Puesto vacia pá");
		
		}else {
			System.out.println("Estos son los "+tercerPuesto.size()+" equipos que\n"
					+ "participarán por el Tercer Puesto:\n");
			for (Pais pais : tercerPuesto) {	
				System.out.println("Equipo "+pais.getId()+ " = "+ pais.getNombre() + " | Grupo: " + pais.getGrupo());
			}
		}
		System.out.println(); //Espacio separador
	}
	
	public static void faceTercerPuesto(LinkedList<Pais> tercerPuesto, LinkedList<Partido> listaPartidos) {
		if(tercerPuesto.isEmpty()) {
			System.out.println("Lista vacia pá");
		
		}else {
			for (Pais pais1 : tercerPuesto) {
				for (Pais pais2 : tercerPuesto) {
					if (pais1.getPorPartidoTercerPuesto()=="1")
						if (pais2.getPorPartidoTercerPuesto()=="2") {
						Partido p63 = new Partido(63, pais1, pais2);
						p63.jugar3(pais1, pais2);	listaPartidos.add(p63);
					}
				}
			}
		}
	}
	
	public static void listaFinal (LinkedList<Pais> listafinal) {
		if(listafinal.isEmpty()) {
			System.out.println("Lista de cuartos vacia pá");
		
		}else {
			System.out.println("Estos son los "+listafinal.size()+" equipos que\n"
					+ "Juegan la Gran Final:\n");
			for (Pais pais : listafinal) {	
				System.out.println("Equipo "+pais.getId()+ " = "+ pais.getNombre() + " | Grupo: " + pais.getGrupo());
			}
		}
		System.out.println(); //Espacio separador
	}
	
	public static void faceFinal(LinkedList<Pais> listaFinal, LinkedList<Partido> listaPartidos) {
		if(listaFinal.isEmpty()) {
			System.out.println("Lista vacia pá");
		
		}else {
			for (Pais pais1 : listaFinal) {
				for (Pais pais2 : listaFinal) {					
					if (pais1.getPartidoSemifinal()=="Gano1")
						if(pais2.getPartidoSemifinal()=="Gano2") {
						Partido p64 = new Partido(64, pais1, pais2);
						p64.jugar2(pais1, pais2);	listaPartidos.add(p64);
					}
				}
			}
		}
	}
	
	public static void verPodio (LinkedList<Pais> tercero, LinkedList<Pais> segundo, LinkedList<Pais> primero) {

		for (Pais pais3 : tercero ) {
			System.out.println("_________________________________");
			System.out.println("Tercer Puesto de Mundial QATAR 2022:\n"
					+ "  Equipo "+pais3.getId()+ " = "+ pais3.getNombre() + " | Grupo: " + pais3.getGrupo()
					+"\n  Goles totales realizados: "+pais3.getGoles()+"\n");
		}
		for (Pais pais2 : segundo) {
			System.out.println("Segundo Puesto de Mundial QATAR 2022:\n"
					+ "  Equipo "+pais2.getId()+ " = "+ pais2.getNombre() + " | Grupo: " + pais2.getGrupo()
					+"\n  Goles totales realizados: "+pais2.getGoles()+"\n");
		}
		for (Pais pais1 : primero) {	
			System.out.println("El Gran ganador Mundial QATAR 2022:\n"
					+ "  Equipo "+pais1.getId()+ " = "+ pais1.getNombre() + " | Grupo: " + pais1.getGrupo()
					+"\n  Goles totales realizados: "+pais1.getGoles()+"\n"
							+ "  "+pais1.getNombre()+" CAMPEON MUNDIAL QATAR 2022");
		}
	}

	public static void verPartidosOctavos (LinkedList<Partido> partidos) {
		if(partidos.isEmpty()) {
			System.out.println( "Lista vacia pá");
		}else {
			for (Partido partido : partidos) {
				if (partido.getId()==49 || partido.getId()==50 || partido.getId()==51 || partido.getId()==52|| partido.getId()==53|| partido.getId()==54||
						partido.getId()==55|| partido.getId()==56  ) {
					System.out.println("_________________________________");
					System.out.println(partido.getNombre()+ partido.getDetalle());
				}
			}
		}
	}
	
	public static void verPartidosCuartos(LinkedList<Partido> partidos) {
		if(partidos.isEmpty()) {
			System.out.println( "Lista vacia pá");
		}else {
			for (Partido partido : partidos) {
				if (partido.getId()==57 || partido.getId()==58 || partido.getId()==59 || partido.getId()==60){
					System.out.println("_________________________________");
					System.out.println(partido.getNombre()+ partido.getDetalle());
				}
			}
		}
	}

	public static void verPartidosSemifinales(LinkedList<Partido> partidos) {
		if(partidos.isEmpty()) {
			System.out.println( "Lista vacia pá");
		}else {
			for (Partido partido : partidos) {
				if (partido.getId()==61 || partido.getId()==62 ){
					System.out.println("_________________________________");
					System.out.println(partido.getNombre()+ partido.getDetalle());
				}
			}
		}
	}
	
	public static void verPartidoTercerPuesto (LinkedList<Partido> partidos) {
		if(partidos.isEmpty()) {
			System.out.println( "Lista vacia pá");
		}else {
			for (Partido partido : partidos) {
				if (partido.getId()==63){
					System.out.println("_________________________________");
					System.out.println(partido.getNombre()+ partido.getDetalle());
				}
			}
		}
	}
	
	public static void verFinal (LinkedList<Partido> partidos) {
		if(partidos.isEmpty()) {
			System.out.println( "Lista de final vacia pá");
		}else {
			for (Partido partido : partidos) {
				if (partido.getId()==64){
					System.out.println("_________________________________");
					System.out.println(partido.getNombre()+ partido.getDetalle());
				}
			}
		}
	}

	public static void BuscarPartidoEquipos(LinkedList<Partido> partidos) {
		
		System.out.print("Escriba el pais para ver sus partidos: ");
		Scanner entrada = new Scanner(System.in);
		String nombrePais = entrada.next();
		
		for(Partido partido: partidos){
		    if(partido.getPais1().getNombre().equalsIgnoreCase(nombrePais) || partido.getPais2().getNombre().equalsIgnoreCase(nombrePais)) {
				System.out.println("_________________________________");
		    	System.out.println(partido.getNombre()+"\n"+partido.getDetalle());
		    	
		    }
		}
	}

}