public class Enciclopedia extends Libro {

	//atributos
	private int tomos;
	private int conceptos;

	//getters
	public int getTomos() {
		return this.tomos;
	}

	public int getConceptos() {
		return this.conceptos;
	}

	//setters
	public void setTomos(int cantidadTomos) {
		this.tomos = cantidadTomos;
	}

	public void setConceptos(int cantidadConceptos) {
		this.conceptos = cantidadConceptos;
	}
	
}