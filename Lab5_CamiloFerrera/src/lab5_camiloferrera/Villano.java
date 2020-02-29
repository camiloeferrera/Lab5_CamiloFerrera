package lab5_camiloferrera;

import java.util.ArrayList;

public class Villano {
    private String nombre, planeta;
    private int edad, muertescausadas;
    private double altura;
    private boolean preso;
    ArrayList<Superpoder> superpoderes = new ArrayList();

    public Villano(String nombre, String planeta, int edad, double altura, int muertescausadas, boolean preso) {
        this.nombre = nombre;
        this.planeta = planeta;
        this.edad = edad;
        this.altura = altura;
        this.muertescausadas = muertescausadas;
        this.preso = preso;
    }

    public String getNombre() {
        return nombre;
    }
    public String getPlaneta() {
        return planeta;
    }
    public int getEdad() {
        return edad;
    }
    public double getAltura() {
        return altura;
    }
    public int getMuertescausadas() {
        return muertescausadas;
    }
    public boolean isPreso() {
        return preso;
    }
    public ArrayList<Superpoder> getSuperpoderes() {
        return superpoderes;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setPlaneta(String planeta) {
        this.planeta = planeta;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    public void setMuertescausadas(int muertescausadas) {
        this.muertescausadas = muertescausadas;
    }
    public void setPreso(boolean preso) {
        this.preso = preso;
    }
    public void setSuperpoderes(ArrayList<Superpoder> superpoderes) {
        this.superpoderes = superpoderes;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
    
}
