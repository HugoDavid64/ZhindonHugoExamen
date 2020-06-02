package ec.edu.ups.entidades;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
@Entity
public class Capitulo implements Serializable{
	
private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int codigo;
	private int numCapitulo;
	private String titulo;
	@ManyToOne
	@JoinColumn
	private Libro libro;

	public Capitulo() {
		// TODO Auto-generated constructor stub
	}
	
	public Capitulo(int numCapitulo, String titulo) {
		super();
		this.numCapitulo = numCapitulo;
		this.titulo = titulo;
		
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public int getNumCapitulo() {
		return numCapitulo;
	}

	public void setNumCapitulo(int numCapitulo) {
		this.numCapitulo = numCapitulo;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Libro getLibro() {
		return libro;
	}

	public void setLibro(Libro libro) {
		this.libro = libro;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Capitulo [codigo=").append(codigo).append(", numCapitulo=").append(numCapitulo)
				.append(", titulo=").append(titulo).append("]");
		return builder.toString();
	}
	
	

}
