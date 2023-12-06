package model;

public class Calculos {
	public float valorDiesel,valorComum,valorAditiv,valorEtanool,valor500ml,valor1L,q500ml,q1L,t500ml,t1L,tComb,tOleo;
	public String TT;
	
	public String Diesel(float qL)
	{
		String valorTotal=String.valueOf(valorDiesel*qL);
		tComb=Float.valueOf(valorTotal);
		return valorTotal;
	}
	public String Comum(float qL)
	{
		String valorTotal=String.valueOf(valorComum*qL);
		return valorTotal;
	}
	public String Aditivada(Float qL)
	{
		String valorTotal=String.valueOf(valorAditiv*qL);
		tComb=Float.valueOf(valorTotal);
		return valorTotal;
	}
	public String Etanol(float qL)
	{
		String valorTotal=String.valueOf(valorEtanool*qL);
		tComb=Float.valueOf(valorTotal);
		return valorTotal;
	}
	public String c500ml()
	{
		String valorTotal=String.valueOf(q500ml*valor500ml);
		t500ml=Float.valueOf(valorTotal);
		return valorTotal;
	}
	public String c1L()
	{
		String valorTotal=String.valueOf(q1L*valor1L);
		t1L= Float.valueOf(valorTotal);
		return valorTotal;
	}
	public String totalOleo()
	{
		String valorTotal=String.valueOf(t500ml+t1L);
		tOleo=Float.valueOf(valorTotal);
		return valorTotal;
	}
	public String TotalpagarVista()
	{
		String total=String.valueOf((tComb+tOleo)-((tComb+tOleo)*0.10));
		TT=total;
		return total;
	}
	public String totalPagarPrazo()
	{
		
		String total=String.valueOf((tComb+tOleo));
		return total;
	}
	public String totalPagarPrazo30()
	{
		String total=String.valueOf((tComb+tOleo)+((tComb+tOleo)*0.10));
		return total;
	}
}
