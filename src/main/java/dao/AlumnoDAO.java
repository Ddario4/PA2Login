package dao;
import java.util.ArrayList;
import java.util.List;
import java.sql.*;
import bean.Alumno;


public class AlumnoDAO {
	bd.Db db= new bd.Db("sise");
	String _IP="localhost",_PORT="3306",_BD="sise",
			_USER="root",_PASSWORD="",_SQL="";
	Connection conexion = null;
    CallableStatement cs = null;
    ResultSet rs = null;
   
    
    
	public void agregarAlumno(Alumno alumno) {
	        try(Connection conn =  DriverManager.getConnection( String.format("jdbc:mysql://%s:%s/%s",_IP,_PORT,_BD ), _USER, _PASSWORD);
	            CallableStatement cs = conn.prepareCall("{CALL RegistrarAlumno(?,?,?,?)}")) 
	        {
	            
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
	
	  public boolean ValidarUser(String correo, String contraseña)
      {
		  boolean resultado = false; 
		  try(Connection conn =  DriverManager.getConnection( String.format("jdbc:mysql://%s:%s/%s",_IP,_PORT,_BD ), _USER, _PASSWORD);
		            CallableStatement cs = conn.prepareCall("{call validar_usuario(?,?,?)}")) 
		        {
		            
		            cs.setString(1, correo);
		            cs.setString(2, contraseña);
		            cs.registerOutParameter(3, java.sql.Types.INTEGER);	          
		            cs.execute();
		         
		            int res = cs.getInt(3);   
		            if (res == 1) {
		                resultado = true;
		            }
		            
		            conn.close();
		            cs.close();
		        }
		       catch (SQLException e) {
		            e.printStackTrace();
		        }
		        
		        return resultado;
		    }

	
	
	


}
