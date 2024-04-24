package ejercicios;

public class Novela extends Libro {
	private String tipoNovela;
	
	public Novela(String titulo, String autor, double precio, String tipoNovela) {
		super(titulo, autor, precio);
		this.tipoNovela = tipoNovela;
	}

	public String getTipoNovela() {
		return tipoNovela;
	}

	public void setTipoNovela(String tipoNovela) {
		this.tipoNovela = tipoNovela;
	}
	
	
	@Override
	public void mostrarInformacion() {
		super.mostrarInformacion();
		System.out.println("Tipo de novela: "+ tipoNovela);
	}

}
