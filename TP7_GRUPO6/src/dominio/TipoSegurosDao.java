package dominio;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class TipoSegurosDao {

	private String host = "jdbc:mysql://localhost:3306/";
	private String user = "root";
	private String pass = "root";
	private String dbName = "bdSegurosGroup";
	
	public ArrayList<TipoSeguros> obtenerTipoSeguros(){
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			}catch(ClassNotFoundException e) {
				e.printStackTrace();
			}
		ArrayList<TipoSeguros> lista = new ArrayList<TipoSeguros>();
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(host + dbName, user, pass);
			Statement st = conn.createStatement();
			
			ResultSet rs = st.executeQuery("Select idTipo, descripcion FROM tipoSeguros");
			
			while(rs.next()) {
				TipoSeguros tipoSeguro = new TipoSeguros();
				tipoSeguro.setIdTipo(rs.getInt("idTipo"));
				tipoSeguro.setDescripcion(rs.getString("descripcion"));
				
				lista.add(tipoSeguro);
			}
			conn.close();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			
		}
		return lista;
		
	}
}
