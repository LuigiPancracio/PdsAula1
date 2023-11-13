package Model;

public class Investimento {

	private int meses;
	 private double juros;
	 private double deposito_mensal;

	 public Investimento(int a, double j, double dm) {
	 meses = a;
	 juros = j/100;
	 deposito_mensal = dm;
	 }

	 public double calculaTotal() {
	 int num_pagamentos = meses;
	 double total = 0;
	 for (int i = 0; i < num_pagamentos; i++) {
	 total = total + deposito_mensal;
	 total = total + total * juros;
	 }
	 return total;
	 }
	}

