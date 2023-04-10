package svl;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

import dao.AlumnoDAO;

/**
 * Servlet implementation class svlPassword
 */
public class svlPassword extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public svlPassword() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */

    protected void proccesRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       	
       	AlumnoDAO dao = new AlumnoDAO();
       	response.setCharacterEncoding("UTF-8");
       	HttpSession session = request.getSession();
       	
       	String antigua = request.getParameter("txtantiguacontra");
   		String nuevaContra=request.getParameter("txtNuevaContra");
   		String id=request.getParameter("txtId");
   			
   		int idx=Integer.parseInt(id);
   		
   		dao.cambiarContrasena(idx, antigua, nuevaContra);
   	
   		
   		
   	
   		response.sendRedirect("update.jsp");

   		
   		
   		
   	
   			
   		}
   		
   	
       
   	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
   	
   		proccesRequest(request, response);	}


   	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
   		
   		proccesRequest(request, response);
   	}

}
