package modelo;

public class PrecoMarmita {
	
	public float Calculo(float preco, float peso)
	{
		float precoFinal = (float) ((peso * preco));
		
		return precoFinal;
	}

}