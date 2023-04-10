package svl;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import bean.Alumno;
import dao.AlumnoDAO;
import java.io.IOException;

/**
 * Servlet implementation class svlAlumno
 */
public class svlAlumno extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public svlAlumno() {
        super();
        // TODO Auto-generated constructor stub
    }

  protected void proccesRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	
    	AlumnoDAO dao = new AlumnoDAO();
    	response.setCharacterEncoding("UTF-8");
		HttpSession session = request.getSession();
		
		String nombre = request.getParameter("txtNombres");
		String apellido=request.getParameter("txtApellido");
		String correo=request.getParameter("txtCorreo");
		String contra=request.getParameter("txtContra");
		Alumno alu = new Alumno();
		alu.setNombres(nombre);
		alu.setApellidos(apellido);
		alu.setCorreo(correo);
		alu.setContraseña(contra);
		
		try {
				dao.agregarAlumno(alu);
					response.sendRedirect("inicio.jsp");
				
		} catch (Exception e) {
			e.printStackTrace();
		}
	
		
	
			
		}
		
			
			
		
		
		
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		proccesRequest(request, response);	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		proccesRequest(request, response);
	}

}
