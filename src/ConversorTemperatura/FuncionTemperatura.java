package ConversorTemperatura;

import javax.swing.JOptionPane;

public class FuncionTemperatura {
	
    ConversorTemperatura temperatura = new ConversorTemperatura();

    private final String[] OPCIONES_CONVERSION = {
        "Grados Celcius a Grados Farenheit", 
        "Grados Celcius a Kelvin", 
        "Grados Farenheit a Grados Celcius", 
        "Kelvin a Grados Celcius", 
        "Kelvin a Grados Farenheit"
    };

    public void ConvertirTemperatura(double temperaturaInput) {
        String opcion = (String) JOptionPane.showInputDialog(
            null,
            "Elije una opción para convertir",
            "Temperatura",
            JOptionPane.PLAIN_MESSAGE,
            null,
            OPCIONES_CONVERSION,
            OPCIONES_CONVERSION[0]
        );

        double temperaturaConvertida = convertirTemperatura(opcion, temperaturaInput);
        JOptionPane.showMessageDialog(null, "El resultado es: " + temperaturaConvertida);
    }

    private double convertirTemperatura(String opcion, double temperaturaInput) {
        switch(opcion) {
            case "Grados Celcius a Grados Farenheit":
                return ConversorTemperatura.convertirCelciusAFarenheit(temperaturaInput);
            case "Grados Celcius a Kelvin":
                return ConversorTemperatura.convertirCelciusAKelvin(temperaturaInput);
            case "Grados Farenheit a Grados Celcius":
                return ConversorTemperatura.convertirFarenheitACelcius(temperaturaInput);
            case "Kelvin a Grados Celcius":
                return ConversorTemperatura.convertirKelvinACelcius(temperaturaInput);
            case "Kelvin a Grados Farenheit":
                return ConversorTemperatura.convertirKelvinAFarenheit(temperaturaInput);
            default:
                throw new IllegalArgumentException("Opción de conversión inválida");
        }
    }
}