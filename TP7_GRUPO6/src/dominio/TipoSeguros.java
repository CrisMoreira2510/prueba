package dominio;

public class TipoSeguros {
	private int idTipo;
	private String descripcion;
	private static int contadorId = 0;
	
	
	public TipoSeguros() {
		contadorId++;
		this.idTipo = contadorId;
		this.descripcion = "";
	
	}
	
	public TipoSeguros(int idTipo, String descripcion) {
		contadorId++;
		this.idTipo = contadorId;
		this.descripcion = descripcion;
	}
	public int getIdTipo() {
		return idTipo;
	}
	public void setIdTipo(int idTipo) {
		this.idTipo = idTipo;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Override
	public String toString() {
		return "tipoSeguros [idTipo=" + idTipo + ", descripcion=" + descripcion + "]";
	}
	
}
