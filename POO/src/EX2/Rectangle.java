/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex2;

/**
 *
 * @author aco9500
 */
public class Rectangle {
    //atributs
    private double base;
    private double altura;
    //constructor
    public Rectangle(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    //getters i setters

    public double getBase() {
        return base;
    }
    public void setBase(double base) {
        if(base<=0){
            System.out.println("La base no pot ser negativa o 0!");
        }else{
            this.base = base;
        }
    }
    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        if(altura<=0){
            System.out.println("La altura no pot ser negativa o 0!");
        }else{
            this.altura = altura;
        }
    }
    //EQUALS
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + (int) (Double.doubleToLongBits(this.base) ^ (Double.doubleToLongBits(this.base) >>> 32));
        hash = 23 * hash + (int) (Double.doubleToLongBits(this.altura) ^ (Double.doubleToLongBits(this.altura) >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Rectangle other = (Rectangle) obj;
        if (Double.doubleToLongBits(this.base) != Double.doubleToLongBits(other.base)) {
            return false;
        }
        return Double.doubleToLongBits(this.altura) == Double.doubleToLongBits(other.altura);
    }
    //to String

    @Override
    public String toString() {
        return "Rectangle{" + "base=" + base + ", altura=" + altura + '}';
    }
    
    //metodes
    public double area(){
        return base*altura;
    }
    public double perimetre(){
        return 2*base+2*altura;
    }
    
    
    
    
}
