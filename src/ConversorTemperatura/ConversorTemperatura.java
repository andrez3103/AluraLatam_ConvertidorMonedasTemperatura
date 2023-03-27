package ConversorTemperatura;

public class ConversorTemperatura {
	
	public static double convertirCelciusAFarenheit(double valor) {
		double farenheit = valor * 1.8 + 32;
    	return redondear(farenheit);
	}
	
	public static double convertirCelciusAKelvin(double valor){
		double kelvin = valor + 273.15;
        return redondear(kelvin);
	}
	
	public static double convertirFarenheitACelcius(double valor) {
		double celcius = (valor - 32) / 1.8;
        return redondear(celcius);
	}
	
	public static double convertirKelvinACelcius(double valor) {
		 double kelvinCelcius = valor - 273.15;
         return redondear(kelvinCelcius);
	}
	
	public static double convertirKelvinAFarenheit(double valor) {
		double celcius = convertirKelvinACelcius(valor);
		double farenheit = convertirCelciusAFarenheit(celcius);
		return redondear(farenheit);
	}
	
	private static double redondear(double valor) {
		return (double) Math.round(valor * 100d) / 100;
	}
}