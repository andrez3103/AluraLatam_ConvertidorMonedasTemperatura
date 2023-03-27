package ConversorApp;

import javax.swing.JOptionPane;

import ConversorMonedas.FuncionConversion;
import ConversorTemperatura.FuncionTemperatura;

public class ConversorAppSalida {
    public static void main (String[] args) {
        FuncionConversion monedas = new FuncionConversion();
        FuncionTemperatura temperatura = new FuncionTemperatura();
             
        while (true) {
        	String opciones = (String) JOptionPane.showInputDialog(null,
                "Seleccione una opción de conversión", "Menu",
                JOptionPane.QUESTION_MESSAGE, null, new Object[] {
                    "Conversor de Moneda", "Conversor de Temperatura", "Salir"
                }, "Conversor de Monedas");

        	if (opciones == null || opciones.equals("Salir")) {
        		JOptionPane.showMessageDialog(null, "Programa terminado");
        		break;
        	}

        	switch (opciones) {
        	case "Conversor de Moneda":
        		String input = JOptionPane.showInputDialog("Ingresa la cantidad de dinero que deseas convertir:");
        		if (ValidarNumero(input)) {
        			double Minput = Double.parseDouble(input);
        			monedas.ConvertirMonedas(Minput);

        			int respuesta = JOptionPane.showConfirmDialog(null, "¿Deseas realizar otra conversión?");
        			if (respuesta == JOptionPane.YES_OPTION) {
        				System.out.println("Selecciona opción afirmativa");
        			} else {
        				JOptionPane.showMessageDialog(null, "Programa terminado");
        				break;
        			}
        		} else {
        			JOptionPane.showMessageDialog(null, "Valor inválido");
        		}
        		break;

        	case "Conversor de Temperatura":
        		input = JOptionPane.showInputDialog("Ingresa el valor de la temperatura que deseas convertir:");
        		if (ValidarNumero(input)) {
        			double Tinput = Double.parseDouble(input);
        			temperatura.ConvertirTemperatura(Tinput);

        			int respuesta = JOptionPane.showConfirmDialog(null, "¿Desea continuar?");
        			if (respuesta != JOptionPane.YES_OPTION) {
        				JOptionPane.showMessageDialog(null, "Programa terminado");
        				break;
        			}
        		} else {
        			JOptionPane.showMessageDialog(null, "Valor inválido");
        		}
        		break;
        	}
        }              
    }

    public static boolean ValidarNumero(String input) {
        try {
            double x = Double.parseDouble(input);
            if(x >= 0 || x < 0);
                return true;
            } catch (NumberFormatException e) {
                return false;
            }
    }
}