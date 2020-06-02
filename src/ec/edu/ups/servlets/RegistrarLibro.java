package ec.edu.ups.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ec.edu.ups.dao.DAOFactory;
import ec.edu.ups.dao.LibroDAO;
import ec.edu.ups.entidades.Libro;

/**
 * Servlet implementation class RegistrarLibro
 */
@WebServlet("/RegistrarLibro")
public class RegistrarLibro extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegistrarLibro() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nombre = "";
		String ISBN = "";
		String conver;
		int paginas = 0;
		
		nombre = request.getParameter("names").toLowerCase();
		ISBN = request.getParameter("isbn");
		conver = request.getParameter("pages");
		paginas = Integer.parseInt(conver);
		
		
		LibroDAO libroDAO = DAOFactory.getDAOFactory().geLibroDAO();
		
		Libro libro = new Libro(nombre, ISBN, paginas);
		
		if(libroDAO.create(libro) == true) {
			System.out.println("Libro Creado");
			System.out.println("nombre" + nombre + "ISBN"+ISBN+ "paginas"+paginas);
			response.sendRedirect("Public/index.html");
		}else {
			System.out.println("No se ingreso el libro");
			response.sendRedirect("Public/index.html");
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
