package sesion02_mul_a;

public class Esferica {
    private float radioS;
    private float angulox;
    private float anguloz;

    public Esferica() {
   
    }
    
    public Esferica(float radioS, float angulox, float anguloz) {
        this.radioS = radioS;
        this.angulox = (float)Math.toRadians(angulox);
        this.anguloz = (float)Math.toRadians(anguloz);
    }
    
    public Esferica cilincrica_esferica(float radio, float angulo, float z){
        float p=(float)Math.sqrt(Math.pow(z, 2)+Math.pow(radio, 2));
        return new Esferica(p, angulo,(float)Math.toDegrees(Math.acos(z/p)));
    }
    
    public Cilindrica esferica_cilindrica(float radioS, float angulox, float anguloz){
        float p=(float)Math.sqrt(Math.pow(radioS, 2)*Math.sin(anguloz));
        return new Cilindrica(p, angulox,radioS*(float)Math.cos(anguloz));
    }

    public float getRadioS() {
        return radioS;
    }

    public void setRadioS(float radioS) {
        this.radioS = radioS;
    }

    public float getAngulox() {
        return angulox;
    }

    public void setAngulox(float angulox) {
        this.angulox = angulox;
    }

    public float getAnguloz() {
        return anguloz;
    }

    public void setAnguloz(float anguloz) {
        this.anguloz = anguloz;
    }
    
    
    
    
}
