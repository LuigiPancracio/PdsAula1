package Modelo;

public class CalRetangulo {
	public float CalcularP(float Altura, float Base) {
		float PerimetroCal = 2 * (Altura + Base);
		return PerimetroCal;
	}
	public float CalcularA(float Altura, float Base) {
		float AlturaCal = Altura * Base;
		return AlturaCal;
	}
}
