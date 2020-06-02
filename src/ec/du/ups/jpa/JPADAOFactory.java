package ec.du.ups.jpa;

import ec.edu.ups.dao.AutorDAO;
import ec.edu.ups.dao.CapituloDAO;
import ec.edu.ups.dao.DAOFactory;
import ec.edu.ups.dao.LibroDAO;

public class JPADAOFactory extends DAOFactory {

	@Override
	public LibroDAO geLibroDAO() {
		// TODO Auto-generated method stub
		return new JPALibroDAO();
	}

	@Override
	public CapituloDAO geCapituloDAO() {
		// TODO Auto-generated method stub
		return new JPACapituloDAO();
	}

	@Override
	public AutorDAO getAutorDAO() {
		// TODO Auto-generated method stub
		return new JPAAutorDAO();
	}

	

}
