package logica;

import java.util.Scanner;

public class Encargado {
	
	private String dni;
	private String nombre;
	private String apellido;
	
	public Encargado(String dni, String nombre, String apellido) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
	}

	@Override
	public String toString() {
		return "Encargado [dni=" + dni + ", nombre=" + nombre + ", apellido=" + apellido + "]";
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	public void cargarResultado(Partido partido) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("¿Cuantos goles hizo " + partido.getPais1().getNombre() +"?");
		int goles1 = entrada.nextInt();	
		
		partido.getPais1().setGoles(goles1);
		
		System.out.println("¿Cuantos goles hizo " + partido.getPais2().getNombre() +"?");
		int goles2 = entrada.nextInt();	
		
		partido.getPais2().setGoles(goles2);
		
		
		if (partido.getPais1().getGoles() > partido.getPais2().getGoles() ) {
			partido.getPais2().setCalificado(false);
			System.out.println("Ganó "+  partido.getPais1().getNombre());
			
		} else if (partido.getPais1().getGoles() < partido.getPais2().getGoles() ){
			partido.getPais1().setCalificado(false);
			System.out.println("Ganó "+  partido.getPais2().getNombre());
			
		}else {
			System.out.println("Empate");
		}
		
		
	}
	

	
	
}
