package sesion02_mul_a;

public class Polar {
    private float radio;
    private float angulo;  // en radianes

    public Polar(float radio, float angulo) {
        this.radio = radio;
        this.angulo = (float)Math.toRadians(angulo);
    }

    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }

    public float getAngulo() {
        return angulo;
    }

    public void setAngulo(float angulo) {
        this.angulo = angulo;
    }
}
