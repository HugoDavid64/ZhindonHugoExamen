package ec.edu.ups.servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ec.edu.ups.dao.DAOFactory;
import ec.edu.ups.dao.LibroDAO;
import ec.edu.ups.entidades.Libro;
import src.ec.edu.ups.controlador.String;

/**
 * Servlet implementation class ListarLibros
 */
@WebServlet("/ListarLibros")
public class ListarLibros extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private LibroDAO libroDao;
	private List<Libro> listaLibros;
       

    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListarLibros() {
    	libroDao = DAOFactory.getDAOFactory().geLibroDAO();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String url = null;
		try {
			listaLibros = libroDao.find();
			request.setAttribute("Libs", listaLibros);
			url = "/Public/AgregarCapitulo.jsp";
		}catch(Exception e){
			
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
