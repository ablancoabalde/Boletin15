package boletin15;

public class Boletines {

    private float boletins;

    public Boletines() {
    }

    public float getBoletins() {
        return boletins;
    }

    public float CalcBoletins(float cBoletines) {
        float porcentaje;
        porcentaje=(cBoletines*100)/17;
        if (porcentaje>=90) {
            return boletins=2;
        } else if (porcentaje>=70||porcentaje<90) {
            return boletins=1;
        } else {
            return boletins=0;
        }
    }

}
