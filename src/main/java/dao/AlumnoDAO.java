package dao;
import java.util.ArrayList;
import java.util.List;
import java.sql.*;
import bean.Alumno;


public class AlumnoDAO {
	bd.Db db= new bd.Db("sise");
	String _IP="localhost",_PORT="3306",_BD="sise",
			_USER="root",_PASSWORD="",_SQL="";
	
	public void agregarAlumno(Alumno alumno) {
	        try(Connection conn =  DriverManager.getConnection( String.format("jdbc:mysql://%s:%s/%s",_IP,_PORT,_BD ), _USER, _PASSWORD);
	            CallableStatement cs = conn.prepareCall("{CALL agregar_alumno(?,?,?,?)}")) {
	            
	            cs.setString(1, alumno.getNombres());
	            cs.setString(2, alumno.getApellidos());
	            cs.setString(3, alumno.getCorreo());
	            cs.setString(4, alumno.getContraseña());

	            cs.executeUpdate();
	            
	            System.out.println("Alumno agregado exitosamente.");
	        } catch(SQLException e) {
	            e.printStackTrace();
	        }
	    }
	
	
	
	


}
