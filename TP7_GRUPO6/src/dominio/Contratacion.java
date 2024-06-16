package dominio;

public class Contratacion {
	private int idContratacion;
	private String nombreUsuario;
	private int idSeguro;
	private float costoContratacion;
	private static int contadorId = 0;
	
	public Contratacion() {
		
	}
	
	public Contratacion(int idContratacion, String nombreUsuario, int idSeguro, float costoContratacion) {
		contadorId++;
		this.idContratacion = contadorId;
		this.nombreUsuario = nombreUsuario;
		this.idSeguro = idSeguro;
		this.costoContratacion = costoContratacion;
	}
	public int getIdContratacion() {
		return idContratacion;
		/*lalalalala*/
	}
	public void setIdContratacion(int idContratacion) {
		this.idContratacion = idContratacion;
	}
	public String getNombreUsuario() {
		return nombreUsuario;
	}
	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}
	public int getIdSeguro() {
		return idSeguro;
	}
	public void setIdSeguro(int idSeguro) {
		this.idSeguro = idSeguro;
	}
	public float getCostoContratacion() {
		return costoContratacion;
	}
	public void setCostoContratacion(float costoContratacion) {
		this.costoContratacion = costoContratacion;
	}

	@Override
	public String toString() {
		return "Contratacion [idContratacion=" + idContratacion + ", nombreUsuario=" + nombreUsuario + ", idSeguro="
				+ idSeguro + ", costoContratacion=" + costoContratacion + "]";
	}
}
