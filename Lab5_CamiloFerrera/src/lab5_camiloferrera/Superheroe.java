package lab5_camiloferrera;

import java.util.ArrayList;

public class Superheroe {
    private String nombre, planeta;
    private int edad, altura, villanosatrapados = 0;
    private ArrayList <Superpoder> superpoderes = new ArrayList();

    public Superheroe(String nombre, String planeta, int edad, int altura) {
        this.nombre = nombre;
        this.planeta = planeta;
        this.edad = edad;
        this.altura = altura;
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
    public int getAltura() {
        return altura;
    }
    public int getVillanosatrapados() {
        return villanosatrapados;
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
    public void setAltura(int altura) {
        this.altura = altura;
    }
    public void setVillanosatrapados(int villanosatrapados) {
        this.villanosatrapados = villanosatrapados;
    }
    public void setSuperpoderes(ArrayList<Superpoder> superpoderes) {
        this.superpoderes = superpoderes;
    }
    
    
}
