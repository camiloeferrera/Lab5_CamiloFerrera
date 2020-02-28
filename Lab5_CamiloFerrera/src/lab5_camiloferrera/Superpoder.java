package lab5_camiloferrera;

public class Superpoder {
    private int niveldepoder;
    private String descripcion;
    private boolean mortal;

    public Superpoder(int niveldepoder, String descripcion, boolean mortal) {
        this.niveldepoder = niveldepoder;
        this.descripcion = descripcion;
        this.mortal = mortal;
    }

    public int getNiveldepoder() {
        return niveldepoder;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public boolean isMortal() {
        return mortal;
    }

    public void setNiveldepoder(int niveldepoder) {
        this.niveldepoder = niveldepoder;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public void setMortal(boolean mortal) {
        this.mortal = mortal;
    }

    @Override
    public String toString() {
        return descripcion;
    }
    
    
}
