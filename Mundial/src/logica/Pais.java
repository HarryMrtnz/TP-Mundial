package logica;

public class Pais {
	private String id;
	private String nombre;
	private int goles;
	private String grupo;
	private boolean calificado;
	
	public Pais(String id, String nombre, int goles, String grupo, boolean calificado) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.goles = goles;
		this.grupo = grupo;
		this.calificado = calificado;
	}

	@Override
	public String toString() {
		return "Pais [id=" + id + ", nombre=" + nombre + ", goles=" + goles + ", grupo=" + grupo + ", calificado="
				+ calificado + "]";
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getGoles() {
		return goles;
	}

	public void setGoles(int goles) {
		this.goles = goles;
	}

	public String getGrupo() {
		return grupo;
	}

	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}

	public boolean isCalificado() {
		return calificado;
	}

	public void setCalificado(boolean calificado) {
		this.calificado = calificado;
	}
	
	
	
	
	

}
