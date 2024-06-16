package dominio;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class SegurosDao {
	
	private String host = "jdbc:mysql://localhost:3306/";
	private String user = "root";
	private String pass = "root";
	private String dbName = "SegurosGroup";
	private static final String ultimoId = "SELECT  idSeguro\r\n" + 
			"FROM  seguros\r\n" + 
			"ORDER BY idSeguro DESC \r\n" + 
			"LIMIT 1";
	
	public int agregarSeguro(Seguros seguro) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	int filas =0;
	Connection cn =null;
	
	try {
		cn= DriverManager.getConnection(host+dbName, user, pass);
		Statement st = cn.createStatement();
		String query = "Insert into seguros(descripcion,idTipo,costoContratacion,costoAsegurado) VALUES('"+seguro.getDescripcion()+"','"+seguro.getIdTipo()+"','"+seguro.getCostoContratacion()+"','"+seguro.getCostoAsegurado()+"')";
		filas= st.executeUpdate(query);
	}catch(Exception e) {
		e.printStackTrace();
	}
	return filas;
	}
	
	public int proximoIdSeguro() {
	
		PreparedStatement st;
		ResultSet resultSet;
		int proximoId = 1;
		Conexion conexion = Conexion.getConexion();
		try {
			st = conexion.getSQLConexion().prepareStatement(ultimoId);
			resultSet = st.executeQuery();
			while(resultSet.next()) {
				proximoId = resultSet.getInt("idSeguro")+1;
				
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return proximoId;
		}

}
