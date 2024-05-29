package ar.edu.unq.po2.tpObserver;

import java.util.List;

public class Articulo {


	String titulo;
	String autores;
	String filiacion;
	String lugarDePublicacion;
	List<String> palabrasClave;

	public Articulo(String t, String a, String f, String l, List<String> p) {
		
		titulo = t;
		autores = a;
		filiacion = f;
		lugarDePublicacion = l;
		palabrasClave = p;
	}
	
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutores() {
		return autores;
	}

	public void setAutores(String autores) {
		this.autores = autores;
	}

	public String getFiliacion() {
		return filiacion;
	}

	public void setFiliacion(String filiacion) {
		this.filiacion = filiacion;
	}

	public String getLugarDePublicacion() {
		return lugarDePublicacion;
	}

	public void setLugarDePublicacion(String lugarDePublicacion) {
		this.lugarDePublicacion = lugarDePublicacion;
	}

	public List<String> getPalabrasClave() {
		return palabrasClave;
	}

	public void setPalabrasClave(List<String> palabrasClave) {
		this.palabrasClave = palabrasClave;
	}
}

