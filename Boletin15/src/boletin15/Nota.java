package boletin15;

import javax.swing.JOptionPane;

public class Nota {

    private float notaM1;
    private float notaM2;
    private float notaPP;
    private float boletines;
    private float notaFinal;
    PruebaTeo notT=new PruebaTeo();
    PruebaPrac notP=new PruebaPrac();
    Boletines bol=new Boletines();
    boolean confirmar=false;

    public Nota() {
    }

    public Nota(float notaM1, float notaM2, float notaPP, float boletines) {
        this.notaM1=notaM1;
        this.notaM2=notaM2;
        this.notaPP=notaPP;
        do {

            if (boletines>17 ) {
                JOptionPane.showMessageDialog(null, "Máximo numero de boletines 17");
               boletines= Float.parseFloat(JOptionPane.showInputDialog(null, "Nota boletines"));
            } else {
                this.boletines=boletines;
                confirmar=true;
            }
        } while (confirmar==false);

    }

    public void CalcNota() {

        notaFinal=notT.CalcPT(notaM1, notaM2)+notP.CalcPP(notaPP)+bol.CalcBoletins(boletines);

    }

    @Override
    public String toString() {
        return "Pruebas teóricas: "+notT.getNotaPT()+"\n Pruebas prácticas: "+notP.getNotaPP()+"\n Boletines: "+ bol.getBoletins() +"\n nota final"+notaFinal;
    }

}
