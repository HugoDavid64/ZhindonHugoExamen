package ec.edu.ups.dao;

import ec.du.ups.jpa.JPADAOFactory;

public abstract class DAOFactory {

	protected static DAOFactory factory = new JPADAOFactory();
	
	public static DAOFactory getDAOFactory() {
		// TODO Auto-generated constructor stub
		return factory;
	}
	
	public abstract LibroDAO geLibroDAO();
	
	public abstract CapituloDAO geCapituloDAO();
	
	public abstract AutorDAO getAutorDAO();


}
