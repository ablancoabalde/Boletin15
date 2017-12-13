package boletin15;

import javax.swing.JOptionPane;

public class Boletin15 {

    public static void main(String[] args) {
        
     int respuesta= 0;
        
     while(respuesta==0){
                 Nota vl=new Nota(
                Float.parseFloat(JOptionPane.showInputDialog(null, "Nota 1º teórico")),
                Float.parseFloat(JOptionPane.showInputDialog(null, "Nota 2º teórico")),
                Float.parseFloat(JOptionPane.showInputDialog(null, "Nota Practico")),
                Float.parseFloat(JOptionPane.showInputDialog(null, "Nota boletines")));
        vl.CalcNota();
        JOptionPane.showMessageDialog(null, vl.toString());
        respuesta=  JOptionPane.showConfirmDialog(null, "Quiere calcular otra nota?");
     }
     

      
    }

}
