package ConversorMonedas;

import javax.swing.JOptionPane;

public class ConversorMonedasASoles {
	private static final double TIPO_CAMBIO_DOLAR = 3.78;
	private static final double TIPO_CAMBIO_EURO = 4.10;
	private static final double TIPO_CAMBIO_LIBRA = 4.63;
	private static final double TIPO_CAMBIO_YEN = 0.029;
	private static final double TIPO_CAMBIO_WON = 0.0029;

	public void ConvertirDolaresASoles(double valor) {
		double monedaSoles = valor * TIPO_CAMBIO_DOLAR;
		monedaSoles = Math.round(monedaSoles * 100d) / 100d;
		JOptionPane.showMessageDialog(null, "Tienes S/ " + monedaSoles);
	}

	public void ConvertirEurosASoles(double valor) {
		double monedaSoles = valor * TIPO_CAMBIO_EURO;
		monedaSoles = Math.round(monedaSoles * 100d) / 100d;
		JOptionPane.showMessageDialog(null, "Tienes S/ " + monedaSoles);
	}

	public void ConvertirLibrasASoles(double valor) {
		double monedaSoles = valor * TIPO_CAMBIO_LIBRA;
		monedaSoles = Math.round(monedaSoles * 100d) / 100d;
		JOptionPane.showMessageDialog(null, "Tienes S/ " + monedaSoles);
	}

	public void ConvertirYenASoles(double valor) {
		double monedaSoles = valor * TIPO_CAMBIO_YEN;
		monedaSoles = Math.round(monedaSoles * 100d) / 100d;
		JOptionPane.showMessageDialog(null, "Tienes S/ " + monedaSoles);
	}

	public void ConvertirWonASoles(double valor) {
		double monedaSoles = valor * TIPO_CAMBIO_WON;
		monedaSoles = Math.round(monedaSoles * 100d) / 100d;
		JOptionPane.showMessageDialog(null, "Tienes S/ " + monedaSoles);
	}
}