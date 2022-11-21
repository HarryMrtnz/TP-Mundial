package logica;

public class Partido {
	private int id = 0;
	private String nombre;
	private Pais pais1;
	private Pais pais2;
	private String detalle;
	private int duracion;

	public Partido(int id, Pais pais1, Pais pais2) {
		super();
		this.id = id;
		this.pais1 = pais1;
		this.pais2 = pais2;
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
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
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
	
	public String getDetalle() {
		return detalle;
	}

	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}
	
	//Metodo para jugar en face de Grupos, donde no se desempata y clasificar por puntos
	public void jugar1(Pais pais1, Pais pais2) { 
		int gol1, gol2, tiempoExtra; //Goles de cada equipo
		gol1 =(int) (Math.random()*6 );
		gol2 =(int) (Math.random()*6 );
		tiempoExtra =(int) (Math.random()*10 );
		
		this.setDuracion(90+tiempoExtra);
		this.nombre = pais1.getNombre()+" vs " +pais2.getNombre();
		
		pais1.setGoles(pais1.getGoles()+gol1);
		pais2.setGoles(pais2.getGoles()+gol2);
		//Pais que gana suma 3 puntos, pais que pierde no suma puntos, partido empatado ambos suman 1 punto
		if (gol1 > gol2) {
			pais1.setPuntos(pais1.getPuntos()+3);
			this.detalle = "\n Gano " + pais1.getNombre()+"\n"
					+ " Resultado: "+ pais1.getNombre()+" "+gol1+" | "+ gol2 +" "+ pais2.getNombre()+"\n" 
					+ "Duracion total de partido: "+this.getDuracion()+" minutos.\n" ;		
		} else if(gol1 < gol2){
			pais2.setPuntos(pais2.getPuntos()+3);
			this.detalle = "\n Gano " + pais2.getNombre()+"\n"
					+ " Resultado: "+ pais1.getNombre()+" "+gol1+" | "+ gol2 +" "+ pais2.getNombre()+"\n" 
					+ "Duracion total de partido: "+this.getDuracion()+" minutos.\n" ;
		} else {
			pais1.setPuntos(pais1.getPuntos()+1);
			pais2.setPuntos(pais2.getPuntos()+1);
			this.detalle = "\n Partido empatado \n"
					+ " Resultado: "+ pais1.getNombre()+" "+gol1+" | "+ gol2 +" "+ pais2.getNombre()+"\n" 
					+ "Duracion total de partido: "+this.getDuracion()+" minutos.\n" ;
		}	
	}
	
	//metodo para jugar en octavos, pais que gana pasa de ronda, empate van a penales!
	public void jugar2(Pais pais1, Pais pais2) {
		int gol1, gol2, tiempoExtra; //Goles de cada equipo
		gol1 =(int) (Math.random()*6 );
		gol2 =(int) (Math.random()*6 );
		
		tiempoExtra =(int) (Math.random()*10 );
		this.setDuracion(90+tiempoExtra);
		this.nombre = pais1.getNombre()+" vs " +pais2.getNombre();
		
		pais1.setGoles(pais1.getGoles()+gol1);
		pais2.setGoles(pais2.getGoles()+gol2);
		//Pais que gana suma 3 puntos, pais que pierde no suma puntos, partido empatado ambos suman 1 punto
		if (gol1 > gol2) {
			pais2.setCalificado(false);
			this.detalle = "\n Gano " + pais1.getNombre()+"\n"
					+ " Resultado: "+ pais1.getNombre()+" "+gol1+" | "+ gol2 +" "+ pais2.getNombre()+"\n" 
					+ "Duracion total de partido: "+this.getDuracion()+" minutos." ;	
		} else if(gol1 < gol2){
			pais1.setCalificado(false);
			this.detalle = "\n Gano " + pais2.getNombre()+"\n"
					+ " Resultado: "+ pais1.getNombre()+" "+gol1+" | "+ gol2 +" "+ pais2.getNombre()+"\n" 
					+ "Duracion total de partido: "+this.getDuracion()+" minutos." ;
		} else { //empate
			int gol3, gol4; //Goles de cada equipo
			gol3 =(int) (Math.random()*6 );
			gol4 =(int) (Math.random()*6 );
			tiempoExtra =(int) (Math.random()*5 );
			this.setDuracion(90+tiempoExtra+15);
			
			pais1.setGoles(pais1.getGoles()+gol3);
			pais2.setGoles(pais2.getGoles()+gol4);
			if (gol3 >= gol4) {
				pais2.setCalificado(false);
				this.detalle = "\n Partido empatado.\n Definicion por penales.\n Gano " + pais1.getNombre()+"\n"
						+ " Resultado: "+ pais1.getNombre()+" "+ gol1+" ("+gol3+") | ("+ gol4 +") "+gol2+" "+ pais2.getNombre()+"\n" 
						+ "Duracion total de partido: "+this.getDuracion()+" minutos.\n" ;	
			} else {
				pais1.setCalificado(false);
				this.detalle = "\n Partido empatado.\n Definicion por penales.\n Gano " + pais2.getNombre()+"\n"
						+ " Resultado: "+ pais1.getNombre()+" "+ gol1+" ("+gol3+") | ("+ gol4 +") "+gol2+" "+ pais2.getNombre()+"\n" 
						+ "Duracion total de partido: "+this.getDuracion()+" minutos.\n" ;
			} 
		}
	}
	
	//metodo para jugar por el tercer puesto ya que ambos equipos perdieron tienen getCalificado=false
	public void jugar3(Pais pais1, Pais pais2) {
		int gol1, gol2, tiempoExtra; //Goles de cada equipo
		gol1 =(int) (Math.random()*6 );
		gol2 =(int) (Math.random()*6 );
		
		tiempoExtra =(int) (Math.random()*10 );
		this.setDuracion(90+tiempoExtra);
		this.nombre = pais1.getNombre()+" vs " +pais2.getNombre();
		
		pais1.setGoles(pais1.getGoles()+gol1);
		pais2.setGoles(pais2.getGoles()+gol2);
		//Pais que gana suma 3 puntos, pais que pierde no suma puntos, partido empatado ambos suman 1 punto
		if (gol1 > gol2) {
			pais1.setPorPartidoTercerPuesto("Gano");
			this.detalle = "\n Gano " + pais1.getNombre()+"\n"
					+ " Resultado: "+ pais1.getNombre()+" "+gol1+" | "+ gol2 +" "+ pais2.getNombre()+"\n" 
					+ "Duracion total de partido: "+this.getDuracion()+" minutos." ;	
		} else if(gol1 < gol2){
			pais2.setPorPartidoTercerPuesto("Gano");
			this.detalle = "\n Gano " + pais2.getNombre()+"\n"
					+ " Resultado: "+ pais1.getNombre()+" "+gol1+" | "+ gol2 +" "+ pais2.getNombre()+"\n" 
					+ "Duracion total de partido: "+this.getDuracion()+" minutos." ;
		} else { //empate
			int gol3, gol4; //Goles de cada equipo
			gol3 =(int) (Math.random()*6 );
			gol4 =(int) (Math.random()*6 );
			tiempoExtra =(int) (Math.random()*5 );
			this.setDuracion(90+tiempoExtra+15);
			
			pais1.setGoles(pais1.getGoles()+gol3);
			pais2.setGoles(pais2.getGoles()+gol4);
			if (gol3 >= gol4) {
				pais1.setPorPartidoTercerPuesto("Gano");
				this.detalle = "\n Partido empatado.\n Definicion por penales.\n Gano " + pais1.getNombre()+"\n"
						+ " Resultado: "+ pais1.getNombre()+" "+ gol1+" ("+gol3+") | ("+ gol4 +") "+gol2+" "+ pais2.getNombre()+"\n" 
						+ "Duracion total de partido: "+this.getDuracion()+" minutos.\n" ;	
			} else {
				pais2.setPorPartidoTercerPuesto("Gano");
				this.detalle = "\n Partido empatado.\n Definicion por penales.\n Gano " + pais2.getNombre()+"\n"
						+ " Resultado: "+ pais1.getNombre()+" "+ gol1+" ("+gol3+") | ("+ gol4 +") "+gol2+" "+ pais2.getNombre()+"\n" 
						+ "Duracion total de partido: "+this.getDuracion()+" minutos.\n" ;
			} 
		}
	}
	

}