package logica;

public class Pais {
	private String id;
	private String nombre;
	private int goles;
	private String grupo;
	private boolean calificado;
	private int puntos;
	private int puestoGrupo;
	private String partidoOctavos;
	private String partidoCuartos;
	private String partidoSemifinal;
	private String porPartidoTercerPuesto;
	
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
				+ calificado + ", puntos=" + puntos + ", puestoGrupo=" + puestoGrupo + ", partidoOctavos="
				+ partidoOctavos + ", partidoCuartos=" + partidoCuartos + ", partidoSemifinal=" + partidoSemifinal
				+ ", tercerPuesto=" + porPartidoTercerPuesto + "]";
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

	public int getPuntos() {
		return puntos;
	}

	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}

	public int getPuestoGrupo() {
		return puestoGrupo;
	}

	public void setPuestoGrupo(int puestoGrupo) {
		this.puestoGrupo = puestoGrupo;
	}

	public String getPartidoOctavos() {
		return partidoOctavos;
	}

	public void setPartidoOctavos(String partidoOctavos) {
		this.partidoOctavos = partidoOctavos;
	}

	public String getPartidoCuartos() {
		return partidoCuartos;
	}

	public void setPartidoCuartos(String partidoCuartos) {
		this.partidoCuartos = partidoCuartos;
	}

	public String getPartidoSemifinal() {
		return partidoSemifinal;
	}

	public void setPartidoSemifinal(String partidoSemifinal) {
		this.partidoSemifinal = partidoSemifinal;
	}

	public String getPorPartidoTercerPuesto() {
		return porPartidoTercerPuesto;
	}

	public void setPorPartidoTercerPuesto(String porPartidoTercerPuesto) {
		this.porPartidoTercerPuesto = porPartidoTercerPuesto;
	}
	
	
	
	
	

}
