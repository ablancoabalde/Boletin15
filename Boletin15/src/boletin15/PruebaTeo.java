package boletin15;

public class PruebaTeo {

    private float notaPT;

    public PruebaTeo() {
    }

    public float getNotaPT() {
        return notaPT;
    }
    
    public float CalcPT(float nota1, float nota2) {
        float media=(nota1+nota2)/2;
       return notaPT=(media*40)/100;
        
    }

}
