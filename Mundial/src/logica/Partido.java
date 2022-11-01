package logica;

public class Partido {
	
	private Pais pais1;
	private Pais pais2;
//	sprivate String resultado;
	
	public Partido(Pais pais1, Pais pais2) {
		super();
		this.pais1 = pais1;
		this.pais2 = pais2;
		//this.resultado = resultado;
	}

	@Override
	public String toString() {
		return "Partido [pais1=" + pais1 + ", pais2=" + pais2 + "]";
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
	
	

	public void jugar(Pais pais1, Pais pais2){
	
		int aux1 = (int) Math.random();
		System.out.println(aux1);
		
		
		
//		pais1.setGoles(aux1 + pais1.getGoles()); 
//		System.out.println(pais1.getNombre() + " ha metido " + aux1);
		
	}
}
