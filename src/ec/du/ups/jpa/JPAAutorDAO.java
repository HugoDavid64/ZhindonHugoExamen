package ec.du.ups.jpa;

import ec.edu.ups.dao.AutorDAO;
import ec.edu.ups.entidades.Autor;

public class JPAAutorDAO extends JPAGenericDAO<Autor, String> implements AutorDAO{

	public JPAAutorDAO() {
		// TODO Auto-generated constructor stub
		super(Autor.class);
	}

}
