package ec.edu.ups.dao;

import java.util.List;

import ec.edu.ups.entidades.Libro;

public interface GenericDAO <T, ID> {
	public boolean create(T entity);

	public T read(ID id);
	
	public void update(T entity);

	public void delete(T entity);

	public List<T> find();
	
	public List<Libro> findByNombreAutor(String autor);
	
	public List<Libro> findByTitCapitulo(String capitulo);
}
