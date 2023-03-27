package ConversorMonedas;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class ConversorMonedas {

	private DecimalFormat formatoDecimal = new DecimalFormat("#.##");

	private double redondear(double valor) {
		return Double.parseDouble(formatoDecimal.format(valor));
	}

	private void mostrarResultado(double resultado, String moneda) {
		JOptionPane.showMessageDialog(null, "Tienes " + moneda + " " + resultado);
	}

	public void ConvertirSolesADolares(double valor) {
		double resultado = valor / 3.78;
		mostrarResultado(redondear(resultado), "Dolares");
	}

	public void ConvertirSolesAEuros(double valor) {
		double resultado = valor / 4.10;
		mostrarResultado(redondear(resultado), "Euros");
	}

	public void ConvertirSolesALibras(double valor) {
		double resultado = valor / 4.63;
		mostrarResultado(redondear(resultado), "Libras Esterlinas");
	}

	public void ConvertirSolesAYen(double valor) {
		double resultado = valor / 0.029;
		mostrarResultado(redondear(resultado), "Yenes");
	}

	public void ConvertirSolesAWon(double valor) {
		double resultado = valor / 0.0029;
		mostrarResultado(redondear(resultado), "Wons");
	}

}