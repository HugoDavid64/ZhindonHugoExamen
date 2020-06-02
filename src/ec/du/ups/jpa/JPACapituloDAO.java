package ec.du.ups.jpa;

import ec.edu.ups.dao.CapituloDAO;
import ec.edu.ups.entidades.Capitulo;

public class JPACapituloDAO extends JPAGenericDAO<Capitulo, String> implements CapituloDAO {

	public JPACapituloDAO() {
		super(Capitulo.class);
	}

}
