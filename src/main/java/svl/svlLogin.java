package svl;

import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import jakarta.websocket.Session;

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
    	HttpSession session = request.getSession();
    	
    	String correo = request.getParameter("txtCorreo");
		String contra=request.getParameter("txtContra");
			Object id=dao.ObtenerIdAlumno(correo, contra)	;
		boolean b = dao.ValidarUser(correo, contra);
		
		if (b==true) {
			
	
		
		
		session.setAttribute("id",id);
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
