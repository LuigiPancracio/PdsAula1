package modelo;

public class CalculoGas {
	
	public float calcularG(float Saldo, float PrecoGas) {
		float GasolinaCalculada = (PrecoGas/Saldo);
		return GasolinaCalculada;
	}
}