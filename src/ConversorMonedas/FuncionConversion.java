package ConversorMonedas;
import javax.swing.*;

public class FuncionConversion {

    public void ConvertirMonedas(double Minput) {
        String[] opciones = {"De Soles a Dólar", "De Soles a Euro", "De Soles a Libras",
                "De Soles a Yen", "De Soles a Won Coreano",
                "De Dólar a Soles", "De Euro a Soles", "De Libras a Soles",
                "De Yen a Soles", "De Won Coreano a Soles"};

        JComboBox<String> comboBox = new JComboBox<>(opciones);

        String mensaje = "";
        int result = JOptionPane.showConfirmDialog(null, comboBox, "Monedas", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
        if (result == JOptionPane.OK_OPTION) {
            int index = comboBox.getSelectedIndex();
            double resultado = 0;
            switch (index) {
                case 0:
                    resultado = Minput / 3.78;
                    mensaje = "Tienes $ " + resultado + " Soles";
                    break;
                case 1:
                    resultado = Minput / 4.10;
                    mensaje = "Tienes $ " + resultado + " Soles";
                    break;
                case 2:
                    resultado = Minput / 4.63;
                    mensaje = "Tienes $ " + resultado + " Soles";
                    break;
                case 3:
                    resultado = Minput / 0.029;
                    mensaje = "Tienes $ " + resultado + " Soles";
                    break;
                case 4:
                    resultado = Minput / 0.0029;
                    mensaje = "Tienes $ " + resultado + " Soles";
                    break;
                case 5:
                    resultado = Minput * 3.78;
                    mensaje = "Tienes S/ " + resultado;
                    break;
                case 6:
                    resultado = Minput * 4.10;
                    mensaje = "Tienes S/ " + resultado;
                    break;
                case 7:
                    resultado = Minput * 4.63;
                    mensaje = "Tienes S/ " + resultado;
                    break;
                case 8:
                    resultado = Minput * 0.029;
                    mensaje = "Tienes S/ " + resultado;
                    break;
                case 9:
                    resultado = Minput * 0.0029;
                    mensaje = "Tienes S/ " + resultado;
                    break;
                default:
                    mensaje = "No se seleccionó una opción válida";
                    break;
            }
            JOptionPane.showMessageDialog(null, mensaje);
        }
    }
}