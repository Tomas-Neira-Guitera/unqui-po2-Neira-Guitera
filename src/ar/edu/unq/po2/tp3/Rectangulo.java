package ar.edu.unq.po2.tp3;

public class Rectangulo {
	
	private int ancho;
	private int largo;
	private Punto esquinaSuperiorIzquierda;
	private Punto esquinaSuperiorDerecha;
	private Punto esquinaInferiorIzquierda;
	private Punto esquinaInferiorDerecha;
	
	public Rectangulo(Punto puntoBase, int largo, int ancho) {
			
			setEsquinaSuperiorIzquierda(puntoBase);
			setEsquinaSuperiorDerecha(new Punto(puntoBase.getX() + largo, puntoBase.getY()));
			setEsquinaInferiorIzquierda(new Punto(puntoBase.getX(), puntoBase.getY() - ancho));
			setEsquinaInferiorDerecha(new Punto(puntoBase.getX() + largo, puntoBase.getY() - ancho));
			this.ancho = ancho;
			this.largo = largo;
				
	}
	
	public Punto getEsquinaSuperiorIzquierda() {
		return esquinaSuperiorIzquierda;
	}

	public void setEsquinaSuperiorIzquierda(Punto esquinaSuperiorIzquierda) {
		this.esquinaSuperiorIzquierda = esquinaSuperiorIzquierda;
	}

	public Punto getEsquinaSuperiorDerecha() {
		return esquinaSuperiorDerecha;
	}

	public void setEsquinaSuperiorDerecha(Punto esquinaSuperiorDerecha) {
		this.esquinaSuperiorDerecha = esquinaSuperiorDerecha;
	}

	public Punto getEsquinaInferiorIzquierda() {
		return esquinaInferiorIzquierda;
	}

	public void setEsquinaInferiorIzquierda(Punto esquinaInferiorIzquierda) {
		this.esquinaInferiorIzquierda = esquinaInferiorIzquierda;
	}

	public Punto getEsquinaInferiorDerecha() {
		return esquinaInferiorDerecha;
	}

	public void setEsquinaInferiorDerecha(Punto esquinaInferiorDerecha) {
		this.esquinaInferiorDerecha = esquinaInferiorDerecha;
	}

	public int areaDelRectangulo() {
		
		return ancho * largo;
	}
	
	public int perimetroDelRectangulo() {
		
		return 2 * (ancho + largo);
	}
	
	public boolean esVertical() {
		
		return ancho > largo;
	}
	
	public boolean esHorizontal() {
		
		return largo > ancho;
	}
}
