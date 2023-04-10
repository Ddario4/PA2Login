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

	
	  public int ObtenerIdAlumno(String correo, String contraseña)
      {
		  int id = 0; 
		  try(Connection conn =  DriverManager.getConnection( String.format("jdbc:mysql://%s:%s/%s",_IP,_PORT,_BD ), _USER, _PASSWORD);
		            CallableStatement cs = conn.prepareCall("{call validar_user(?,?)}")) 
		        {
		            
		            cs.setString(1, correo);
		            cs.setString(2, contraseña);
		            cs.execute();
		            rs = cs.executeQuery();
		             
		            if (rs.next()) {
		            	id=  rs.getInt("idAlumno");
		            }
		            
		            conn.close();
		            cs.close();
		        }
		       catch (SQLException e) {
		            e.printStackTrace();
		        }
		        
		        return id;
		    }
	

	  public void cambiarContrasena(int idAlumno, String contrasenaAnterior, String nuevaContrasena)  {
		    String sql = "{CALL cambiar_contrasena(?, ?, ?)}";
			  try(Connection conn =  DriverManager.getConnection( String.format("jdbc:mysql://%s:%s/%s",_IP,_PORT,_BD ), _USER, _PASSWORD);
		        CallableStatement cs = conn.prepareCall(sql)) {
		    	cs.setInt(1, idAlumno);
		    	cs.setString(2, contrasenaAnterior);
		    	cs.setString(3, nuevaContrasena);
		    	 cs.executeUpdate();
		            
		            System.out.println("Editado exitosamente.");
		        } catch(SQLException e) {
		            e.printStackTrace();
		        }
		    }
}	


