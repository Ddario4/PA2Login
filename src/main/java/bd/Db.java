package bd;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class Db {

	String _IP="localhost",_PORT="3306",_BD="",
			_USER="root",_PASSWORD="",_SQL="";
	Connection cn = null;
	PreparedStatement ps = null;
	
	
	public Db(String bd) {
		this._BD = bd;
		getConexion();
	}
	
	private void getConexion() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			cn = DriverManager.getConnection( String.format("jdbc:mysql://%s:%s/%s",_IP,_PORT,_BD ), _USER, _PASSWORD);
		} catch (ClassNotFoundException | SQLException e) { e.printStackTrace(); }
	}
	
	
	
	public void Sentencia(String sql) {
			
		
		if ( cn == null ) return;
	
		
		this._SQL = sql;
		try {
			ps = cn.prepareStatement(sql);
		} catch (SQLException e) { e.printStackTrace(); }
		
	}


	

	
	
	
	
	
	
}
