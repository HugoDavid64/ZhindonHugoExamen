package ec.du.ups.jpa;

import java.util.List;

import ec.edu.ups.dao.LibroDAO;
import ec.edu.ups.entidades.*;


public class JPALibroDAO extends JPAGenericDAO<Libro, String> implements LibroDAO{

	
	public JPALibroDAO() {
		super(Libro.class);
	}
	

}
