//superclase
public class Libro {
	//atributos
	private String tipoLibro;
	private int paginas;
	private String ISBN;
	private String nombre;

	//constructor por defecto
	Libro() {
		this.tipoLibro = "";
		this.paginas = 0;
		this.ISBN = "";
		this.nombre = "";
	}

	//getters
	public String getTipolibro() {
		return this.tipoLibro;
	}

	public int getPaginas() {
		return this.paginas;
	}

	public String getISBN() {
		return this.ISBN;
	}

	public String getNombre() {
		return this.nombre;
	}

	//setters
	public void setTipoLibro(String tipo) {
		this.tipoLibro = tipo;
	}

	public void setPaginas(int cantidad) {
		this.paginas = cantidad;
	}

	public void setISBN(String id) {
		this.ISBN = id;
	}

	public void setNombre(String nombreLibro) {
		this.nombre = nombreLibro;
	}

}