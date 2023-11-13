package modelo;

public class Retangulo {
	
	public float calcularA(float Base, float Altura) {
		float AreaCalculada = (Base * Altura);
		return AreaCalculada;
	}
	public float calcularP(float Base, float Altura) {
		float PerimetroCalculado = 2 * (Altura + Base);
		return PerimetroCalculado;
		
	}
}