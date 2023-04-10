package svl;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import bean.Alumno;
import dao.AlumnoDAO;

/**
 * Servlet implementation class svlLogin
 */
public class svlLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public svlLogin() {
        super();
        // TODO Auto-generated constructor stub
    }

 protected void proccesRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	
    	AlumnoDAO dao = new AlumnoDAO();
    	response.setCharacterEncoding("UTF-8");
		
    	String nombre = request.getParameter("txtCorreo");
		String apellido=request.getParameter("txtContra");
		
		boolean b = dao.ValidarUser(nombre, apellido);
		
		if (b==true) {
			
			
			
		response.sendRedirect("Bienvenida.jsp");

		}else  {
			response.sendRedirect("fail.jsp");	
			
		}
		
		
	
			
		}
		
			
			
		
		
		
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		proccesRequest(request, response);	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		proccesRequest(request, response);
	}

}
