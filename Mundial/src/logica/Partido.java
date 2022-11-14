package logica;

import java.util.LinkedList;

public class Partido {
	private int id = 0;
	private Pais pais1;
	private Pais pais2;
	private int duracion = 90;

	public Partido(int id, Pais pais1, Pais pais2, int duracion) {
		super();
		this.id = id;
		this.pais1 = pais1;
		this.pais2 = pais2;
		this.duracion = duracion;
	}
	
	public Partido() {

	}
	
	@Override
	public String toString() {
		return "Partido [id=" + id + ", pais1=" + pais1 + ", pais2=" + pais2 + ", duracion=" + duracion + "]";
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Pais getPais1() {
		return pais1;
	}

	public void setPais1(Pais pais1) {
		this.pais1 = pais1;
	}

	public Pais getPais2() {
		return pais2;
	}

	public void setPais2(Pais pais2) {
		this.pais2 = pais2;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

//	Partido partido = new Partido(id++, pais1 ,pais2, duracion);
	
	LinkedList<Pais> listaOctavos = new LinkedList<Pais>();
	LinkedList<Pais> listaCuartos = new LinkedList<Pais>();
	LinkedList<Pais> listaSemifinal = new LinkedList<Pais>();
	LinkedList<Pais> listaTercerPuesto = new LinkedList<Pais>();
	LinkedList<Pais> listaFinal = new LinkedList<Pais>();
	
	LinkedList<Partido> Partidos = new LinkedList<Partido>();

	public LinkedList<Pais> jugarFaceGrupos(Pais pais1, Pais pais2, Pais pais3, Pais pais4){
		int gol1, gol2, gol3, gol4, tiempoExtra; //Goles de cada equipo
		tiempoExtra =(int) (Math.random()*10 ); 

		this.duracion = duracion + tiempoExtra; //Duracion total del partido
		
//		System.out.println(this.pais1.getNombre()+" vs " +this.pais2.getNombre());
		gol1 =(int) (Math.random()*6 );
		gol2 =(int) (Math.random()*6 );
//		System.out.println(this.pais1.getNombre()+ " ha metido " + gol1 + " goles");
//		System.out.println(this.pais2.getNombre()+ " ha metido " + gol2 + " goles");
		
		if (gol1 > gol2) {
			pais1.setPuntos(pais1.getPuntos()+3);
//			System.out.println("Ha ganado " + pais1.getNombre()+"\n");
		} else if(gol1 < gol2){
			pais2.setPuntos(pais2.getPuntos()+3);
//			System.out.println("Ha ganado " + pais2.getNombre()+"\n");
		} else {
			pais1.setPuntos(pais1.getPuntos()+1);
			pais2.setPuntos(pais2.getPuntos()+1);
//			System.out.println("Empate\n");
		}	
//		---------------------------------------------------------------------
//		System.out.println(pais3.getNombre()+" vs " +pais4.getNombre());
		gol3 =(int) (Math.random()*6 );
		gol4 =(int) (Math.random()*6 );
//		System.out.println(pais3.getNombre()+ " ha metido " + aux3 + " goles");
//		System.out.println(pais4.getNombre()+ " ha metido " + aux4 + " goles");
		
//		System.out.println(pais1.getNombre()+" vs " +pais3.getNombre());
		gol1 =(int) (Math.random()*6 );
		gol3 =(int) (Math.random()*6 );
//		System.out.println(pais1.getNombre()+ " ha metido " + aux1 + " goles");
//		System.out.println(pais3.getNombre()+ " ha metido " + aux3 + " goles");
		
		if (gol1 > gol3) {
			pais1.setPuntos(pais1.getPuntos()+3);
//			System.out.println("Ha ganado " + pais1.getNombre()+"\n");
		} else if(gol1 < gol3){
			pais3.setPuntos(pais3.getPuntos()+3);
//			System.out.println("Ha ganado " + pais3.getNombre()+"\n");
		} else {
			pais1.setPuntos(pais1.getPuntos()+1);
			pais3.setPuntos(pais3.getPuntos()+1);
//			System.out.println("Empate\n");
		}
//		---------------------------------------------------------------------
//		System.out.println(pais4.getNombre()+" vs " +pais2.getNombre());
		gol4 =(int) (Math.random()*6 );
		gol2 =(int) (Math.random()*6 );
//		System.out.println(pais4.getNombre()+ " ha metido " + aux4 + " goles");
//		System.out.println(pais2.getNombre()+ " ha metido " + aux2 + " goles");
		
		if (gol4 > gol2) {
			pais4.setPuntos(pais4.getPuntos()+3);
//			System.out.println("Ha ganado " + pais4.getNombre()+"\n");
		} else if(gol4 < gol2){
			pais2.setPuntos(pais2.getPuntos()+3);
//			System.out.println("Ha ganado " + pais2.getNombre()+"\n");
		} else {
			pais4.setPuntos(pais4.getPuntos()+1);
			pais2.setPuntos(pais2.getPuntos()+1);
//			System.out.println("Empate\n");
		}
//		---------------------------------------------------------------------
//		System.out.println(pais4.getNombre()+" vs " +pais1.getNombre());
		gol4 =(int) (Math.random()*6 );
		gol1 =(int) (Math.random()*6 );
//		System.out.println(pais4.getNombre()+ " ha metido " + aux4 + " goles");
//		System.out.println(pais1.getNombre()+ " ha metido " + aux1 + " goles");
		
		if (gol4 > gol1) {
			pais4.setPuntos(pais4.getPuntos()+3);
//			System.out.println("Ha ganado " + pais4.getNombre()+"\n");
		} else if(gol4 < gol1){
			pais1.setPuntos(pais1.getPuntos()+3);
//			System.out.println("Ha ganado " + pais1.getNombre()+"\n");
		} else {
			pais4.setPuntos(pais4.getPuntos()+1);
			pais1.setPuntos(pais1.getPuntos()+1);
//			System.out.println("Empate\n");
		}
//		---------------------------------------------------------------------
//		System.out.println(pais2.getNombre()+" vs " +pais3.getNombre());
		gol2 =(int) (Math.random()*6 );
		gol3 =(int) (Math.random()*6 );
//		System.out.println(pais2.getNombre()+ " ha metido " + aux2 + " goles");
//		System.out.println(pais3.getNombre()+ " ha metido " + aux3 + " goles");
		
		if (gol2 > gol3) {
			pais2.setPuntos(pais2.getPuntos()+3);
//			System.out.println("Ha ganado " + pais2.getNombre()+"\n");
		} else if(gol4 < gol3){
			pais3.setPuntos(pais3.getPuntos()+3);
//			System.out.println("Ha ganado " + pais3.getNombre()+"\n");
		} else {
			pais1.setPuntos(pais1.getPuntos()+1);
			pais3.setPuntos(pais3.getPuntos()+1);
//			System.out.println("Empate\n");
		}
		
		calcularPuestoGrupos(pais1, pais2, pais3, pais4);
			return listaOctavos;
	}

	public void jugarFaceGrupos2(Pais pais1, Pais pais2, Pais pais3, Pais pais4){
		int aux1, aux2, aux3, aux4; //Goles de cada equipo
		
//		System.out.println(pais1.getNombre()+" vs " +pais2.getNombre());
		aux1 =(int) (Math.random()*6 );
		aux2 =(int) (Math.random()*6 );
//		System.out.println(pais1.getNombre()+ " ha metido " + aux1 + " goles");
//		System.out.println(pais2.getNombre()+ " ha metido " + aux2 + " goles");
		
		if (aux1 > aux2) {
			pais1.setPuntos(pais1.getPuntos()+3);
//			System.out.println("Ha ganado " + pais1.getNombre()+"\n");
		} else if(aux1 < aux2){
			pais2.setPuntos(pais2.getPuntos()+3);
//			System.out.println("Ha ganado " + pais2.getNombre()+"\n");
		} else {
			pais1.setPuntos(pais1.getPuntos()+1);
			pais2.setPuntos(pais2.getPuntos()+1);
//			System.out.println("Empate\n");
		}

//		System.out.println(pais3.getNombre()+" vs " +pais4.getNombre());
		aux3 =(int) (Math.random()*6 );
		aux4 =(int) (Math.random()*6 );
//		System.out.println(pais3.getNombre()+ " ha metido " + aux3 + " goles");
//		System.out.println(pais4.getNombre()+ " ha metido " + aux4 + " goles");
		
		if (aux3 > aux4) {
			pais3.setPuntos(pais3.getPuntos()+3);
//			System.out.println("Ha ganado " + pais3.getNombre()+"\n");
		} else if(aux3 < aux4){
			pais4.setPuntos(pais4.getPuntos()+3);
//			System.out.println("Ha ganado " + pais4.getNombre()+"\n");
		} else {
			pais3.setPuntos(pais3.getPuntos()+1);
			pais4.setPuntos(pais4.getPuntos()+1);
//			System.out.println("Empate\n");
		}
		
//		System.out.println(pais1.getNombre()+" vs " +pais3.getNombre());
		aux1 =(int) (Math.random()*6 );
		aux3 =(int) (Math.random()*6 );
//		System.out.println(pais1.getNombre()+ " ha metido " + aux1 + " goles");
//		System.out.println(pais3.getNombre()+ " ha metido " + aux3 + " goles");
		
		if (aux1 > aux3) {
			pais1.setPuntos(pais1.getPuntos()+3);
//			System.out.println("Ha ganado " + pais1.getNombre()+"\n");
		} else if(aux1 < aux3){
			pais3.setPuntos(pais3.getPuntos()+3);
//			System.out.println("Ha ganado " + pais3.getNombre()+"\n");
		} else {
			pais1.setPuntos(pais1.getPuntos()+1);
			pais3.setPuntos(pais3.getPuntos()+1);
//			System.out.println("Empate\n");
		}
		
//		System.out.println(pais4.getNombre()+" vs " +pais2.getNombre());
		aux4 =(int) (Math.random()*6 );
		aux2 =(int) (Math.random()*6 );
//		System.out.println(pais4.getNombre()+ " ha metido " + aux4 + " goles");
//		System.out.println(pais2.getNombre()+ " ha metido " + aux2 + " goles");
		
		if (aux4 > aux2) {
			pais4.setPuntos(pais4.getPuntos()+3);
//			System.out.println("Ha ganado " + pais4.getNombre()+"\n");
		} else if(aux4 < aux2){
			pais2.setPuntos(pais2.getPuntos()+3);
//			System.out.println("Ha ganado " + pais2.getNombre()+"\n");
		} else {
			pais4.setPuntos(pais4.getPuntos()+1);
			pais2.setPuntos(pais2.getPuntos()+1);
//			System.out.println("Empate\n");
		}
		
//		System.out.println(pais4.getNombre()+" vs " +pais1.getNombre());
		aux4 =(int) (Math.random()*6 );
		aux1 =(int) (Math.random()*6 );
//		System.out.println(pais4.getNombre()+ " ha metido " + aux4 + " goles");
//		System.out.println(pais1.getNombre()+ " ha metido " + aux1 + " goles");
		
		if (aux4 > aux1) {
			pais4.setPuntos(pais4.getPuntos()+3);
//			System.out.println("Ha ganado " + pais4.getNombre()+"\n");
		} else if(aux4 < aux1){
			pais1.setPuntos(pais1.getPuntos()+3);
//			System.out.println("Ha ganado " + pais1.getNombre()+"\n");
		} else {
			pais4.setPuntos(pais4.getPuntos()+1);
			pais1.setPuntos(pais1.getPuntos()+1);
//			System.out.println("Empate\n");
		}
		
//		System.out.println(pais2.getNombre()+" vs " +pais3.getNombre());
		aux2 =(int) (Math.random()*6 );
		aux3 =(int) (Math.random()*6 );
//		System.out.println(pais2.getNombre()+ " ha metido " + aux2 + " goles");
//		System.out.println(pais3.getNombre()+ " ha metido " + aux3 + " goles");
		
		if (aux2 > aux3) {
			pais2.setPuntos(pais2.getPuntos()+3);
//			System.out.println("Ha ganado " + pais2.getNombre()+"\n");
		} else if(aux4 < aux3){
			pais3.setPuntos(pais3.getPuntos()+3);
//			System.out.println("Ha ganado " + pais3.getNombre()+"\n");
		} else {
			pais1.setPuntos(pais1.getPuntos()+1);
			pais3.setPuntos(pais3.getPuntos()+1);
//			System.out.println("Empate\n");
		}
		
		System.out.println("#####################");
		System.out.println( pais1.getNombre()+" sumo "+ pais1.getPuntos()+" puntos.");
		System.out.println( pais2.getNombre()+" sumo "+ pais2.getPuntos()+" puntos.");
		System.out.println( pais3.getNombre()+" sumo "+ pais3.getPuntos()+" puntos.");
		System.out.println( pais4.getNombre()+" sumo "+ pais4.getPuntos()+" puntos.\n");
		
		calcularPuestoGrupos(pais1, pais2, pais3, pais4);
	}
	
	public void calcularPuestoGrupos(Pais pais1, Pais pais2, Pais pais3, Pais pais4) {
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

		for (Pais pais : listaOctavos) {
			if (pais.isCalificado()) {
				listaOctavos.add(pais);
		}

//		System.out.println(pais1.getNombre()+ " consiguio el puesto " +pais1.getPuestoGrupo());
//		System.out.println(pais2.getNombre()+ " consiguio el puesto " +pais2.getPuestoGrupo());
//		System.out.println(pais3.getNombre()+ " consiguio el puesto " +pais3.getPuestoGrupo());
//		System.out.println(pais4.getNombre()+ " consiguio el puesto " +pais4.getPuestoGrupo());
//		System.out.println("#####################\n");
//		
//		System.out.println(pais1.getNombre()+ " - calificacion: " +pais1.isCalificado());
//		System.out.println(pais2.getNombre()+ " - calificacion: " +pais2.isCalificado());
//		System.out.println(pais3.getNombre()+ " - calificacion: " +pais3.isCalificado());
//		System.out.println(pais4.getNombre()+ " - calificacion: " +pais4.isCalificado());
//		System.out.println("#####################\n");
		}
	}
}